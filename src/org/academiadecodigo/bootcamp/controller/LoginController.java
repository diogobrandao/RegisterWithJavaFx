package org.academiadecodigo.bootcamp.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.model.UserService;

import java.util.ArrayList;
import java.util.List;


public class LoginController {
    private String userName;
    private String passWord;

    @FXML
    public void initialize(){

        userName = textUsername.getText();
        passWord = textPassword.getText();
        System.out.println(textPassword.getText());
        System.out.println(textUsername.getText());

    }







    User user = new User(passWord, userName);


    public class MockUserService implements UserService {

        @FXML
        public void onLogin(ActionEvent event) {
            userName.equals(findByName(user.getUsername()));
            initialize();
            if (authenticate(userName, passWord)) {
                return;
            }

        }

        private List<User> users = new ArrayList<>();

        @Override
        public User findByName(String username) {

            if(users.isEmpty()){
                return null;
            }
            for (int i = 0; i < users.size(); i++) {
                if (user.equals(users.get(i).getUsername())) {  //create user
                    return users.get(i);
                }
            }
            return null;
        }


        @Override
        public boolean authenticate(String userName, String passWord) {
            for (User user : users) {
                if (userName.equals(user.getUsername()) && passWord.equals(user.getPassword())) {
                    return true;
                }
            }

            return false;
        }

        @Override
        public void addUser(User user) {
            users.add(user);

        }

        @Override
        public int count() {

            return users.size();
        }
    };

    @FXML
    TextField textUsername;
    @FXML
    TextField textPassword;

    @FXML
    private Button buttonLogin;

    @FXML
    private Hyperlink buttonCancel;

    @FXML
    public void cancel(ActionEvent event) {

    }



    public void setUserService(UserService userService) {



    }



    public void onLoginButtonPressed(ActionEvent event){


    }


}