package com.unkownkoder.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hebergements")
public class hebergements {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer hebergement_id;
    private String nom_hebergement;
    private String mail_hebergement;
    private String tel_hebergement;
    private Integer ville_id;
    private Integer type_hebergement_id;




    public Integer getHebergement_id() {
        return hebergement_id;
    }
    public void setHebergement_id(Integer hebergement_id) {
        this.hebergement_id = hebergement_id;
    }
    public String getNom_hebergement() {
        return nom_hebergement;
    }
    public void setNom_hebergement(String nom_hebergement) {
        this.nom_hebergement = nom_hebergement;
    }
    public String getMail_hebergement() {
        return mail_hebergement;
    }
    public void setMail_hebergement(String mail_hebergement) {
        this.mail_hebergement = mail_hebergement;
    }
    public String getTel_hebergement() {
        return tel_hebergement;
    }
    public void setTel_hebergement(String tel_hebergement) {
        this.tel_hebergement = tel_hebergement;
    }
    public Integer getVille_id() {
        return ville_id;
    }
    public void setVille_id(Integer ville_id) {
        this.ville_id = ville_id;
    }
    public Integer getType_hebergement_id() {
        return type_hebergement_id;
    }
    public void setType_hebergement_id(Integer type_hebergement_id) {
        this.type_hebergement_id = type_hebergement_id;
    }
}
