package tn.esprit.spring.gestionfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionfoyer.Service.Interface.IFoyerService;
import tn.esprit.spring.gestionfoyer.entity.Foyer;
import tn.esprit.spring.gestionfoyer.entity.TypeChambre;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("foyerController")
public class FoyerController {
    IFoyerService iFoyerService;
    @GetMapping
    public List<Foyer> retrieveAllFoyers() {
        return iFoyerService.retrieveAllFoyers();
    }
    @PostMapping("/addFoyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        return iFoyerService.addFoyer(f);
    }
    @PutMapping("/updateFoyer")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        return iFoyerService.updateFoyer(f);
    }
    @GetMapping("/retrieveFoyer/{idFoyer}")
    public Foyer retrieveFoyer(@PathVariable long idFoyer) {
        return iFoyerService.retrieveFoyer(idFoyer);
    }
    @DeleteMapping("/removeFoyer/{idFoyer}")
    public void removeFoyer(@PathVariable long idFoyer) {
        iFoyerService.removeFoyer(idFoyer);
    }

    @GetMapping("getFoyerByEtdNameAndChambreType/{nomEtudiant}/{typeChambre}")
    public List<Foyer> getFoyerByNomEtudiantAndTypeChambre(@PathVariable String nomEtudiant,@PathVariable TypeChambre typeChambre) {
        return iFoyerService.getFoyerByNomEtudiantAndTypeChambre(nomEtudiant, typeChambre);
    }
    @GetMapping("getFoyerByBlocName/{nomBloc}")
    public List<Foyer> getFoyerByBlocName(@PathVariable String nomBloc) {
        return iFoyerService.getFoyerByBlocName(nomBloc);
    }
}
