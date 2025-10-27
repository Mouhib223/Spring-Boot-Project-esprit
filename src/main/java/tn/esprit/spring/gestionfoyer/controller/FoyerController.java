package tn.esprit.spring.gestionfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.gestionfoyer.Service.Interface.IFoyerService;
import tn.esprit.spring.gestionfoyer.entity.Foyer;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("foyerController")
public class FoyerController {
    IFoyerService iFoyerService;

    public List<Foyer> retrieveAllFoyers() {
        return iFoyerService.retrieveAllFoyers();
    }

    public Foyer addFoyer(Foyer f) {
        return iFoyerService.addFoyer(f);
    }

    public Foyer updateFoyer(Foyer f) {
        return iFoyerService.updateFoyer(f);
    }

    public Foyer retrieveFoyer(long idFoyer) {
        return iFoyerService.retrieveFoyer(idFoyer);
    }

    public void removeFoyer(long idFoyer) {
        iFoyerService.removeFoyer(idFoyer);
    }
}
