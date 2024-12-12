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
        
       String wel = "welconme   ";
       Optional<User> usr = userrepo.findById(id);
        User user = usr.get();
       return wel.concat(user.getName()).concat("   id -->  ").concat(Integer.toString(id));
       
    }

    public Question getRandomQuestion() {
        List<Question> questions = questionRepository.findAll();
        if (questions.isEmpty()) {
            throw new RuntimeException("No questions available");
        }
        int randomNumber = (int)(Math.random() * (questions.size()-1 - 0 + 1)) + 0;
        return questions.get(randomNumber);
    }

    public String submitAnswer(Long questionId, String answer, Integer UserID) {
        Optional<Question> questionOpt = questionRepository.findById(questionId);

        if (questionOpt.isEmpty()) {
            return "Invalid session or question ID";
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

    public float getRes(Integer id){
        Optional<User> usr = userrepo.findById(id);
        User user = usr.get();
        float res1 = (float)(user.getCorrect());
        float res2 = (float)(user.getTotal());
        float res = (res1/res2)*100;
        return res;
    }

   
}
