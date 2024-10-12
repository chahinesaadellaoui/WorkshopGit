package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {
     /*   // Création de l'objet tn.esprit.gestionzoo.entities.Animal (lion)
        Animal lion = new Animal("Mufasa", "Lion", 6, true);
        Animal tiger = new Animal("Shere Khan", "Tigre", 5, true);
        Animal elephant = new Animal("Baloo", "Éléphant", 10, false);
        Animal lion2 = new Animal("Mufasa", "Lion", 6, true);

        // Création de l'objet tn.esprit.gestionzoo.entities.Zoo (myZoo)
        Zoo myZoo = new Zoo("Belvidaire", "Tunis");
        Zoo myZoo2 = new Zoo("Havana", "Zaghouan");


        // Ajout de l'animal au zoo
        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(lion2);



        // Affichage des détails du zoo et des animaux
        myZoo.displayZoo();
        lion.displayAnimal();

        myZoo.displayZoo();

        // Recherche et suppression d'un animal
        int index = myZoo.searchAnimal("Mufasa");
        if (index != -1) {
            System.out.println("tn.esprit.gestionzoo.entities.Animal trouvé à l'index: " + index);
        }
        myZoo.removeAnimal(tiger);

        // Comparaison entre les zoos
        Zoo biggerZoo = Zoo.comparerZoo(myZoo, myZoo2);
        if (biggerZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est: " + biggerZoo.getName());
        }


        System.out.println(myZoo);                // Appel implicite à toString()
    */
        Animal animal = new Animal("Mufasa", "Lion", 6, true);
        Aquatic aquatic = new Aquatic("Poisson", "Thon", 2, false, "Océan");
        Terrestrial terrestrial = new Terrestrial("Reptile", "Tortue", 100, false, 4);
        Dolphin dolphin = new Dolphin("Cétacé", "Dauphin", 8, true, "Mer", 40.5f);
        Penguin penguin = new Penguin("Oiseau", "Pingouin", 3, true, "Antarctique", 15.3f);

        System.out.println(animal);
        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        aquatic.swim();
        dolphin.swim();
        penguin.swim();

    }





}