package com.sofast.application.service.impl;

import com.sofast.application.model.User;
import com.sofast.application.service.AuthService;

public class AuthServiceImpl implements AuthService {
    @Override
    public int getCookieExpire() {
        return 0;
    }

    @Override
    public int getAuthExpire() {
        return 0;
    }

    @Override
    public int getAuthRefresh() {
        return 0;
    }

    @Override
    public User getUserByAuthCode(String authCode) {
        return null;
    }

    @Override
    public User getUserByEmailPassword(String email, String password) {
        return null;
    }
}
