package tn.esprit.spring.examenblancspring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idQuiz;

    String titreQuiz;

    String specialite;

    Date dateQuiz;

    @ManyToMany
    List<Candidat> candidatList ;

    @OneToMany(mappedBy = "quiz")
    List<Question> questionList ;
}
