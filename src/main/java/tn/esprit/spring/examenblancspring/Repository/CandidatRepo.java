package tn.esprit.spring.examenblancspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.examenblancspring.Entity.Candidat;
import tn.esprit.spring.examenblancspring.Entity.Niveau;

import java.util.Date;
import java.util.List;

@Repository
public interface CandidatRepo extends JpaRepository<Candidat,Integer> {

    List<Candidat> getCandidatsByQuizListSpecialiteAndNiveauAndQuizListDateQuizAfter(String specialite, Niveau niveau, Date date);

}
