package com.sofast.application.util;

import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/*
 *
 * @author fjiang
 * @description
 * @date 7/20/16
 */
@Slf4j
public class CookieUtil {

    /**
     * Add cookie.
     *
     * @param response the response
     * @param name     the name
     * @param value    the value
     * @param maxAge   the max age
     */
    public static void addCookie(HttpServletResponse response, String name, String value, int maxAge) {
        String cookieValue = value;
        if (!Strings.isNullOrEmpty(value)) {
            try {
                cookieValue = URLEncoder.encode(value, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                log.error(e.getMessage(), e);
                cookieValue = name;
            }
        }
        Cookie cookie = new Cookie(name, cookieValue);
        cookie.setSecure(false);
        cookie.setPath("/");
        if (maxAge >= 0) {
            cookie.setMaxAge(maxAge);
        }
        response.addCookie(cookie);
    }

    /**
     * Gets cookie by name.
     *
     * @param request the request
     * @param name    the name
     * @return the cookie by name
     */
    public static Cookie getCookieByName(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (name.equals(cookie.getName())) {
                    return cookie;
                }
            }
        }
        return null;
    }

    public static String getCookieValueByName(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (name.equals(cookie.getName())) {
                    try {
                        return XssHelper.xssEncode(URLDecoder.decode(cookie.getValue(), "UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        log.debug("can't decode:" + e.getMessage(), e);
                    }
                }
            }
        }
        return null;
    }

}
