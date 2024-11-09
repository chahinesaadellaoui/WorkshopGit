package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.*;


public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int NBR_CAGES = 3;
    private int nbrAnimals = 0;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int nbrAquaticAnimals = 0;


    // Constructeur
    public Zoo(String name, String city) {
        this.setName(name);  // Utilise le setter pour valider le nom
        this.city = city;
        animals = new Animal[NBR_CAGES];  // Le zoo peut contenir jusqu'à 25 animaux
    }

   /* public boolean addAnimal(Animal animal) {
        if (this.searchAnimal(animal.getName()) == -1 && !isZooFull()) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        } else if (isZooFull()) {
            System.out.println("Le zoo est plein, impossible d'ajouter plus d'animaux.");
        } else {
            System.out.println("L'animal existe déjà dans le zoo.");
        }
        return false;
    }*/

    public void addAnimal(Animal animal) throws ZooFullException {
        if (nbrAnimals >= NBR_CAGES) { // Si le zoo est plein, lève une exception
            throw new ZooFullException("Le zoo est plein, impossible d'ajouter plus d'animaux.");
        }
        animals[nbrAnimals] = animal; // Ajoute l’animal dans le tableau
        nbrAnimals++;
        System.out.println("Animal ajouté : " + animal.getName());
    }



    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals < aquaticAnimals.length) {
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
        } else {
            System.out.println("Le tableau des animaux aquatiques est plein.");
        }
    }

    public void displayAllAquaticSwimming() {
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            aquaticAnimals[i].swim();
        }
    }


    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.swimmingDepth > maxDepth) {
                    maxDepth = penguin.swimmingDepth;
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int nbrdolphin = 0;
        int nbrpinguin = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrdolphin++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                nbrpinguin++;
            }
        }
        System.out.println("Nombre de dauphins: " + nbrdolphin);
        System.out.println("Nombre de pingouins: " + nbrpinguin);
    }



    public void displayZoo() {
        System.out.println("Nom du zoo: " + name + ", Ville: " + city + ", Nombre de cages: " + NBR_CAGES);
    }

    public int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;  // tn.esprit.gestionzoo.entities.Animal non trouvé
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.getName());
        if (index != -1) {
            animals[index] = null;
            return true;
        }
        return false;
    }

    public boolean isZooFull() {
        return nbrAnimals >= NBR_CAGES;
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

    // Getters et Setters avec validation pour le nom du zoo

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {  // Validation pour un nom de zoo non vide
            this.name = name;
        } else {
            System.out.println("Le nom du zoo ne peut pas être vide.");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
}
