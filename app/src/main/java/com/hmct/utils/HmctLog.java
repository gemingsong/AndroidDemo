package com.hmct.utils;

import android.util.Log;

public class HmctLog {
    private static final String TAG = "gmsdemo";

    public HmctLog() {
    }

    public static void d(String tag, String msg) {
        Log.d(TAG, "[" + tag + "]----" + msg);
    }
}
