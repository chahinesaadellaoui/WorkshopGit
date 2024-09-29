public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int NBR_CAGES=25;
    int nbrAnimals = 0;


    // Constructeur
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        animals = new Animal[NBR_CAGES]; // Le zoo peut contenir jusqu'à 25 animaux
    }
    boolean addAnimal(Animal animal) {
        if (this.searchAnimal(animal.name) == -1 && nbrAnimals < NBR_CAGES) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        }
        return false;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo: " + name + ", Ville: " + city + ", Nombre de cages: " + NBR_CAGES);
    }
    public int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(name)) {
                return i;
            }
        }
        return -1; // Animal non trouvé
    }

    boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.name);
        this.animals[index] = null;
        return true;
    }


    boolean isZooFull(){
        return nbrAnimals > NBR_CAGES;
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else if (z2.nbrAnimals > z1.nbrAnimals) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
            return null; // En cas d'égalité
        }
    }

}