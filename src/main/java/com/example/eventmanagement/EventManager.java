package com.example.eventmanagement;

import java.util.ArrayList;

public class EventManager {
    private static EventManager manager = null;

    public ArrayList<Event> events = new ArrayList<>();

    public static EventManager getInstance(){
        if (manager == null){
            manager = new EventManager();
        }
        return manager;
    }

     public static void eventfactory(String eventType) {
        switch(eventType){
            case "koncert":
                EventManager.getInstance().events.add(new KoncertEvent());
                NewsAgency.setNews("New concert was made");
                break;
            case "konference":
                EventManager.getInstance().events.add(new KonferenceEvent());
                NewsAgency.setNews("New conference was made");
                break;
            case "workshop":
                EventManager.getInstance().events.add(new WorkshopEvent());
                NewsAgency.setNews("New workshop was made");
                break;
            default:
                System.out.println("not an event");
        }
    }
}
