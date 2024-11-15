package com.example.eventmanagement;

public class Observer {
    String name;
    String news = "";

    Observer(String name){
        this.name = name;
    }

    public void update(String news){
        this.news = news;
    }
}
