package tn.esprit.spring.gestionfoyer.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyer.entity.Chambre;
@Repository
public interface ChambreReposetory extends JpaRepository<Chambre, Long> {
}
