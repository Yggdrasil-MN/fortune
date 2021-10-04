package com.android.taktics.omikujiapp.util;


import android.util.Log;

import com.android.taktics.omikujiapp.BuildConfig;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

    private final static String TAG = "Utility";
    /**
     * 現在日時を取得する.
     * @return nowDate 現在日時
     */
    public static Date getNowDate() {
        Date nowDate = new Date();
        return nowDate;
    }

    public static String convertDate2Str(String dateFormat, Date nowDate) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        String dateStr = simpleDateFormat.format(nowDate);
        return dateStr;
    }
}
