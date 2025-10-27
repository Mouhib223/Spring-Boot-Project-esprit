package tn.esprit.spring.gestionfoyer.Service.Interface;

import tn.esprit.spring.gestionfoyer.entity.Etudiant;
import tn.esprit.spring.gestionfoyer.entity.Reservation;

import java.util.List;

public interface IReservationService {
    List<Etudiant> retrieveAllReservation();
    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (String idReservation);

}
