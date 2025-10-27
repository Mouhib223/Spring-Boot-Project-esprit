package tn.esprit.spring.gestionfoyer.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Bloc {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long idBloc;
//    private String nomBloc;
//    private Long capaciteBloc;
//
//    @ManyToOne
//    @JoinColumn(name = "foyer_id")
//    private Foyer foyer;
//
//    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
//    private Set<Chambre> chambres;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idBloc;

    private String nomBloc;
    private Long capaciteBloc;

    public Long getIdBloc() {
        return idBloc;
    }

    public void setIdBloc(Long idBloc) {
        this.idBloc = idBloc;
    }

    public String getNomBloc() {
        return nomBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public Long getCapaciteBloc() {
        return capaciteBloc;
    }

    public void setCapaciteBloc(Long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }

    public Foyer getFoyer() {
        return foyer;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }

    public Set<Chambre> getChambres() {
        return (Set<Chambre>) chambres;
    }

    public void setChambres(Set<Chambre> chambres) {
        this.chambres = (List<Chambre>) chambres;
    }
    @JsonIgnore
    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambres;
    @JsonIgnore
    @ManyToOne
    private Foyer foyer;
//    @ManyToOne
//    @JoinColumn(name = "foyer_id")
//    private Foyer foyer;
//
//    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
//    private Set<Chambre> chambres;
}
