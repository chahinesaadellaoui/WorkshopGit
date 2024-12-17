import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Création de l'objet DepartementHashSet
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        // Création de quelques départements
        Departement dep1 = new Departement(1, "Informatique", 10);
        Departement dep2 = new Departement(2, "Ressources Humaines", 5);
        Departement dep3 = new Departement(3, "Marketing", 8);
        Departement dep4 = new Departement(4, "Finance", 6);

        // Ajouter des départements
        gestionDepartements.ajouterDepartement(dep1);
        gestionDepartements.ajouterDepartement(dep2);
        gestionDepartements.ajouterDepartement(dep3);
        gestionDepartements.ajouterDepartement(dep4);

        System.out.println("Liste des départements après ajout :");
        gestionDepartements.displayDepartement();

        // Rechercher un département par nom
        String nomRecherche = "Marketing";
        System.out.println("\nRecherche par nom (" + nomRecherche + ") : " +
                (gestionDepartements.rechercherDepartement(nomRecherche) ? "Trouvé" : "Non trouvé"));

        // Rechercher un département par objet
        Departement depRecherche = new Departement(3, "Marketing", 8);
        System.out.println("Recherche par objet : " +
                (gestionDepartements.rechercherDepartement(depRecherche) ? "Trouvé" : "Non trouvé"));

        // Supprimer un département
        System.out.println("\nSuppression du département : " + dep2);
        gestionDepartements.supprimerDepartement(dep2);
        System.out.println("Liste des départements après suppression :");
        gestionDepartements.displayDepartement();

        // Trier les départements par ID
        System.out.println("\nTri des départements par ID :");
        TreeSet<Departement> sortedDepartements = gestionDepartements.trierDepartementById();
        sortedDepartements.forEach(System.out::println);
    }
}
