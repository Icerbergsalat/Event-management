package com.example.eventmanagement;

import java.util.ArrayList;

public abstract class Event {
    public ArrayList<User> userList = new ArrayList<>();

    public void addUser(User user){
        this.userList.add(user);
        NewsAgency.setNews("user added");
    }
}

class KoncertEvent extends Event{
    KoncertEvent(){
    }
}

class KonferenceEvent extends Event{
    KonferenceEvent(){
    }
}

class WorkshopEvent extends Event{
    WorkshopEvent(){
    }
}
