package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // Constructeur
    public Animal(String family, String name, int age, boolean isMammal) {
        this.setFamily(family);
        this.setName(name);
        this.setAge(age);  // Validation de l'âge à l'intérieur du setter
        this.isMammal = isMammal;
    }

    public void displayAnimal() {
        System.out.println("Famille: " + family + ", Nom: " + name + ", Âge: " + age + ", est un mammifère: " + isMammal);
    }

    @Override
    public String toString() {
        return "Famille: " + family + ", Nom: " + name + ", Âge: " + age + ", est un mammifère: " + isMammal;
    }

    // Getters et Setters avec validations

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {  // Validation pour un nom non vide
            this.name = name;
        } else {
            System.out.println("Le nom d'un animal ne peut pas être vide.");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {  // Validation pour éviter les âges négatifs
            this.age = age;
        } else {
            System.out.println("L'âge d'un animal ne peut pas être négatif.");
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
}
