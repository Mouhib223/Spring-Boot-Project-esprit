package tn.esprit.spring.gestionfoyer.entity;

import jakarta.persistence.*;



@Entity
public class Universite {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long idUniversite;
//    private String nomUniversite;
//    private String adresse;
//
//    @OneToOne(mappedBy = "universite", cascade = CascadeType.ALL)
//    private Foyer foyer;
//
//    }
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idUniversite;

    private String nomUniversite;
    private String adresse;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "foyer_id", referencedColumnName = "idFoyer")
    private Foyer foyer;}

