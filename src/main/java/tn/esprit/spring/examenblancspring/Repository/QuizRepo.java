package tn.esprit.spring.examenblancspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.examenblancspring.Entity.Quiz;

@Repository
public interface QuizRepo extends JpaRepository<Quiz,Integer> {


    Quiz getQuizByTitreQuiz(String titre);
}
