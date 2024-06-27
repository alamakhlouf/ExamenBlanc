package tn.esprit.spring.examenblancspring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Candidat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idCandidat;

    String nom;

    String prenom;

    Integer nbQuiz;

    @Enumerated(EnumType.STRING)
    Niveau niveau;

    @ManyToMany(mappedBy = "candidatList")
    List<Quiz> quizList ;
}


