package tn.esprit.spring.gestionfoyer.Service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.gestionfoyer.Service.Interface.IReservationService;
import tn.esprit.spring.gestionfoyer.entity.Etudiant;
import tn.esprit.spring.gestionfoyer.entity.Reservation;
import tn.esprit.spring.gestionfoyer.reposetory.ReservationReposetory;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {
    private ReservationReposetory ReservationRepo;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return ReservationRepo.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return ReservationRepo.save(res);
    }

    @Override
    public Reservation retrieveReservation(long idReservation) {
        return ReservationRepo.findById(idReservation).orElse(null);
    }
}
