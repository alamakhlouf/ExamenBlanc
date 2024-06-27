package tn.esprit.spring.examenblancspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.examenblancspring.Entity.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question,Integer> {
}
