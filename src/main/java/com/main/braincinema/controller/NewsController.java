package com.main.braincinema.controller;

import com.main.braincinema.entity.News;
import java.util.Scanner;

public class NewsController {
    public boolean createNews() {
        System.out.println("Input news title: ");
        Scanner scanner = new Scanner(System.in);

        News news  = new News("News_First_Title", "sadly_no_image", "News_First_Text",
                "#NewsFirstTag", true);

        news.getNewsTitle(scanner.nextLine());
        System.out.println(news.toString());
        return true;
    }

    public boolean deleteNews() {
        return true;
    }

    public boolean updateNews() {
        return true;
    }

}
