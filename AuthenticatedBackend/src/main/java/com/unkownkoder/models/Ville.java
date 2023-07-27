package com.unkownkoder.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="villes")
public class Ville {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer ville_id;
    private String nom_ville;



    public Integer getVille_id() {
        return ville_id;
    }
    public void setVille_id(Integer ville_id) {
        this.ville_id = ville_id;
    }
    public String getNom_ville() {
        return nom_ville;
    }
    public void setNom_ville(String nom_ville) {
        this.nom_ville = nom_ville;
    }
}
