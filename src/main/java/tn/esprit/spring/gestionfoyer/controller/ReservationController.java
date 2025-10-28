package tn.esprit.spring.gestionfoyer.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.gestionfoyer.Service.Interface.IReservationService;
import tn.esprit.spring.gestionfoyer.entity.Etudiant;
import tn.esprit.spring.gestionfoyer.entity.Reservation;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("reservationController")
public class ReservationController {
    IReservationService iReservationService;
    @GetMapping
    public List<Etudiant> retrieveAllReservation() {
        return iReservationService.retrieveAllReservation();
    }
    @PutMapping("/updateReservataion")
    public Reservation updateReservation(@RequestBody Reservation res) {
        return iReservationService.updateReservation(res);
    }
    @GetMapping("/retrieveReservataion/{idReservation}")
    public Reservation retrieveReservation(@PathVariable String idReservation) {
        return iReservationService.retrieveReservation(idReservation);
    }
}
