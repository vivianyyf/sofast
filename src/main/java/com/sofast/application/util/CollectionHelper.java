package com.sofast.application.util;

import java.util.Collection;

/**
 * 功能说明：
 * 典型用法：
 * 特殊用法：
 * 创建者：lihong
 * 创建时间：十二月 11, 2015
 * 版本：1.0
 */
public class CollectionHelper {

    private CollectionHelper() {

    }

    /**
     * @param <T>        the type parameter
     * @param collection the collection
     * @return the boolean
     * @author lihong
     * @date 十二月 11, 2015
     * Is empty or null boolean.
     */
    public static <T> boolean isEmptyOrNull(Collection<T> collection) {
        return null == collection || collection.isEmpty();
    }
}
