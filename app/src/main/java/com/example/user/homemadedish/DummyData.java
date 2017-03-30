package com.example.user.homemadedish;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 30/3/2017.
 */

public class DummyData {
    private static List<Event> list;

    public void insertData(Event event) {
        list.add(event);
    }

    public static List<Event> getList() {
        Event event = new Event();
        List<Event> list = new ArrayList<>();
        list.add(event);
        Event event1 = new Event();
        list.add(event1);
        return list;
    }
}
