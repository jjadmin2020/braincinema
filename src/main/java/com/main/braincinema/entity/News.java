package com.main.braincinema.entity;

import lombok.Data;

@Data
public class News {

    private String newsTitle;
    private String newsImageUrl;
    private String newsText;
    private String newsTags;
    private boolean latestNews;
    private String newsLink;
    private String newsVideoUrl;

    public News(String newsTitle, String newsImageUrl, String newsText,  String newsTags, boolean latestNews) {
        this.newsTitle = newsTitle;
        this.newsImageUrl = newsImageUrl;
        this.newsText = newsText;
        this.newsTags = newsTags;
        this.latestNews = latestNews;
    }

}
