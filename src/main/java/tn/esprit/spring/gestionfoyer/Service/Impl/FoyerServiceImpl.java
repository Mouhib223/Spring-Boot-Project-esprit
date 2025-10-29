package tn.esprit.spring.gestionfoyer.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyer.Service.Interface.IFoyerService;
import tn.esprit.spring.gestionfoyer.entity.Foyer;
import tn.esprit.spring.gestionfoyer.entity.TypeChambre;
import tn.esprit.spring.gestionfoyer.reposetory.FoyerReposetory;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {
    private FoyerReposetory foyerRepo;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepo.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepo.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepo.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepo.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(long idFoyer) {
        foyerRepo.deleteById(idFoyer);

    }

    @Override
    public List<Foyer> getFoyerByNomEtudiantAndTypeChambre(String nomEtudiant, TypeChambre typeChambre) {
        return foyerRepo.findByBlocsChambresReservationListEtudiantsNomEtudiantAndBlocsChambresTypeC(nomEtudiant,typeChambre);
    }
    // add return foyerRepo.save(f)
    //update return foyerRepo.save(f)
    //retrivefoyer return foyerRepo.findById(idFoyer).orElse(Null) ken moch mawjoud yraja3 null w maya3melch mocjla
    //remove blach return foyerRepo.deletById(idFoyer)


    @Override
    public List<Foyer> getFoyerByBlocName(String nomBloc) {
        return foyerRepo.findByBlocsNomBloc(nomBloc);
    }
}
