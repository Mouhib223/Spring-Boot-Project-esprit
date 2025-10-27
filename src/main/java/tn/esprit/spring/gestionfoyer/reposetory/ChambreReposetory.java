package tn.esprit.spring.gestionfoyer.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyer.entity.Chambre;

import java.util.List;

@Repository
public interface ChambreReposetory extends JpaRepository<Chambre, Long> {
      //List<Chambre> findByBlocFoyerUniversiteNomUniversite(String nomUniversite) {
       //    return getByNomUniversite(nomUniversite);
     //  }
    }


