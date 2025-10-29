package tn.esprit.spring.gestionfoyer.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyer.entity.Etudiant;
import tn.esprit.spring.gestionfoyer.entity.Universite;

@Repository
public interface UniversiteReposetory extends JpaRepository<Universite, Long> {
    Universite findByNomUniversite(String nomUniversite);

}
