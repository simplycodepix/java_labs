package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        News[] news = new News[]{
                new News("Президент Афганістану Ашраф Гані оголосив про звільнення до двох тисяч талібів"),
                new News("В Ірані стався потужний землетрус"),
                new News("США погрожують Пекіну санкціями через новий законопроект про Гонконг")
        };

        String[] paths = new String[] {
                "view/1",
                "edit/1",
                "view/2",
                "edit/2",
                "view/3",
                "edit/3",
        };

        NewsController newsController = new NewsController(news);

        for (String path : paths) {
            StringTokenizer token = new StringTokenizer(path, "/");
            if (token.nextToken().equals("edit")) {
                int id = Integer.parseInt((String)token.nextElement());
                System.out.print("New title: ");
                String newTitle = new Scanner(System.in).next();
                newsController.edit(id - 1, newTitle);
            } else {
                int id = Integer.parseInt((String)token.nextElement());
                newsController.view(id - 1);
            }
        }


        String text = "The principal operations on a StringBuilder that are not available in String are the append() and insert() methods, which are overloaded so as to accept data of any type";

        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (sb.toString().indexOf(c) == -1) {
                sb.append(c);
            }
        }

        System.out.println("Characters count: " + sb.toString().length());
        System.out.println(sb.toString());
    }
}
