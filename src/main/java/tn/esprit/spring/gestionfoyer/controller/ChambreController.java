package tn.esprit.spring.gestionfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionfoyer.Service.Interface.IChambreService;
import tn.esprit.spring.gestionfoyer.entity.Chambre;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("chambreController")
public class ChambreController {
    IChambreService chambreService;
    @GetMapping
    public List<Chambre> retrieveAllChambres() {
        return chambreService.retrieveAllChambres();
    }
    @PostMapping("/addChamre")
    public Chambre addChambre(Chambre c) {
        return chambreService.addChambre(c);
    }
    @PutMapping("/updateChambre")
    public Chambre updateChambre(Chambre c) {
        return chambreService.updateChambre(c);
    }
    @GetMapping ("/retrieveChambre/{idChambre}")
    public Chambre retrieveChambre(long idChambre) {
        return chambreService.retrieveChambre(idChambre);
    }
}
