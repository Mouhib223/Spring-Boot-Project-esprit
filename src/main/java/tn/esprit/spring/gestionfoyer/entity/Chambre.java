package tn.esprit.spring.gestionfoyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Chambre {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long idChambre;
//    private Long numeroChambre;
//
//    @Enumerated(EnumType.STRING)
//    private TypeChambre typeC;
//
//    @ManyToOne
//    @JoinColumn(name = "bloc_id")
//    private Bloc bloc;
//
//    @OneToMany(mappedBy = "chambre", cascade = CascadeType.ALL)
//    private Set<Reservation> reservations;

    // work last
//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//private Long idChambre;
//
//    private Long numeroChambre;
//
//    @Enumerated(EnumType.STRING)
//    private TypeChambre typeC;
//
//    @ManyToOne
//    @JoinColumn(name = "bloc_id")
//    private Bloc bloc;
//
//    @OneToMany(mappedBy = "chambre", cascade = CascadeType.ALL)
//    private Set<Reservation> reservations;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

    // ✅ One-to-many WITHOUT join table (foreign key in Reservation)
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "chambre_id")  // Foreign key added in Reservation table
    private Set<Reservation> reservations;
}
