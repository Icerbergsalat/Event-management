package com.example.eventmanagement;

import java.util.ArrayList;

public class NewsAgency {
    private static String news;

    public static ArrayList<Observer> litseners = new ArrayList<>();

    public static void setNews(String news){
        news = news;
        for (Observer observer: litseners) {
            observer.update(news);
        }
    }
}
