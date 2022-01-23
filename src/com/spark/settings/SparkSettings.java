package com.spark.settings;

import androidx.appcompat.app.AppCompatActivity;

import com.android.internal.logging.nano.MetricsProto;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Surface;
import android.preference.Preference;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Toast;
import android.view.View;
import android.util.Log;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.ComponentName;
import androidx.cardview.widget.CardView;

import com.android.settings.R;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;
import android.content.res.Resources;
import android.view.Window;

import com.spark.settings.fragments.ThemeSettings;

import com.android.settings.SettingsPreferenceFragment;

public class SparkSettings extends SettingsPreferenceFragment implements View.OnClickListener {

  CardView mThemeSettingsCard;




    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
		    getActivity().getActionBar().hide();

        mThemeSettingsCard = (CardView) view.findViewById(R.id.themesettings_card);
        mThemeSettingsCard.setOnClickListener(this);

        }

    @Override
    public void onClick(View view) {
        int id = view.getId();
            if (id == R.id.themesettings_card)
              {
                ThemeSettings themesettingsfragment = new ThemeSettings();
                FragmentTransaction transaction5 = getFragmentManager().beginTransaction();
                transaction1.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction1.replace(this.getId(), themesettingsfragment);
                transaction1.addToBackStack(null);
                transaction1.commit();
               }
    }

    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.CUSTOM_SETTINGS;
    }

}