public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void displayAnimal() {
        System.out.println("Famille: " + family + ", Nom: " + name + ", Âge: " + age + ", est un mammifère: " + isMammal);
    }

}