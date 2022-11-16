package com.example.shuffle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.shuffle.Repository.WordRepository;
import com.example.shuffle.entity.Word;

@Service
@Transactional(rollbackFor = Exception.class)
public class WordService {

    @Autowired
    private WordRepository wordRepository;

    public List<Word> serachAll() {
        return wordRepository.findAll();
    }
}
