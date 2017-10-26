package com.sofast.application.util;

import java.util.UUID;

/**
 * 功能说明：
 * 典型用法：
 * 特殊用法：
 * 创建者：lihong
 * 创建时间：十二月 11, 2015
 * 版本：1.0
 */
public class UUIDHelper {

    private UUIDHelper() {
    }

    /**
     * @return the string
     * @author lihong
     * @date 十二月 11, 2015
     * Get uuid string.
     */
    public static String getUUID() {
        return UUID.randomUUID().toString();
    }
}
