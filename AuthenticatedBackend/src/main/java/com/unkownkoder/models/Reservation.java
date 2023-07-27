package com.unkownkoder.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer coordonnees_id;
    private String nom_client;
    private String prenom_client;
    private String adresse_client;
    private String mail_client;
    private String telephone_client;
    private Integer sejour_id;




    public Integer getCoordonnees_id() {
        return coordonnees_id;
    }
    public void setCoordonnees_id(Integer coordonnees_id) {
        this.coordonnees_id = coordonnees_id;
    }
    public String getNom_client() {
        return nom_client;
    }
    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }
    public String getPrenom_client() {
        return prenom_client;
    }
    public void setPrenom_client(String prenom_client) {
        this.prenom_client = prenom_client;
    }
    public String getAdresse_client() {
        return adresse_client;
    }
    public void setAdresse_client(String adresse_client) {
        this.adresse_client = adresse_client;
    }
    public String getMail_client() {
        return mail_client;
    }
    public void setMail_client(String mail_client) {
        this.mail_client = mail_client;
    }
    public String getTelephone_client() {
        return telephone_client;
    }
    public void setTelephone_client(String telephone_client) {
        this.telephone_client = telephone_client;
    }
    public Integer getSejour_id() {
        return sejour_id;
    }
    public void setSejour_id(Integer sejour_id) {
        this.sejour_id = sejour_id;
    }
}
