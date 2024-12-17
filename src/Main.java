public class Main {
    public static void main(String[] args) {
        // Création de l'objet AffectationHashMap
        AffectationHashMap gestionAffectations = new AffectationHashMap();

        SocieteArrayList societe = new SocieteArrayList();

        Employe emp1 = new Employe(1, "Benaich", "Yassine", "Informatique", 3);
        Employe emp2 = new Employe(2, "Haboubi", "Safwen", "Ressources Humaines", 2);
        Employe emp3 = new Employe(3, "Farhani", "Rayen", "Informatique", 1);
        Employe emp4 = new Employe(2, "Robbena", "Amen", "Ressources Humaines", 4);


        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);
        societe.ajouterEmploye(emp4);

        // Création des départements
        Departement dep1 = new Departement(1, "Informatique", 10);
        Departement dep2 = new Departement(2, "Ressources Humaines", 5);
        Departement dep3 = new Departement(3, "Marketing", 8);

        // Ajouter des affectations
        gestionAffectations.ajouterEmployeDepartement(emp1, dep1);
        gestionAffectations.ajouterEmployeDepartement(emp2, dep2);
        gestionAffectations.ajouterEmployeDepartement(emp3, dep3);

        System.out.println("Affectations initiales :");
        gestionAffectations.afficherEmployesEtDepartements();

        // Ajouter le même employé à un autre département (emp1 -> dep3)
        gestionAffectations.ajouterEmployeDepartement(emp1, dep3);
        System.out.println("\nAprès modification de l'affectation (emp1 -> dep3) :");
        gestionAffectations.afficherEmployesEtDepartements();

        // Supprimer un employé
        gestionAffectations.supprimerEmploye(emp2);
        System.out.println("\nAprès suppression de l'employé emp2 :");
        gestionAffectations.afficherEmployesEtDepartements();

        // Recherche d'un employé
        System.out.println("\nRecherche de l'employé emp1 : " +
                (gestionAffectations.rechercherEmploye(emp1) ? "Trouvé" : "Non trouvé"));

        // Recherche d'un département
        System.out.println("Recherche du département dep2 : " +
                (gestionAffectations.rechercherDepartement(dep2) ? "Trouvé" : "Non trouvé"));

        // Trier les employés par ID et afficher
        System.out.println("\nAffectations triées par ID des employés :");
        gestionAffectations.trierMap().forEach((employe, departement) ->
                System.out.println(employe + " -> " + departement));
    }
}
