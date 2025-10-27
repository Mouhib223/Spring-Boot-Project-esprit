package tn.esprit.spring.gestionfoyer.entity;


import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Reservation {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private String idReservation;
//    private Date anneeUniversitaire;
//    private boolean estValide;
//
//    @ManyToOne
//    @JoinColumn(name = "chambre_id")
//    private Chambre chambre;
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "reservation_etudiant",
//            joinColumns = @JoinColumn(name = "reservation_id"),
//            inverseJoinColumns = @JoinColumn(name = "etudiant_id")
//    )
//    private Set<Etudiant> etudiants;

    // work last
//@Id
//private String idReservation;
//
//    @Temporal(TemporalType.DATE)
//    private Date anneeUniversitaire;
//
//    private boolean estValide;
//
//    @ManyToOne
//    @JoinColumn(name = "chambre_id")
//    private Chambre chambre;
//
//    @ManyToMany(mappedBy = "reservations")
//    private Set<Etudiant> etudiants;

    @Id
    private String idReservation;

    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;

    private boolean estValide;

}


