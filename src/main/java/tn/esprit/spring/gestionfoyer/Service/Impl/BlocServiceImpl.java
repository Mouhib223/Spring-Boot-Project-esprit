package tn.esprit.spring.gestionfoyer.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyer.Service.Interface.IBlocService;
import tn.esprit.spring.gestionfoyer.entity.Bloc;
import tn.esprit.spring.gestionfoyer.reposetory.BlocReposetory;
import tn.esprit.spring.gestionfoyer.reposetory.FoyerReposetory;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {
    private BlocReposetory BlocRepo;
    @Override
    public List<Bloc> retrieveBlocs() {
        return BlocRepo.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return BlocRepo.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return BlocRepo.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return BlocRepo.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {
        BlocRepo.deleteById(idBloc);

    }
}
