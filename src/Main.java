public class Main {
    public static void main(String[] args) {
        // Création de l'objet Animal (lion)
        Animal lion = new Animal("Mufasa", "Lion", 6, true);

        // Création de l'objet Zoo (myZoo)
        Zoo myZoo = new Zoo("Belvidaire", "Tunis", 25);

        // Ajout de l'animal au zoo
        myZoo.addAnimal(lion, 0);

        // Affichage des détails du zoo et des animaux
        myZoo.displayZoo();
        lion.displayAnimal();

        System.out.println(myZoo);                // Appel implicite à toString()
        System.out.println(myZoo.toString());
    }
}