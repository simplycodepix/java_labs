package com.company;

import java.util.Calendar;

public class News {
    private String title;
    private final Calendar dateCreated;
    private Calendar dateUpdated;

    public News(String title) {
        this.title = title;
        this.dateCreated = Calendar.getInstance();
        this.dateUpdated = Calendar.getInstance();
    }

    public String getNews() {
        return title;
    }

    public Calendar getDateCreated() {
        return dateCreated;
    }

    public Calendar getDateUpdated() {
        return dateUpdated;
    }

    public void changeNews(String title) {
        this.title = title;
        this.dateUpdated = Calendar.getInstance();
    }
}
