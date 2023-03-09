package com.example.hwtesting.service.impl;

import com.example.hwtesting.model.Users;
import org.apache.catalina.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsersServiceImplTest {
    public static final String EMPTY_USER = "";
    public static final String SPACE_USER = "   ";
    public static final String CORRECT_EMAIL = "qwerty@mail.ru";
    public static final String INCORRECT_EMAIL_1 = "qwerty@mailru";
    public static final String INCORRECT_EMAIL_2 = "qwertymail.ru";
    public static final String CORRECT_LOGIN = "user";
    public static final String INCORRECT_LOGIN = "qwerty@mail.ru";
    public static final Users CORRECT_USER = new Users("user", "qwerty@mail.ru");

    static String login;
    static String email;
    UsersServiceImpl usersServiceOut = new UsersServiceImpl();

    @Test
    void shouldCreateUserWithCorrectParameters() {
        Users result = usersServiceOut.createUser(CORRECT_LOGIN, CORRECT_EMAIL);
        assertEquals(result, CORRECT_USER);
    }

    @Test
    void shouldCreateUserWhenParametersIsNotExist() {
        Users result = usersServiceOut.createUser();
        assertEquals(result, CORRECT_USER);
    }

    @Test
    void shouldReadTheCorrectParameter() {
        Users result = usersServiceOut.createUser(CORRECT_LOGIN, CORRECT_EMAIL);
//        Users result = usersServiceOut.createUser(CORRECT_LOGIN, INCORRECT_EMAIL_1);
//        Users result = usersServiceOut.createUser(CORRECT_LOGIN, INCORRECT_EMAIL_2);
        Assertions.assertTrue(result.getEmail().contains("@"));
        Assertions.assertTrue(result.getEmail().contains("."));
    }
    @Test
    void shouldNotBeEqual() {
        Users result = usersServiceOut.createUser(CORRECT_LOGIN, CORRECT_EMAIL);
//        Users result = usersServiceOut.createUser(INCORRECT_LOGIN, CORRECT_EMAIL);
        assertNotEquals(result.getLogin(), result.getEmail());
    }
}