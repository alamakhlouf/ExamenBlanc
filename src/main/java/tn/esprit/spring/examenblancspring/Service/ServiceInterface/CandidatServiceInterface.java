package tn.esprit.spring.examenblancspring.Service.ServiceInterface;

import tn.esprit.spring.examenblancspring.Entity.Candidat;
import tn.esprit.spring.examenblancspring.Entity.Niveau;

import java.util.List;

public interface CandidatServiceInterface {

    public Candidat ajouterCandidat(Candidat candidat);

    public List<Candidat> recupererCandidat (String specialite, Niveau niveau) ;
}
