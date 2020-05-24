package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class NewsController {
    private final News[] arrayNews;

    public NewsController(News[] arrayNews) {
        this.arrayNews = arrayNews;
    }

    public void view(int id) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar dateCreated = arrayNews[id].getDateCreated();
        Calendar dateUpdated = arrayNews[id].getDateUpdated();

        System.out.println(arrayNews[id].getNews());
        System.out.println("Created: " + dateFormat.format(dateCreated.getTime()));
        System.out.println("Updated: " + dateFormat.format(dateUpdated.getTime()));
    }

    public void edit(int id, String title) {
        arrayNews[id].changeNews(title);
        this.view(id);
    }
}
