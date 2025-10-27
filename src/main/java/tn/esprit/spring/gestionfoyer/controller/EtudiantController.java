package tn.esprit.spring.gestionfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.gestionfoyer.Service.Interface.IEtudiantService;
import tn.esprit.spring.gestionfoyer.entity.Etudiant;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("etudiantController")
public class EtudiantController {
    IEtudiantService etudiantService;

    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantService.retrieveAllEtudiants();
    }

    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return etudiantService.addEtudiants(etudiants);
    }

    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantService.updateEtudiant(e);
    }

    public Etudiant retrieveEtudiant(long idEtudiant) {
        return etudiantService.retrieveEtudiant(idEtudiant);
    }

    public void removeEtudiant(long idEtudiant) {
        etudiantService.removeEtudiant(idEtudiant);
    }
}
