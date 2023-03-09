package com.example.hwtesting.service;

import com.example.hwtesting.model.Users;

public interface UsersService {

    Users createUser(String login, String email);
    Users createUser();

}
