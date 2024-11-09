package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.*;
import tn.esprit.gestionzoo.Carnivore;


public abstract class Aquatic extends Animal implements Carnivore<Food> {
    protected String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) throws InvalidAgeException {

        super(family, name, age, isMammal);
        this.habitat = habitat;

    }
public Aquatic() {

        super();
}

    @Override
    public String toString() {

        return super.toString() + "Aquatic{" + "habitat=" + habitat + '}';
    }

    public abstract void swim();
    {
        System.out.println("This aquatic animal is swimming.");
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aquatic other = (Aquatic) obj;
        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.habitat.equals(other.habitat);
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(getName() + " mange de la viande.");
        } else {
            System.out.println(getName() + " ne mange pas cet aliment.");
        }
    }

}

