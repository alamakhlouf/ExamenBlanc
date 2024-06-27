package tn.esprit.spring.examenblancspring.Service.ServiceInterface;

import org.springframework.stereotype.Service;
import tn.esprit.spring.examenblancspring.Entity.Quiz;

public interface QuizServiceInterface {

    public Quiz ajouterQuiz(Quiz quiz);

    public  Quiz affecterQuizCandidat(String titreQuiz, Integer idCandidat);
}
