public class Main {
    public static void main(String[] args) {
        // Création de l'objet Animal (lion)
        Animal lion = new Animal("Mufasa", "Lion", 6, true);
        Animal tiger = new Animal("Shere Khan", "Tigre", 5, true);
        Animal elephant = new Animal("Baloo", "Éléphant", 10, false);
        Animal lion2 = new Animal("Mufasa", "Lion", 6, true);

        // Création de l'objet Zoo (myZoo)
        Zoo myZoo = new Zoo("Belvidaire", "Tunis", 25);
        Zoo myZoo2 = new Zoo("Havana", "Zaghouan", 19);


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
            System.out.println("Animal trouvé à l'index: " + index);
        }
        myZoo.removeAnimal(tiger);

        // Comparaison entre les zoos
        Zoo biggerZoo = Zoo.comparerZoo(myZoo, myZoo2);
        if (biggerZoo != null) {
            System.out.println("Le zoo avec le plus d'animaux est: " + biggerZoo.name);
        }


        System.out.println(myZoo);                // Appel implicite à toString()
    }
}