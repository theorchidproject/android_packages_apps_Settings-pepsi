package com.palladium.atomichub;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.android.internal.logging.nano.MetricsProto;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import com.android.settings.SettingsPreferenceFragment;
import com.android.settings.R;
import com.android.settings.network.NetworkDashboardFragment;
import com.android.settings.connecteddevice.ConnectedDeviceDashboardFragment;
import com.android.settings.DisplaySettings;
import com.android.settings.display.TopLevelWallpaperPreferenceController;
import com.android.settings.applications.AppDashboardFragment;
import com.android.settings.notification.ConfigureNotificationSettings;
import com.android.settings.fuelgauge.PowerUsageSummary;
import com.android.settings.deviceinfo.StorageDashboardFragment;
import com.android.settings.notification.SoundSettings;
import com.android.settings.accessibility.AccessibilitySettings;
import com.android.settings.privacy.PrivacyDashboardFragment;
import com.android.settings.location.LocationSettings;
import com.android.settings.emergency.EmergencyDashboardFragment;
import com.android.settings.accounts.AccountDashboardFragment;
import com.android.settings.system.SystemDashboardFragment;
import com.android.settings.deviceinfo.aboutphone.MyDeviceInfoFragment;
public class Atomichub extends SettingsPreferenceFragment implements  View.OnClickListener{

    final String[] target = new String[1];
    FrameLayout c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16;
    LinearLayout c0;
    ImageView btnicon;
    TextView title,summary;
    HorizontalScrollView horizontalScrollView;
    ImageButton btntransistion;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.atomichub, container, false);
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        
        super.onViewCreated(view, savedInstanceState);
		getActivity().getActionBar().hide();        
        horizontalScrollView = view.findViewById(R.id.hsv_card);
        btntransistion = view.findViewById(R.id.btn_trans);
        btntransistion.setOnClickListener(this);
        btnicon = view.findViewById(R.id.img1_icon);
        title = view.findViewById(R.id.tv_title_big);
        summary = view.findViewById(R.id.tv_summary_big);
        c0 = view.findViewById(R.id.card);
        c1 = view.findViewById(R.id.card1);
        c1.setOnClickListener(this);
        c2 = view.findViewById(R.id.card2);
        c2.setOnClickListener(this);
        c3 = view.findViewById(R.id.card3);
        c3.setOnClickListener(this);
        c4 = view.findViewById(R.id.card4);
        c4.setOnClickListener(this);
        c5 = view.findViewById(R.id.card5);
        c5.setOnClickListener(this);
        c6 = view.findViewById(R.id.card6);
        c6.setOnClickListener(this);
        c7 = view.findViewById(R.id.card12);
        c7.setOnClickListener(this);
        c8 = view.findViewById(R.id.card21);
        c8.setOnClickListener(this);
        c9 = view.findViewById(R.id.card31);
        c9.setOnClickListener(this);
        c10 = view.findViewById(R.id.card41);
        c10.setOnClickListener(this);
        c11 = view.findViewById(R.id.card51);
        c11.setOnClickListener(this);
        c12 = view.findViewById(R.id.card61);
        c12.setOnClickListener(this);
        c13 = view.findViewById(R.id.card19);
        c13.setOnClickListener(this);
        c14 = view.findViewById(R.id.card18);
        c14.setOnClickListener(this);
        c15 = view.findViewById(R.id.card17);
        c15.setOnClickListener(this);
        c16 = view.findViewById(R.id.card16);
        c16.setOnClickListener(this);
        target[0] = "UI";


    }


    @Override
    public void onClick(View view) {

        int id = view.getId();

        if(id == R.id.card1){
            // NETWORK
            Drawable d,e;
            d = view.getResources().getDrawable(R.drawable.ic_ui_big_card);
            e = view.getResources().getDrawable(R.drawable.op_ic_homepage_network_settings);
            btnicon.setImageDrawable(e);
            c0.setBackground(d);
            title.setText(R.string.network_dashboard_title);
            target[0] = "NETWORK";
        }

        if(id == R.id.card2){
            // CONNECTED
            Drawable d,e;
            d = view.getResources().getDrawable(R.drawable.ic_theme_big_card);
            c0.setBackground(d);
            e = view.getResources().getDrawable(R.drawable.op_ic_homepage_connected_device_settings);
            btnicon.setImageDrawable(e);
            title.setText(R.string.connected_devices_dashboard_title);
            target[0] = "CONNECTED";
        }

        if(id == R.id.card3){
            // NOTIFICATION
            Drawable d,e;
            d = view.getResources().getDrawable(R.drawable.ic_status_big_card);
            c0.setBackground(d);
            e = view.getResources().getDrawable(R.drawable.op_ic_homepage_apps_settings );
            btnicon.setImageDrawable(e);
            title.setText(R.string.configure_notification_settings);
            target[0] = "NOTIFICATION";
        }

        if(id == R.id.card4){
            // DISPLAY
            Drawable d,e;
            d = view.getResources().getDrawable(R.drawable.ic_button_big_card);
            c0.setBackground(d);
            e = view.getResources().getDrawable(R.drawable.op_ic_homepage_display_settings);
            btnicon.setImageDrawable(e);
            title.setText(R.string.display_settings);
            summary.setText(R.string.display_dashboard_summary);
            target[0] = "DISPLAY";
        }

        if(id == R.id.card5){
            //  WALLPAPER
            Drawable d,e;
            d = view.getResources().getDrawable(R.drawable.ic_misc_big_card);
            c0.setBackground(d);
            e = view.getResources().getDrawable(R.drawable.op_ic_homepage_about_wallpaper);
            btnicon.setImageDrawable(e);
            title.setText(R.string.wallpaper_settings_title);
            target[0] = "WALLPAPER";
        }

        if(id == R.id.card6){
            // SOUND
            Drawable d,e;
            d = view.getResources().getDrawable(R.drawable.ic_team_big_card);
            c0.setBackground(d);
            e = view.getResources().getDrawable(R.drawable.op_ic_homepage_sound_settings);
            btnicon.setImageDrawable(e);
            title.setText(R.string.sound_settings);
            target[0] = "SOUND";
        }
        
        if(id == R.id.card12){
            // PRIVACY
            Drawable d,e;
            d = view.getResources().getDrawable(R.drawable.ic_ui_big_card);
            e = view.getResources().getDrawable(R.drawable.op_ic_homepage_privacy_settings);
            btnicon.setImageDrawable(e);
            c0.setBackground(d);
            title.setText(R.string.privacy_dashboard_title);
            target[0] = "PRIVACY";
        }

        if(id == R.id.card21){
            // APP SETTINGS
            Drawable d,e;
            d = view.getResources().getDrawable(R.drawable.ic_theme_big_card);
            c0.setBackground(d);
            e = view.getResources().getDrawable(R.drawable.op_ic_homepage_apps_settings);
            btnicon.setImageDrawable(e);
            title.setText(R.string.apps_dashboard_title);
            target[0] = "APPS";
        }

        if(id == R.id.card51){
            // SECURITY
            Drawable d,e;
            d = view.getResources().getDrawable(R.drawable.ic_status_big_card);
            c0.setBackground(d);
            e = view.getResources().getDrawable(R.drawable.op_ic_homepage_security_settings );
            btnicon.setImageDrawable(e);
            title.setText(R.string.security_settings_title);
            target[0] = "SECURITY";
        }

        if(id == R.id.card31){
            // ACCESS
            Drawable d,e;
            d = view.getResources().getDrawable(R.drawable.ic_button_big_card);
            c0.setBackground(d);
            e = view.getResources().getDrawable(R.drawable.op_ic_homepage_accessibility_settings);
            btnicon.setImageDrawable(e);
            title.setText(R.string.accessibility_settings);
            target[0] = "ACCESS";
        }

        if(id == R.id.card41){
            //  LOCATION
            Drawable d,e;
            d = view.getResources().getDrawable(R.drawable.ic_misc_big_card);
            c0.setBackground(d);
            e = view.getResources().getDrawable(R.drawable.op_ic_homepage_location_settings);
            btnicon.setImageDrawable(e);
            title.setText(R.string.location_settings_title);
            target[0] = "WALLPAPER";
        }

        if(id == R.id.card61){
            // ACCOUNTS
            Drawable d,e;
            d = view.getResources().getDrawable(R.drawable.ic_team_big_card);
            c0.setBackground(d);
            e = view.getResources().getDrawable(R.drawable.op_ic_homepage_accounts_settings);
            btnicon.setImageDrawable(e);
            title.setText(R.string.account_dashboard_title);
            target[0] = "ACCOUNTS";
        }

        if(id == R.id.card19){
            // STORAGE
            Drawable d,e;
            d = view.getResources().getDrawable(R.drawable.ic_theme_big_card);
            c0.setBackground(d);
            e = view.getResources().getDrawable(R.drawable.op_ic_homepage_storage_settings);
            btnicon.setImageDrawable(e);
            title.setText(R.string.storage_settings);
            target[0] = "STORAGE";
        }

        if(id == R.id.card18){
            // BATTERY
            Drawable d,e;
            d = view.getResources().getDrawable(R.drawable.ic_status_big_card);
            c0.setBackground(d);
            e = view.getResources().getDrawable(R.drawable.op_ic_homepage_battery_settings );
            btnicon.setImageDrawable(e);
            title.setText(R.string.power_usage_summary_title);
            target[0] = "BATTERY";
        }

        if(id == R.id.card17){
            // SYSTEM
            Drawable d,e;
            d = view.getResources().getDrawable(R.drawable.ic_button_big_card);
            c0.setBackground(d);
            e = view.getResources().getDrawable(R.drawable.op_ic_homepage_system_dashboard_settings);
            btnicon.setImageDrawable(e);
            title.setText(R.string.system_dashboard_summary);
            target[0] = "SYSTEM";
        }

        if(id == R.id.card16){
            //  SAFTEY
            Drawable d,e;
            d = view.getResources().getDrawable(R.drawable.ic_misc_big_card);
            c0.setBackground(d);
            e = view.getResources().getDrawable(R.drawable.op_ic_homepage_about_emergency);
            btnicon.setImageDrawable(e);
            title.setText(R.string.emergency_settings_preference_title);
            target[0] = "SAFTEY";
        }

        if(id == R.id.btn_trans){
            if(target[0].equals("NETWORK")){
                NetworkDashboardFragment destf = new NetworkDashboardFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction.replace(this.getId(), destf);
                transaction.addToBackStack(null);
                transaction.commit();
            }
            if(target[0].equals("CONNECTED")){
                ConnectedDeviceDashboardFragment destf = new ConnectedDeviceDashboardFragment();
                FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
                transaction1.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction1.replace(this.getId(), destf);
                transaction1.addToBackStack(null);
                transaction1.commit();

            }
            if(target[0].equals("NOTIFICATIONS")){
                ConfigureNotificationSettings destf = new ConfigureNotificationSettings();
                FragmentTransaction transaction2 = getFragmentManager().beginTransaction();
                transaction2.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction2.replace(this.getId(), destf);
                transaction2.addToBackStack(null);
                transaction2.commit();
            }
            if(target[0].equals("DISPLAY")){
                DisplaySettings destf = new DisplaySettings();
                FragmentTransaction transaction3 = getFragmentManager().beginTransaction();
                transaction3.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction3.replace(this.getId(), destf);
                transaction3.addToBackStack(null);
                transaction3.commit();
            }
            if(target[0].equals("WALLPAPER")){
                TopLevelWallpaperPreferenceController destf = new TopLevelWallpaperPreferenceController();
                FragmentTransaction transaction4 = getFragmentManager().beginTransaction();
                transaction4.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction4.replace(this.getId(), destf);
                transaction4.addToBackStack(null);
                transaction4.commit();
            }
            if(target[0].equals("SOUND")){
                SoundSettings destf = new SoundSettings();
                FragmentTransaction transaction5 = getFragmentManager().beginTransaction();
                transaction5.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction5.replace(this.getId(), destf);
                transaction5.addToBackStack(null);
                transaction5.commit();
            }
            if(target[0].equals("PRIVACY")){
                PrivacyDashboardFragment destf = new PrivacyDashboardFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction6.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction6.replace(this.getId(), destf);
                transaction6.addToBackStack(null);
                transaction6.commit();
            }
            if(target[0].equals("APPS")){
                AppDashboardFragment destf = new AppDashboardFragment();
                FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
                transaction7.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction7.replace(this.getId(), destf);
                transaction7.addToBackStack(null);
                transaction7.commit();

            }
            if(target[0].equals("SECURITY")){
                SecuritySettings destf = new SecuritySettings();
                FragmentTransaction transaction2 = getFragmentManager().beginTransaction();
                transaction8.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction8.replace(this.getId(), destf);
                transaction8.addToBackStack(null);
                transaction8.commit();
            }
            if(target[0].equals("ACCESS")){
                AccessibilitySettings destf = new AccessibilitySettings();
                FragmentTransaction transaction3 = getFragmentManager().beginTransaction();
                transaction9.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction9.replace(this.getId(), destf);
                transaction9.addToBackStack(null);
                transaction9.commit();
            }
            if(target[0].equals("LOCATION")){
                LocationSettings destf = new LocationSettings();
                FragmentTransaction transaction4 = getFragmentManager().beginTransaction();
                transaction10.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction10.replace(this.getId(), destf);
                transaction10.addToBackStack(null);
                transaction10.commit();
            }
            if(target[0].equals("ACCOUNTS")){
                AccountDashboardFragment destf = new AccountDashboardFragment();
                FragmentTransaction transaction5 = getFragmentManager().beginTransaction();
                transaction11.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction11.replace(this.getId(), destf);
                transaction11.addToBackStack(null);
                transaction11.commit();
            }
            if(target[0].equals("STORAGE")){
                StorageDashboardFragment destf = new StorageDashboardFragment();
                FragmentTransaction transaction1 = getFragmentManager().beginTransaction();
                transaction12.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction12.replace(this.getId(), destf);
                transaction12.addToBackStack(null);
                transaction12.commit();

            }
            if(target[0].equals("BATTERY")){
                PowerUsageSummary destf = new PowerUsageSummary();
                FragmentTransaction transaction2 = getFragmentManager().beginTransaction();
                transaction13.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction13.replace(this.getId(), destf);
                transaction13.addToBackStack(null);
                transaction13.commit();
            }
            if(target[0].equals("SYSTEM")){
                SystemDashboardFragment destf = new SystemDashboardFragment();
                FragmentTransaction transaction3 = getFragmentManager().beginTransaction();
                transaction14.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction14.replace(this.getId(), destf);
                transaction14.addToBackStack(null);
                transaction14.commit();
            }
            if(target[0].equals("SAFTEY")){
                EmergencyDashboardFragment destf = new EmergencyDashboardFragment();
                FragmentTransaction transaction4 = getFragmentManager().beginTransaction();
                transaction15.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                transaction15.replace(this.getId(), destf);
                transaction15.addToBackStack(null);
                transaction15.commit();
            }
            
        }

    }



    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.CUSTOM_SETTINGS;
    }



}