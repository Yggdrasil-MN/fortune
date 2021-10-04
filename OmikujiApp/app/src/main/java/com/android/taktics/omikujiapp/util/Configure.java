package com.android.taktics.omikujiapp.util;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

public class Configure{
    static private String getUserName(final Context context) {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
        String userName = pref.getString(Const.INFO_USER_NAME,null);
        return userName;
    }

    static private void setUserName(Context context, String userName) {
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(Const.INFO_USER_NAME,userName);
        editor.commit();
    }
}
