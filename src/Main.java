import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Création de l'objet EtudiantManagement
        EtudiantManagement gestionEtudiants = new EtudiantManagement() {
        };

        // Création de la liste des étudiants
        List<Etudiant> Etudiants = new ArrayList<>();
        Etudiants.add(new Etudiant(1, "Yassine", 20));
        Etudiants.add(new Etudiant(2, "Rayen", 22));
        Etudiants.add(new Etudiant(3, "Safwen", 21));

        // Afficher tous les étudiants
        System.out.println("Liste des étudiants :");
        gestionEtudiants.displayEtudiants(Etudiants, System.out::println);

        // Filtrer et afficher les étudiants de plus de 20 ans
        System.out.println("\nÉtudiants âgés de plus de 20 ans :");
        gestionEtudiants.displayEtudiantsByFilter(Etudiants, s -> s.getAge() > 20, System.out::println);

        // Obtenir une liste de noms des étudiants
        String noms = gestionEtudiants.returnEtudiantsNames(Etudiants, Etudiant::getNom);
        System.out.println("\nNoms des étudiants : " + noms);

        // Créer un nouvel étudiant
        Etudiant newEtudiant = gestionEtudiants.createEtudiant(() -> new Etudiant(4, "Youssef", 23));
        Etudiants.add(newEtudiant);
        System.out.println("\nListe des étudiants après ajout :");
        gestionEtudiants.displayEtudiants(Etudiants, System.out::println);

        // Trier les étudiants par ID
        System.out.println("\nÉtudiants triés par ID :");
        List<Etudiant> sortedEtudiants = gestionEtudiants.sortEtudiantsById(Etudiants, Comparator.comparingInt(Etudiant::getId));
        sortedEtudiants.forEach(System.out::println);

        // Convertir la liste en stream et afficher
        System.out.println("\nÉtudiants via stream :");
        gestionEtudiants.convertToStream(Etudiants).forEach(System.out::println);
    }
}




