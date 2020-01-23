package com.main.braincinema.controller;

import com.main.braincinema.entity.News;
import java.util.ArrayList;
import java.util.Scanner;

public class NewsController {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> newsList = new ArrayList<>();

    public boolean createNews() {

        System.out.println("--Create News--");

        System.out.println("Title: ");
        String title = scan.next();

        System.out.println("Image: ");
        String imageUrl = scan.next();

        System.out.println("Text: ");
        String text = scan.next();

        System.out.println("Tags: ");
        String tags = scan.next();

        System.out.println("This is the latest news: (true / false) ");
        boolean isLatest = scan.nextBoolean();

        News news;
        try{
            news = new News(title, imageUrl, text, tags, isLatest);
            System.out.println(news.toString());
            newsList.add(news.getNewsTitle());
            return true;

        }catch (Exception e){
            return false;
        }
    }

    public boolean deleteNews() {

        System.out.println("--Delete News--");
        System.out.println("Enter news title: ");
        try{
            String delTitle = scan.next();
            newsList.remove(delTitle);
            return true;

        }catch (Exception e){
            return false;
        }
    }

    public boolean updateNews() {

        System.out.println("--Update News--");
        System.out.println("Enter news title: ");
        String update = scan.next();

        return true;
    }

}
