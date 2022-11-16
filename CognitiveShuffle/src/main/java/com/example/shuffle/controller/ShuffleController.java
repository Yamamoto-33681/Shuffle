package com.example.shuffle.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.shuffle.entity.Word;
import com.example.shuffle.service.WordService;

@Controller
public class ShuffleController {

    @Autowired
    private WordService wordService;

    @RequestMapping("/index")
    String index(Model model) {
        List<Word> wordList = new ArrayList<>();
        wordList = wordService.serachAll();
        Collections.shuffle(wordList);
        List<String> word = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            word.add(wordList.get(i).getWord());
        }
        model.addAttribute("wordList", word);
        return "index";
    }

}
