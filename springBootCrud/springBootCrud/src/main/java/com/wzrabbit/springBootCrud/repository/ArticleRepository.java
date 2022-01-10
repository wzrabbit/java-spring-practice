package com.wzrabbit.springBootCrud.repository;

import com.wzrabbit.springBootCrud.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    
}
