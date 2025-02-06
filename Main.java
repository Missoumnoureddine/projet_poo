
package com.mycompany.projet_de_poo;

public class Main {
    public static void main(String[] args) {

        Etudiant etudiant1 = new Etudiant("oussama", "hocini", 10, "Homme", "M12345", 10);
        Etudiant_ENSK etudiant2 = new Etudiant_ENSK("amina", "bnkafil", 19, "Femme", "M67890", 15.0);
        Etudiant_ENSK etudiant3 = new Etudiant_ENSK("missoum", "noureddine", 17, "Homme", "M67891",17);


        Diplome diplome = new Diplome();


        
        diplome.ajouterEtudiant(etudiant1);
        diplome.ajouterEtudiant(etudiant2);
        diplome.ajouterEtudiant(etudiant3);
        


        diplome.afficherInformations();
    }
}
