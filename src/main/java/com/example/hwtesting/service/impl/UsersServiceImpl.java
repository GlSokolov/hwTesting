package com.example.hwtesting.service.impl;

import com.example.hwtesting.model.Users;
import com.example.hwtesting.service.UsersService;

public class UsersServiceImpl implements UsersService {

    @Override
    public Users createUser(String login, String email) {

        return new Users(login, email);
    }

    @Override
    public Users createUser() {

        return new Users(Users.DEFAULT_LOGIN, Users.DEFAULT_EMAIL);
    }

}
