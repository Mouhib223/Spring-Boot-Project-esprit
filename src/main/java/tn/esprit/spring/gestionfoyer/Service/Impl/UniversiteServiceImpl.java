package tn.esprit.spring.gestionfoyer.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyer.Service.Interface.IUniversiteService;
import tn.esprit.spring.gestionfoyer.entity.Etudiant;
import tn.esprit.spring.gestionfoyer.entity.Universite;
import tn.esprit.spring.gestionfoyer.reposetory.UniversiteReposetory;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {
    private UniversiteReposetory UniversiteRepo;
    @Override
    public List<Etudiant> retrieveAllUniversities() {
        return UniversiteRepo.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return null;
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return null;
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return null;
    }
}
