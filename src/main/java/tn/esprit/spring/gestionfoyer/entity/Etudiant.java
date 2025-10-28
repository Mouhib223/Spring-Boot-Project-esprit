package tn.esprit.spring.gestionfoyer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEtudiant;
    private String prenomEtudiant;
    private long cin;
    private String ecole;
    private Date dateNaissance;
    @JsonIgnore
    @ManyToMany(mappedBy = "etudiants")
    private List<Reservation> reservations;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long idEtudiant;
//    private String nomEt;
//    private String prenomEt;
//    private Long cin;
//    private String ecole;
//    private Date dateNaissance;
//
//    @ManyToMany(mappedBy = "etudiants", cascade = CascadeType.ALL)
//    private Set<Reservation> reservations;
//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//private Long idEtudiant;

//    private String nomEt;
//    private String prenomEt;
//    private Long cin;
//    private String ecole;
//
//    @Temporal(TemporalType.DATE)
//    private Date dateNaissance;
//
//    @ManyToMany
//    @JoinTable(
//            name = "etudiant_reservation",
//            joinColumns = @JoinColumn(name = "etudiant_id"),
//            inverseJoinColumns = @JoinColumn(name = "reservation_id")
//    )
//    private Set<Reservation> reservations;
}
