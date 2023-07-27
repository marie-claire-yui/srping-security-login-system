package com.unkownkoder.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sejours")
public class Sejour {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer sejour_id;
    private Integer hebergement_id;
    private Float prix_sejour;
    private String nom_sejour;



    public Integer getSejour_id() {
        return sejour_id;
    }
    public void setSejour_id(Integer sejour_id) {
        this.sejour_id = sejour_id;
    }
    public Integer getHebergement_id() {
        return hebergement_id;
    }
    public void setHebergement_id(Integer hebergement_id) {
        this.hebergement_id = hebergement_id;
    }
    public Float getPrix_sejour() {
        return prix_sejour;
    }
    public void setPrix_sejour(Float prix_sejour) {
        this.prix_sejour = prix_sejour;
    }
    public String getNom_sejour() {
        return nom_sejour;
    }
    public void setNom_sejour(String nom_sejour) {
        this.nom_sejour = nom_sejour;
    }
}
