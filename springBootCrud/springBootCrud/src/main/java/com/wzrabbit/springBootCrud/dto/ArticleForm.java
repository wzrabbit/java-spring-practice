package com.wzrabbit.springBootCrud.dto;

import com.wzrabbit.springBootCrud.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private final Long id;
    private final String author;
    private final String title;
    private final String content;
    
    public Article toEntity() {
        return new Article(id, author, title, content);
    }
}
