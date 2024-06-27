package tn.esprit.spring.examenblancspring.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.examenblancspring.Entity.Candidat;
import tn.esprit.spring.examenblancspring.Entity.Niveau;
import tn.esprit.spring.examenblancspring.Repository.CandidatRepo;
import tn.esprit.spring.examenblancspring.Service.ServiceInterface.CandidatServiceInterface;

import java.util.List;

@RestController
@RequestMapping("candidat")
@AllArgsConstructor
public class CandidatController {

    CandidatServiceInterface candidatServiceInterface ;


    @PostMapping("ajouterCandidat")
    public Candidat ajouterCandidat(@RequestBody Candidat candidat) {
        return candidatServiceInterface.ajouterCandidat(candidat);
    }

    @GetMapping("getBySpecialiteAndNiveau/{specialite}/{niveau}")
    public List<Candidat> getBySpecialiteAndNiveauAndDate(@PathVariable Niveau niveau, @PathVariable String specialite) {
        return candidatServiceInterface.recupererCandidat(specialite,niveau);
    }



}
