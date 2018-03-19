package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.model.MockUserService;
import org.academiadecodigo.bootcamp.model.User;

public class Main1 {

    public static void main(String[] args) {
        User user = new User("computador", "diogobr");
        User user1 = new User("telemovel", "filipe");
        //System.out.println(user.getUsername());
        //System.out.println(user.getEmail());
        //System.out.println(user.getPassword());
        MockUserService mockUserService = new MockUserService();
        mockUserService.addUser(user);
        mockUserService.addUser(user1);
        mockUserService.count();
        mockUserService.findByName("filipe");

    }
}
