import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {
    private ArrayList<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe t) {
        employes.add(t);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return employes.stream().anyMatch(e -> e.getNom().equals(nom));
    }

    @Override
    public boolean rechercherEmploye(Employe t) {
        return employes.contains(t);
    }

    @Override
    public void supprimerEmploye(Employe t) {
        employes.remove(t);
    }

    @Override
    public void displayEmploye() {
        employes.forEach(System.out::println);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes, Comparator.comparingInt(Employe::getId));
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes, Comparator.comparing(Employe::getNomDepartement)
                .thenComparing(Employe::getGrade));
    }
}
