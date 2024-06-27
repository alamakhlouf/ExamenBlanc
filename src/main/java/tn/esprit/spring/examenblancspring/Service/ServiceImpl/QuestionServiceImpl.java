package tn.esprit.spring.examenblancspring.Service.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.examenblancspring.Entity.Question;
import tn.esprit.spring.examenblancspring.Repository.QuestionRepo;
import tn.esprit.spring.examenblancspring.Repository.ReponseRepo;
import tn.esprit.spring.examenblancspring.Service.ServiceInterface.QuestionServiceInterface;
import tn.esprit.spring.examenblancspring.Service.ServiceInterface.ReponseServiceInterface;

@Service
@AllArgsConstructor
public class QuestionServiceImpl implements QuestionServiceInterface {

    QuestionRepo questionRepo ;

    ReponseServiceInterface reponseServiceInterface;
    @Override
    public Question ajouterQuestEtRepEtAffecterQuestAQuiz(Question question, Integer idQuiz) {
        reponseServiceInterface.addReponses(question.getReponseList());
        return questionRepo.save(question);
    }
}
