import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations = new HashMap<>();

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        affectations.forEach((employe, departement) ->
                System.out.println(employe + " -> " + departement));
    }

    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        affectations.remove(e, d);
    }

    public void afficherEmployes() {
        affectations.keySet().forEach(System.out::println);
    }

    public void afficherDepartements() {
        affectations.values().forEach(System.out::println);
    }

    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    public Map<Employe, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }
}
