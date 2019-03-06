package com.objis.spring.demodomaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

	private int id; // Identifiant formation (Clé primaire)
    private String theme; // Thème formation

    public Formation(int id, String theme) {
        super ();
        this.id = id;
        this.theme = theme;
    }

    //public void create(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "[theme=" + theme + "]";
    }
}
