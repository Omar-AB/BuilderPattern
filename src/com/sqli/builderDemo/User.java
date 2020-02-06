package com.sqli.builderDemo;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private String phone;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String phone;

        // on initialise que les champs obligatoire
        public UserBuilder(String pFirstName, String pLastName) {
            this.firstName = pFirstName;
            this.lastName = pLastName;
        }

        public UserBuilder age(int pAge) {
            this.age = pAge;
            return this;
        }

        public UserBuilder phone(String pPhone) {
            this.phone = pPhone;
            return this;
        }

        public User build(){
            return new User(this);
        }



    }

    @Override
    public String toString() {
        return "User{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", age=" + age +
            ", phone='" + phone + '\'' +
            '}';
    }
}
