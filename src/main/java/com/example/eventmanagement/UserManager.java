package com.example.eventmanagement;

import java.util.ArrayList;

public class UserManager {
    private static UserManager manager = null;

    public ArrayList<User> users = new ArrayList<>();

    public static UserManager getInstance(){
        if (manager == null){
            manager = new UserManager();
        }
        return manager;
    }
}
