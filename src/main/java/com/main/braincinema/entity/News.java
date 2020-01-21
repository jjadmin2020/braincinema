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

    public String getNewsTitle(String s) { return this.newsTitle; }

    public String getNewsText() { return this.newsText; }

    public String getNewsImageUrl() { return this.newsImageUrl; }

    public String getNewsTags() { return this.newsTags; }

    public boolean isLatestNews() { return this.latestNews; }

    public String getNewsLink() { return this.newsLink; }

    public String getNewsVideoUrl() { return this.newsVideoUrl; }

    @Override
    public String toString()
    {
        return String.format("%s\n %s\n %s\n %s\n %b",
                this.getNewsTitle(),
                this.getNewsImageUrl(),
                this.getNewsText(),
                this.getNewsTags(),
                this.isLatestNews());
    }

}
