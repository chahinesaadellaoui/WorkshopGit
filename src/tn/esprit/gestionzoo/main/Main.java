package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {

        /*   // Création de l'objet tn.esprit.gestionzoo.entities.Animal (lion)
        Animal lion = new Animal("Mufasa", "Lion", 6, true);
        Animal tiger = new Animal("Shere Khan", "Tigre", 5, true);
        Animal elephant = new Animal("Baloo", "Éléphant", 10, false);
        Animal lion2 = new Animal("Mufasa", "Lion", 6, true);

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
        Zoo myZoo = new Zoo("Belvidaire", "Tunis");


        Animal animal = new Animal("Mufasa", "Lion", 6, true);
       /* Aquatic aquatic = new Aquatic("Poisson", "Thon", 2, false, "Océan");*/
        Terrestrial terrestrial = new Terrestrial("Reptile", "Tortue", 100, false, 4);
        Dolphin dolphin1 = new Dolphin("Cétacé", "Dauphin Bleu", 8, true, "Mer Méditerranée", 40.5f);
        Dolphin dolphin2 = new Dolphin("Cétacé", "Dauphin Gris", 5, true, "Océan Atlantique", 30.2f);
        Penguin penguin1 = new Penguin("Oiseau", "Pingouin Empereur", 3, true, "Antarctique", 15.3f);
        Penguin penguin2 = new Penguin("Oiseau", "Pingouin de Humboldt", 2, true, "Amérique du Sud", 10.0f);


        System.out.println(animal);
      /*  System.out.println(aquatic);*/
        System.out.println(terrestrial);
        System.out.println(dolphin1);
        System.out.println(dolphin2);
        System.out.println(penguin1);
        System.out.println(penguin2);

        myZoo.addAquaticAnimal(dolphin1);
        myZoo.addAquaticAnimal(dolphin2);
        myZoo.addAquaticAnimal(penguin1);
        myZoo.addAquaticAnimal(penguin2);

        myZoo.displayAllAquaticSwimming();
        System.out.println("Liste des animaux aquatiques et leur nage :");

        myZoo.displayNumberOfAquaticsByType();
        System.out.println("\nle nombre des animaux aquatiques :");


        float maxDepth = myZoo.maxPenguinSwimmingDepth();
        System.out.println("La profondeur maximale des pingouins dans le zoo est : " + maxDepth + " mètres.");


       /* dolphin1.swim();
        dolphin2.swim();
        penguin1.swim();
        penguin2.swim();*/

        Dolphin dolphin3 = new Dolphin("Cétacé", "Dauphin Bleu", 8, true, "Mer Méditerranée", 40.5f);
        boolean dolphinEqual = dolphin1.equals(dolphin3);
        System.out.println("Les deux dophins sont-ils identiques ?: " + dolphinEqual);
    }





}