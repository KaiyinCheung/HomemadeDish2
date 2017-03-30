package com.example.user.homemadedish;

/**
 * Created by User on 30/3/2017.
 */

public class Event {
    private String venue, title, time;
    private int fee, photo, expectedParticipant;

    public Event() {
        this.venue = "venue";
        this.title = "title";
        this.time = "time";
        this.fee = 100;
        this.photo = R.mipmap.ic_launcher;
        this.expectedParticipant = 50;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getExpectedParticipant() {
        return expectedParticipant;
    }

    public void setExpectedParticipant(int expectedParticipant) {
        this.expectedParticipant = expectedParticipant;
    }
}
