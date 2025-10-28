package tn.esprit.spring.gestionfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionfoyer.Service.Interface.IUniversiteService;
import tn.esprit.spring.gestionfoyer.entity.Etudiant;
import tn.esprit.spring.gestionfoyer.entity.Universite;

import java.util.List;
//
@RestController
@AllArgsConstructor
@RequestMapping("universiteController")
public class UniversiteController {
    IUniversiteService iUniversiteService;
    @GetMapping
    public List<Etudiant> retrieveAllUniversities() {
        return iUniversiteService.retrieveAllUniversities();
    }
    @PostMapping("/addUniversite")
    public Universite addUniversite(@RequestBody Universite u) {
        return iUniversiteService.addUniversite(u);
    }
    @PutMapping("/updateUniversite")
    public Universite updateUniversite(@RequestBody Universite u) {
        return iUniversiteService.updateUniversite(u);
    }

//    public Universite retrieveUniversite(long idUniversite) {
//        return iUniversiteService.retrieveUniversite(idUniversite);// }
}
