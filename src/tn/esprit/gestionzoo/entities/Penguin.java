package tn.esprit.gestionzoo.entities;


public class Penguin extends Aquatic {

    public Float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal, String habitat,Float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;

    }
    public Penguin() {
        super();
    }

    @Override
    public String toString() {
        return super.toString()+"Penguin{" + "swimmingDepth=" + swimmingDepth + '}';
    }
}

