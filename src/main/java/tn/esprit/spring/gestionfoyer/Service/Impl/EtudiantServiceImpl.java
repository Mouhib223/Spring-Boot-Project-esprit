package tn.esprit.spring.gestionfoyer.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyer.Service.Interface.IEtudiantService;
import tn.esprit.spring.gestionfoyer.entity.Etudiant;
import tn.esprit.spring.gestionfoyer.reposetory.EtudiantReposetory;
import tn.esprit.spring.gestionfoyer.reposetory.FoyerReposetory;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {
    private EtudiantReposetory EtudiantRepo;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return EtudiantRepo.findAll();
    }

    @Override
    public List<Etudiant> addEtudiants(List<Etudiant> etudiants) {
        return EtudiantRepo.saveAll(etudiants);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return null;
    }

    @Override
    public Etudiant retrieveEtudiant(long idEtudiant) {
        return null;
    }

    @Override
    public void removeEtudiant(long idEtudiant) {

    }
}
