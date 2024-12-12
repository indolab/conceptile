package com.example.conceptile.Controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.conceptile.Models.Question;
import com.example.conceptile.Services.QuizService;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/start")
   public String startNewQuiz(@RequestBody Map<String, Integer> payload) {
        Integer userId = payload.get("userID");
        return quizService.startNewQuiz(userId);
    }

    @GetMapping("/question")
    public Question getRandomQuestion() {
        return quizService.getRandomQuestion();
    }

    @PostMapping("/submit")
    public String submitAnswer(@RequestBody Map<String, Object> payload) {
    Long questionId = Long.valueOf(payload.get("questionId").toString());
    String answer = payload.get("answer").toString();
    Integer userId = Integer.valueOf(payload.get("userId").toString());
    return quizService.submitAnswer(questionId, answer, userId);
    }

    @GetMapping("/results")
    public String getResults(@RequestParam Long sessionId) {
        return "working";
    }
}

