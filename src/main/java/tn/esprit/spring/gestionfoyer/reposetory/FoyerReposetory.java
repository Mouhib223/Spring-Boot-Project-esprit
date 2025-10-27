package tn.esprit.spring.gestionfoyer.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyer.entity.Etudiant;
import tn.esprit.spring.gestionfoyer.entity.Foyer;

@Repository
public interface FoyerReposetory extends JpaRepository<Foyer, Long> {
}
