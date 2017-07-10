package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
/**
 * @所属包名称 : com.coolweather.android.util
 * @描述 :
 * @作者 :	wuzy
 * @COPYRIGHT : copyright(c) 2017,Rights Reserved
 * @版本 :	v1.0
 * @创建日期 :	2017/7/10
 */
public class HttpUtil {
    public static void sendOkHttpRequest (String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
