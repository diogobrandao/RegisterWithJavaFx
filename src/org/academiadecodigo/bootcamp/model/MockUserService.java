package org.academiadecodigo.bootcamp.model;

import java.util.ArrayList;
import java.util.List;

public class MockUserService implements UserService {

    private List<User> users = new ArrayList<User>();
    private int count;
    private User user;


    @Override
    public boolean authenticate(String string, String string1) {
        if(string == string1){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);

    }

    @Override
    public User findByName(String username) {
        for(int i = 0; i < users.size(); i++) {

            if (users.get(i).getUsername().equals(username)) {
                System.out.println(users.get(i).getUsername());
                return user;
            }

        }
        return null;
    }

    @Override
    public int count() {
        int count = users.size();
        System.out.println(count);
        return count;

    }

    public List<User> getUsers() {
        return users;
    }


}
