package tn.esprit.spring.examenblancspring.Service.ServiceImpl;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.examenblancspring.Entity.Candidat;
import tn.esprit.spring.examenblancspring.Entity.Niveau;
import tn.esprit.spring.examenblancspring.Repository.CandidatRepo;
import tn.esprit.spring.examenblancspring.Service.ServiceInterface.CandidatServiceInterface;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static com.fasterxml.jackson.databind.type.LogicalType.DateTime;

@Service
@AllArgsConstructor
public class CandidatServiceImpl implements CandidatServiceInterface {

    CandidatRepo candidatRepo ;


    @Override
    public Candidat ajouterCandidat(Candidat candidat) {
        return candidatRepo.save(candidat);
    }

    @Override
    public List<Candidat> recupererCandidat(String specialite, Niveau niveau) {
       Date date = new Date();
        return candidatRepo.getCandidatsByQuizListSpecialiteAndNiveauAndQuizListDateQuizAfter(specialite,niveau, date);
    }
}
