package tn.esprit.spring.examenblancspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.examenblancspring.Entity.Candidat;
import tn.esprit.spring.examenblancspring.Entity.Question;
import tn.esprit.spring.examenblancspring.Entity.Quiz;
import tn.esprit.spring.examenblancspring.Service.ServiceInterface.QuestionServiceInterface;
import tn.esprit.spring.examenblancspring.Service.ServiceInterface.QuizServiceInterface;


@RestController
@RequestMapping("quiz")
@AllArgsConstructor
public class QuizController {

QuizServiceInterface quizServiceInterface ;



    @PostMapping("ajouterQuiz")
    public Quiz ajouterQuiz(@RequestBody Quiz quiz) {
        return quizServiceInterface.ajouterQuiz(quiz);
    }

    @PutMapping("assignerQuiz/{idUser}/{quizTitle}")
    public  Quiz affecterQuizCandidat(@PathVariable Integer idUser, @PathVariable String quizTitle) {
        return quizServiceInterface.affecterQuizCandidat(quizTitle,idUser);
    }

}
