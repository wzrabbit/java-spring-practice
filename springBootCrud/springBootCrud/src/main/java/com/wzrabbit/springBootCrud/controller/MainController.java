package com.wzrabbit.springBootCrud.controller;

import com.wzrabbit.springBootCrud.dto.ArticleForm;
import com.wzrabbit.springBootCrud.entity.Article;
import com.wzrabbit.springBootCrud.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Controller
@Slf4j
public class MainController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/write")
    public String displayWritePage() {
        return "write";
    }

    @PostMapping("/write/upload")
    public String uploadArticle(ArticleForm form) {
        Article article = form.toEntity();
        Article saved = articleRepository.save(article);

        log.info("게시글 등록: " + saved.toString());
        return "redirect:/view/" + saved.getId();
    }

    @GetMapping("/view/{id}")
    public String showArticle(@PathVariable Long id, Model model) {
        Article articleEntity = articleRepository.findById(id).orElse(null);
        model.addAttribute("article", articleEntity);

        log.info("접속: " + id + " 번 게시글");
        return "view";
    }

    @GetMapping("/")
    public String showArticleList(Model model) {
        List<Article> articleEntityList = articleRepository.findAll();
        Collections.reverse(articleEntityList);
        model.addAttribute("articleList", articleEntityList);
        return "main";
    }
}
