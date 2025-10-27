package tn.esprit.spring.gestionfoyer.Service.Interface;

import tn.esprit.spring.gestionfoyer.entity.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveBlocs();
    Bloc updateBloc (Bloc bloc);
    Bloc addBloc (Bloc bloc);
    Bloc retrieveBloc (long idBloc);
    void removeBloc (long idBloc);
}
