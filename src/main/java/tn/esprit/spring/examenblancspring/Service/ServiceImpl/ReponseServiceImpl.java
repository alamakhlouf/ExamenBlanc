package tn.esprit.spring.examenblancspring.Service.ServiceImpl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.examenblancspring.Entity.Reponse;
import tn.esprit.spring.examenblancspring.Repository.ReponseRepo;
import tn.esprit.spring.examenblancspring.Service.ServiceInterface.ReponseServiceInterface;

import java.util.List;

@Service
@AllArgsConstructor
public class ReponseServiceImpl implements ReponseServiceInterface {

    ReponseRepo reponseRepo;

    @Override
    public List<Reponse> addReponses(List<Reponse> reponseList) {
        return reponseRepo.saveAll(reponseList);

    }
}
