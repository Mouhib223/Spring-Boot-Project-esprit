package tn.esprit.spring.gestionfoyer.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyer.Service.Interface.IChambreService;
import tn.esprit.spring.gestionfoyer.entity.Chambre;
import tn.esprit.spring.gestionfoyer.reposetory.ChambreReposetory;
import tn.esprit.spring.gestionfoyer.reposetory.FoyerReposetory;

import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {
    private ChambreReposetory ChambreRepo;

    @Override
    public List<Chambre> retrieveAllChambres() {
        return ChambreRepo.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return ChambreRepo.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return null;
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return null;
    }

    @Override
     public List<Chambre> getByNomUniversite(String nomUniversite) {
           return List.of();
    }
}
