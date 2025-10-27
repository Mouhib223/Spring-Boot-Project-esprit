package tn.esprit.spring.gestionfoyer.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyer.entity.Etudiant;
@Repository
public interface EtudiantReposetory extends JpaRepository<Etudiant, Integer> {
}
