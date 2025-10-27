package tn.esprit.spring.gestionfoyer.Service.Interface;

import tn.esprit.spring.gestionfoyer.entity.Chambre;
import tn.esprit.spring.gestionfoyer.entity.Foyer;

import java.util.List;

public interface IFoyerService {

    // cpoier from blck board List <foyer>
    List<Foyer> retrieveAllFoyers();
    Foyer addFoyer (Foyer f);
    Foyer updateFoyer (Foyer f);
    Foyer retrieveFoyer (long idFoyer);
    void removeFoyer (long idFoyer);

}
