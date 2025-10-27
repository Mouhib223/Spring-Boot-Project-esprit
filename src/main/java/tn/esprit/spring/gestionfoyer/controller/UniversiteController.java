package tn.esprit.spring.gestionfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.gestionfoyer.Service.Interface.IUniversiteService;
import tn.esprit.spring.gestionfoyer.entity.Etudiant;
import tn.esprit.spring.gestionfoyer.entity.Universite;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("universiteController")
public class UniversiteController {
    IUniversiteService iUniversiteService;

    public List<Etudiant> retrieveAllUniversities() {
        return iUniversiteService.retrieveAllUniversities();
    }

    public Universite addUniversite(Universite u) {
        return iUniversiteService.addUniversite(u);
    }

    public Universite updateUniversite(Universite u) {
        return iUniversiteService.updateUniversite(u);
    }

    public Universite retrieveUniversite(long idUniversite) {
        return iUniversiteService.retrieveUniversite(idUniversite);
    }
}
