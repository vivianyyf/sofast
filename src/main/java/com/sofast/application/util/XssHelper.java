package com.sofast.application.util;

import com.google.common.base.Strings;
import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;
import org.owasp.esapi.ESAPI;

/*
 *
 * @author fjiang
 * @description 
 * @date 1/13/16
 */
public class XssHelper {
    private XssHelper() {

    }

    /**
     * @param value
     * @return
     * @auther jiangfeng
     * xss encode
     */
    public static String xssEncode(String value) {
        if (Strings.isNullOrEmpty(value)) {
            return value;
        }
        // Use the ESAPI library to avoid encoded attacks.
        value = ESAPI.encoder().canonicalize(value);

        // Avoid null characters
        value = value.replaceAll("\0", "");

        // Clean out HTML
        value = Jsoup.clean(value, Whitelist.none());

        value = value.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
        value = value.replaceAll("\\(", "&#40;").replaceAll("\\)", "&#41;");
        value = value.replaceAll("\\'", "");
        value = value.replaceAll("\'", "&#39;");
        value = value.replaceAll("'", "&#39;");
        value = value.replaceAll("\"", "&#34;");
        value = value.replaceAll("\r", "");
        value = value.replaceAll("\n", "");
//        value = value.replaceAll("eval\\((.*)\\)", "");
        value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
//        value = value.replaceAll("script", "");
        return value;
    }
}
