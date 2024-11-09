package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.Omnivore;
import tn.esprit.gestionzoo.exceptions.*;

public class Terrestrial extends Animal implements Omnivore<Food> {
    public int nbrLegs;

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) throws InvalidAgeException {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    public Terrestrial() {
        super();
    }

    @Override
    public String toString() {
        return super.toString() + "Terrestrial [nbrLegs=" + nbrLegs + "]";
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " mange de la viande.");
        } else {
            System.out.println(getName() + " ne mange pas de viande.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(getName() + " mange des plantes.");
        } else {
            System.out.println(getName() + " ne mange pas de plantes.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getName() + " mange des plantes et de la viande.");
        } else {
            System.out.println(getName() + " ne mange pas cet aliment.");
        }
    }
}
