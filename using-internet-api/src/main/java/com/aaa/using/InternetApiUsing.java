package com.aaa.using;

import com.aaa.api.InternetApi;

import java.util.ServiceLoader;

/**
 * 使用spi的接口
 *
 * @author liuzhen.tian
 * @version 1.0 InternetApi.java  2024/4/10 23:01
 */
public class InternetApiUsing {
    public static void main(String[] args) {
        ServiceLoader<InternetApi> loader = ServiceLoader.load(InternetApi.class);
        for (InternetApi internetApi : loader) {
            internetApi.toChat();
        }
    }
}
