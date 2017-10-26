package com.sofast.application.service;

import com.sofast.application.model.User;

public interface AuthService {

    int getCookieExpire();

    int getAuthExpire();

    int getAuthRefresh();

    User getUserByAuthCode(String authCode);

    User getUserByEmailPassword(String email, String password);

}
