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

    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    public void setPrenomEtudiant(String prenomEtudiant) {
        this.prenomEtudiant = prenomEtudiant;
    }

    public long getCin() {
        return cin;
    }

    public void setCin(long cin) {
        this.cin = cin;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
