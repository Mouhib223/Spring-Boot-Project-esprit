package tn.esprit.spring.gestionfoyer.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Foyer {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long idFoyer;
//    private String nomFoyer;
//    private Long capaciteFoyer;
//
//    @OneToOne
//    @JoinColumn(name = "universite_id")
//    private Universite universite;
//
//
//    @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL)
//    private Set<Bloc> blocs;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idFoyer;

    private String nomFoyer;
    private Long capaciteFoyer;

    @OneToMany(mappedBy = "foyer", cascade = CascadeType.ALL)
    private Set<Bloc> blocs;
}
