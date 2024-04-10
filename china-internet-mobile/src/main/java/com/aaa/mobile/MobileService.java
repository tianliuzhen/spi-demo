package com.aaa.mobile;

import com.aaa.api.InternetApi;

/**
 * @author liuzhen.tian
 * @version 1.0 UnicomService.java  2024/4/10 23:07
 */
public class MobileService implements InternetApi {
    @Override
    public void toChat() {
        System.out.println("中国移动...联网");
    }
}
