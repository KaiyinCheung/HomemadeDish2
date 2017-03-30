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
        List<Event> list = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            Event event = new Event();
            event.setTitle("Event Name "+ i);
            list.add(event);
        }

        return list;
    }
}
