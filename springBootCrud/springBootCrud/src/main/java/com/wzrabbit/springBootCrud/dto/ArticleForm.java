package com.wzrabbit.springBootCrud.dto;

import com.wzrabbit.springBootCrud.entity.Article;

public class ArticleForm {
    private final String author;
    private final String title;
    private final String content;

    public ArticleForm(String author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {
        return new Article(null, author, title, content);
    }
}
