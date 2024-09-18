import java.util.Scanner;
public class Zooman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Donner le nom du zoo: ");
        String zoo_name = scanner.nextLine();
        while (zoo_name.trim().isEmpty()) {
            System.out.printf("Le nom du zoo est vide");
            zoo_name = scanner.nextLine();
        }
        System.out.printf("Donner le nombre de cages: ");
        while (!scanner.hasNextInt()) {
            System.out.printf("Entrer un entier valide pour le nombre de cages: ");
            scanner.next();
        }
        int nbrcages = scanner.nextInt();
        System.out.printf(zoo_name + "comporte" + nbrcages +  "cages");
    }
}