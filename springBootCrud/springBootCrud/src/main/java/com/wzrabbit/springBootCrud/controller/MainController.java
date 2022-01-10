package com.wzrabbit.springBootCrud.controller;

import com.wzrabbit.springBootCrud.dto.ArticleForm;
import com.wzrabbit.springBootCrud.entity.Article;
import com.wzrabbit.springBootCrud.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    private ArticleRepository ar;

    @GetMapping("/write")
    public String displayWritePage() {
        return "write";
    }

    @PostMapping("/write/upload")
    public String uploadContent(ArticleForm form) {
        System.out.println(form.toString());

        Article article = form.toEntity();
        System.out.println(article.toString());

        Article saved = ar.save(article);
        System.out.println(saved.toString());
        return "";
    }
}
