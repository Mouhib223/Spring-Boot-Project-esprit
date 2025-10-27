package tn.esprit.spring.gestionfoyer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
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
    @JsonIgnore
    @OneToMany
    private List<Reservation> reservationList;
    @JsonIgnore
    @ManyToOne
    private Bloc bloc;

}
