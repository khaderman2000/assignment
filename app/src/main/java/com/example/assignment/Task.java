package com.example.assignment;

import java.util.Date;

public class Task {
    private String title;
    private Date date;
    private boolean state;

    public Task(String title, Date date) {
        this.title = title;
        this.date = date;
        this.state = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
