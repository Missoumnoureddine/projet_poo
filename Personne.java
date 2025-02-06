
package com.mycompany.projet_de_poo;


public class Personne extends Projet_de_poo {
    private String statutMajor;


    public Personne(String nom, String prenom, int age, String sexe) {
        super(nom, prenom, age, sexe);
        if (age >= 18) {
            statutMajor = "Major";
        } else {
            statutMajor = "Non Major";
        }
    }


    public String getStatutMajor() {
        return statutMajor;
    }
}
