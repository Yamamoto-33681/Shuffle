package com.example.shuffle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shuffle.entity.Word;

@Repository
public interface WordRepository extends JpaRepository<Word, String> {

}
