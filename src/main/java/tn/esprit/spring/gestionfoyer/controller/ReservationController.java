package tn.esprit.spring.gestionfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.gestionfoyer.Service.Interface.IReservationService;
import tn.esprit.spring.gestionfoyer.entity.Etudiant;
import tn.esprit.spring.gestionfoyer.entity.Reservation;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("reservationController")
public class ReservationController {
    IReservationService iReservationService;

    public List<Etudiant> retrieveAllReservation() {
        return iReservationService.retrieveAllReservation();
    }

    public Reservation updateReservation(Reservation res) {
        return iReservationService.updateReservation(res);
    }

    public Reservation retrieveReservation(String idReservation) {
        return iReservationService.retrieveReservation(idReservation);
    }
}
