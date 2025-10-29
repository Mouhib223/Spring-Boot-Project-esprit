package tn.esprit.spring.gestionfoyer.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyer.Service.Interface.IUniversiteService;
import tn.esprit.spring.gestionfoyer.entity.Etudiant;
import tn.esprit.spring.gestionfoyer.entity.Foyer;
import tn.esprit.spring.gestionfoyer.entity.Universite;
import tn.esprit.spring.gestionfoyer.reposetory.FoyerReposetory;
import tn.esprit.spring.gestionfoyer.reposetory.UniversiteReposetory;

import java.util.List;

//import static java.lang.foreign.MemorySegment.NULL;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {
    private FoyerReposetory foyerReposetory;
    private UniversiteReposetory universiteRepo;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return universiteRepo.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepo.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepo.save(u);
    }

    @Override
    public void retrieveUniversite(long idUniversite) {
        universiteRepo.findById(idUniversite);
    }



    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Foyer f = foyerReposetory.findById(idFoyer).orElse(null);
        Universite u = universiteRepo.findByNomUniversite(nomUniversite);
        u.setFoyer(f);
       return universiteRepo.save(u);

    }
}
