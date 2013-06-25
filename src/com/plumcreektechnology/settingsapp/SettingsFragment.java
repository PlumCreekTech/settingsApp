/**
 * 
 */
package com.plumcreektechnology.settingsapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author devinfrenze
 *
 */
public class SettingsFragment extends PreferenceFragment implements
		OnSharedPreferenceChangeListener {

	//public static final String KEY = "CheckBox";
	CheckBox check;
	public final static String MSG = "com.plumcreektechnology.settingsapp.message";
	
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		
		addPreferencesFromResource(R.layout.preferences);
		
		check = (CheckBox) getActivity().findViewById(R.id.checkboxone);
//		if (check.isChecked()){
//			EditText etext = (EditText) getActivity().findViewById(R.id.textEdit);
//			Toast toast = Toast.makeText(getActivity(), "I'm checked!" /*etext.getText().toString()*/, Toast.LENGTH_LONG);
//			toast.show();
//		}
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
