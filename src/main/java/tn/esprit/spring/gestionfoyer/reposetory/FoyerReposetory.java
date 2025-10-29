package tn.esprit.spring.gestionfoyer.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.gestionfoyer.entity.Etudiant;
import tn.esprit.spring.gestionfoyer.entity.Foyer;
import tn.esprit.spring.gestionfoyer.entity.TypeChambre;

import java.util.List;

@Repository
public interface FoyerReposetory extends JpaRepository<Foyer, Long> {
    List<Foyer> findByBlocsChambresReservationListEtudiantsNomEtudiantAndBlocsChambresTypeC(String nomEtudiant, TypeChambre typeChambre);
    List<Foyer> findByBlocsNomBloc(String nomBloc);


    Long idFoyer(Long idFoyer);
}
