package org.academiadecodigo.bootcamp.model;

import org.academiadecodigo.bootcamp.model.User;

public interface UserService {

    boolean authenticate(String string, String string1);

    void addUser(User user);

    public User findByName(String username);

    int count();

}
