package tn.esprit.spring.examenblancspring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idQuestion;

    String libelleQ;

    @Enumerated(EnumType.STRING)
    Complexite complexite;

    @OneToMany
    List<Reponse> reponseList ;

    @ManyToOne
    @JsonIgnore
    Quiz quiz ;
}


