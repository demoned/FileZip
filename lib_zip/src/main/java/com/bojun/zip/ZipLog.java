package com.bojun.zip;

import android.util.Log;

/**
 * 简  述  日志打印类
 * 作  者  demons
 * 类  名  ZipLog
 * 时  间  2020/7/22 1:44 PM
 */
final class ZipLog {
    private static final String TAG = "ZipLog";

    private static boolean DEBUG;

    static void config(boolean debug) {
        DEBUG = debug;
    }

    static void debug(String msg) {
        if (DEBUG) Log.d(TAG, msg);
    }
}
