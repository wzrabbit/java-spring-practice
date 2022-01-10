package com.wzrabbit.springBootCrud.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Article {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String author;

    @Column
    private String title;

    @Column
    @Lob
    private String content;
}
