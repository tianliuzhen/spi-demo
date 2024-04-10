package com.aaa.unicom;

import com.aaa.api.InternetApi;

/**
 * @author liuzhen.tian
 * @version 1.0 UnicomService.java  2024/4/10 23:07
 */
public class HangzhouUnicomService implements InternetApi {
    @Override
    public void toChat() {
        System.out.println("中国联通（杭州）...联网");
    }
}
