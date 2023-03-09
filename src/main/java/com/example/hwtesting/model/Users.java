package com.example.hwtesting.model;

import jakarta.xml.bind.annotation.XmlType;
import lombok.*;
@Getter
@EqualsAndHashCode
public class Users {

    public static final String DEFAULT_LOGIN = "user";
    public static final String DEFAULT_EMAIL = "qwerty@mail.ru";

    String login;
    String email;

    public Users(String login, String email) {
        setLogin(login);
        setEmail(email);
    }

    public void setLogin(String login) {
        if (!login.isBlank() && !login.isEmpty()) {
            this.login = login;}
        else {
            this.login = DEFAULT_LOGIN;
        }
    }

    public void setEmail(String email) {
        if (!email.isBlank() && email.length() > 8) {
            this.email = email;}
        else {
            this.email = DEFAULT_EMAIL;
        }
    }

    @Override
    public String toString() {
        return "login: "+login+", email: "+email;
    }
}
