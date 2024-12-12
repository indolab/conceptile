package com.example.conceptile.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.conceptile.Models.Question;
import com.example.conceptile.Models.User;
import com.example.conceptile.Repository.QuestionRepository;
import com.example.conceptile.Repository.UserRepo;


@Service
public class QuizService {

   
    

    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private UserRepo userrepo;
    

 


   

    public String startNewQuiz(Integer id) {
        
       String wel = "welconm user  ";
       
     return wel;
       
    }

    public Question getRandomQuestion() {
        List<Question> questions = questionRepository.findAll();
        if (questions.isEmpty()) {
            throw new RuntimeException("No questions available");
        }
        
        return questions.get(2);
    }

    public String submitAnswer(Long questionId, String answer, Integer UserID) {
        Optional<Question> questionOpt = questionRepository.findById(questionId);

        if (questionOpt.isEmpty()) {
            return "Invalid session or question ID";
        }
        
        if (!questionOpt.isPresent()) {
        System.out.println("Fetched Question: " + questionOpt.get());
        System.out.println("Correct Answer: " + questionOpt.get().getCorrectAnswer());
}

        
        Question question = questionOpt.get();
        if (question.getCorrectAnswer() == null) {
            return "Correct answer for the question is not set.";
        }

        boolean isCorrect = question.getCorrectAnswer().equalsIgnoreCase(answer);

        Optional<User> usr = userrepo.findById(UserID);
        User user = usr.get();
        if(isCorrect){ 
            user.setCorrect();
            user.setTotal();
            userrepo.save(user);
           
            return "Yay ! Doind good";
            

        }

        else {
        
        user.setTotal();
        userrepo.save(user);

        return "OOPS! wrong answer";

        }
    }

   
}
