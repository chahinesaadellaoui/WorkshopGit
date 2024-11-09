package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.*;

public class Terrestrial extends Animal {
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
}
