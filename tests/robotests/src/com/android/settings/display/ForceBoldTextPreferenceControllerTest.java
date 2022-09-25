/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.display;

import static com.google.common.truth.Truth.assertThat;

import android.content.Context;
import android.provider.Settings;

import androidx.preference.SwitchPreference;

import com.android.settings.core.BasePreferenceController;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

@RunWith(RobolectricTestRunner.class)
public class ForceBoldTextPreferenceControllerTest {
    private static final int ON = 2;
    private static final int OFF = 1;
    private static final int UNKNOWN = 0;

    private Context mContext;
    private SwitchPreference mPreference;
    private ForceBoldTextPreferenceController mController;

    @Before
    public void setUp() {
        mContext = RuntimeEnvironment.application;
        mPreference = new SwitchPreference(mContext);
        mController = new ForceBoldTextPreferenceController(mContext, "force_bold_text");
    }

    @Test
    public void getAvailabilityStatus_byDefault_shouldReturnAvailable() {
        assertThat(mController.getAvailabilityStatus()).isEqualTo(
                BasePreferenceController.AVAILABLE);
    }

    @Test
    public void isChecked_enabledTextContrast_shouldReturnTrue() {
        Settings.Secure.putInt(mContext.getContentResolver(),
                Settings.Secure.FORCE_BOLD_TEXT, ON);

        mController.updateState(mPreference);

        assertThat(mController.isChecked()).isTrue();
        assertThat(mPreference.isChecked()).isTrue();
    }

    @Test
    public void isChecked_disabledTextContrast_shouldReturnFalse() {
        Settings.Secure.putInt(mContext.getContentResolver(),
                Settings.Secure.FORCE_BOLD_TEXT, OFF);

        mController.updateState(mPreference);

        assertThat(mController.isChecked()).isFalse();
        assertThat(mPreference.isChecked()).isFalse();
    }

    @Test
    public void setChecked_setTrue_shouldEnableTextContrast() {
        mController.setChecked(true);

        assertThat(Settings.Secure.getInt(mContext.getContentResolver(),
                Settings.Secure.FORCE_BOLD_TEXT, UNKNOWN)).isEqualTo(ON);

    }

    @Test
    public void setChecked_setFalse_shouldDisableTextContrast() {
        mController.setChecked(false);

        assertThat(Settings.Secure.getInt(mContext.getContentResolver(),
                Settings.Secure.FORCE_BOLD_TEXT, UNKNOWN)).isEqualTo(OFF);
    }
}