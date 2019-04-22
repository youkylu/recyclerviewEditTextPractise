package com.source.practise.recycleviewedittextpractise;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * <p>Class: com.source.practise.recycleviewedittextpractise.SharedPreferenceService</p>
 * <p>Description: </p>
 * <pre>
 *
 *  </pre>
 *
 * @author lujunjie
 * @date 2019/4/19/14:09.
 */
@SuppressLint("CommitPrefEdits")
public class SharedPreferenceService {
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    private Context mContext = null;

    private static SharedPreferenceService manager = null;

    private SharedPreferenceService(Context context) {
        mContext = context.getApplicationContext();
        sp = mContext.getSharedPreferences("sys_setting", 0);
        editor = sp.edit();
    }

    public static SharedPreferenceService getInstance(Context context) {
        if (manager == null) {
            manager = new SharedPreferenceService(context);
        }
        return manager;
    }

    public static SharedPreferenceService getInstance() {
        return manager;
    }

    public void put(String key, String value) {
        editor.putString(key, value);
        editor.commit();
    }

    public void put(String key, int value) {
        editor.putInt(key, value);
        editor.commit();
    }

    public void put(String key, long value) {
        editor.putLong(key, value);
        editor.commit();
    }

    public void put(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.commit();
    }

    public String get(String key, String defValue) {
        return sp.getString(key, defValue);
    }

    public int get(String key, int defValue) {
        return sp.getInt(key, defValue);
    }

    public long get(String key, long defValue) {
        return sp.getLong(key, defValue);
    }

    public boolean get(String key, boolean defValue) {
        return sp.getBoolean(key, defValue);
    }
}
