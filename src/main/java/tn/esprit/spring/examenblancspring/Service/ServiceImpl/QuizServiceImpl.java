package tn.esprit.spring.examenblancspring.Service.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.examenblancspring.Entity.Candidat;
import tn.esprit.spring.examenblancspring.Entity.Quiz;
import tn.esprit.spring.examenblancspring.Repository.CandidatRepo;
import tn.esprit.spring.examenblancspring.Repository.QuizRepo;
import tn.esprit.spring.examenblancspring.Service.ServiceInterface.QuizServiceInterface;

import java.util.List;

@Service
@AllArgsConstructor
public class QuizServiceImpl implements QuizServiceInterface {

    QuizRepo quizRepo;
    CandidatRepo candidatRepo;

    @Override
    public Quiz ajouterQuiz(Quiz quiz) {
        return quizRepo.save(quiz);
    }

    @Override
    public Quiz affecterQuizCandidat(String titreQuiz, Integer idCandidat) {

        Candidat candidat = candidatRepo.findById(idCandidat).orElse(null);
        Quiz quiz = quizRepo.getQuizByTitreQuiz(titreQuiz);


        if (candidat != null) {
            candidat.setNbQuiz(candidat.getNbQuiz() + 1);
            quiz.getCandidatList().add(candidat);
            quizRepo.save(quiz);
            return quiz ;
        }
        return null;
    }
}
