/**
 * 
 */
package com.plumcreektechnology.settingsapp;

import android.os.Bundle;
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
