package com.unkownkoder.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="type_hebergements")
public class type_hebergement {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer type_hebergement_id;
    private String type_hebergement;



    public Integer getType_hebergement_id() {
        return type_hebergement_id;
    }
    public void setType_hebergement_id(Integer type_hebergement_id) {
        this.type_hebergement_id = type_hebergement_id;
    }
    public String getType_hebergement() {
        return type_hebergement;
    }
    public void setType_hebergement(String type_hebergement) {
        this.type_hebergement = type_hebergement;
    }
}
