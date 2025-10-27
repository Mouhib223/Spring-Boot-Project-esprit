package tn.esprit.spring.gestionfoyer.Service.Interface;

import tn.esprit.spring.gestionfoyer.entity.Etudiant;
import tn.esprit.spring.gestionfoyer.entity.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Etudiant> retrieveAllUniversities();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (long idUniversite);

}
