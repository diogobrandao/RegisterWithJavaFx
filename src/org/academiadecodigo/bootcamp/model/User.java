package org.academiadecodigo.bootcamp.model;

public class User {
    private String password;
    private String email;
    private String username;

    public User(String password, String username){
        this.password = password;
        this.email = email;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }
}
