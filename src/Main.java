import java.util.*;


public class Main {
    public static void main(String[] args) {


        SocieteArrayList societe = new SocieteArrayList();

        Employe emp1 = new Employe(1, "Benaich", "Yassine", "Informatique", 3);
        Employe emp2 = new Employe(2, "Haboubi", "Safwen", "Ressources Humaines", 2);
        Employe emp3 = new Employe(3, "Farhani", "Rayen", "Informatique", 1);
        Employe emp4 = new Employe(2, "Robbena", "Amen", "Ressources Humaines", 4);


        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);
        societe.ajouterEmploye(emp4);


        System.out.println("Liste des employés :");
        societe.displayEmploye();

        System.out.println("\nTrier par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\nTrier par Département et Grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
    }
}




