package com.example.shuffle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "word")
public class Word {

    @Column(name = "category")
    private String category;

    @Column(name = "aa")
    private String aa;

    @Id
    @Column(name = "word")
    private String word;

    @Column(name = "wordKana")
    private String wordKana;

    @Column(name = "aaa")
    private String aaa;

    @Column(name = "aaaaa")
    private String aaaaaa;
}
