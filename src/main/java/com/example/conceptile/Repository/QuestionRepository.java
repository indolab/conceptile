package com.example.conceptile.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.conceptile.Models.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
