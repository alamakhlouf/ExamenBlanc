package tn.esprit.spring.examenblancspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.examenblancspring.Entity.Question;
import tn.esprit.spring.examenblancspring.Service.ServiceInterface.QuestionServiceInterface;


@RestController
@RequestMapping("question")
@AllArgsConstructor
public class QuestionController {
    QuestionServiceInterface questionServiceInterface;

    /* @PostMapping("addQuestion/{idQuiz}")
    public Question addQuestion(@PathVariable Integer idQuiz, @RequestBody Question question){
        return  questionServiceInterface.ajouterQuestEtRepEtAffecterQuestAQuiz(question,idQuiz);
    } */
}
