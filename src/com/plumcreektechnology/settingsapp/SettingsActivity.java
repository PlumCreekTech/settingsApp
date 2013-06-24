/**
 * 
 */
package com.plumcreektechnology.settingsapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;

/**
 * @author devinfrenze
 *
 */
public class SettingsActivity extends PreferenceActivity {
	
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		
		// Display the fragment as the main content.
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
	}
	
}
