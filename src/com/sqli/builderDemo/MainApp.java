package com.sqli.builderDemo;

public class MainApp {

    public static void main(String[] args) {
       User user = new User.UserBuilder("jhon","doe").age(22).phone("2322212145").build();
        System.out.println(user);
    }
}
