/**
 * 
 */
package com.plumcreektechnology.settingsapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * @author devinfrenze
 *
 */
public class SettingsFragment extends PreferenceFragment implements
		OnSharedPreferenceChangeListener {

	//public static final String KEY = "CheckBox";
	
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		
		addPreferencesFromResource(R.layout.preferences);
	}
	
	public void onPause() {
		super.onPause();	
		getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
	}
	
	public void onResume() {
		super.onResume();
		getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
	}

	
	/* (non-Javadoc)
	 * @see android.content.SharedPreferences.OnSharedPreferenceChangeListener#onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String)
	 */
	@Override
	public void onSharedPreferenceChanged(SharedPreferences shared, String key) {
	/*	if(key.equals(KEY)) {
			Preference prefer = findPreference(key);
			prefer.setSummary(shared.getString(key, ""));
		}*/
	}

}
