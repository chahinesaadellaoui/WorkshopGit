package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    public Float swimmingSpeed;

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, Float swimmingSpeed) {

        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;

    }
    public Dolphin() {
        super();
    }



    @Override
    public String toString() {
        return super.toString()+"Dolphin{" + "swimmingSpeed=" + swimmingSpeed + '}';
    }
    public void swim(){
        System.out.println("This dolphin is swimming");
    }
}
