# **WorkshopGit**  

## **Gestion d'Employés : Prosits 9 à 12**  

### **Description**  
Ce module étend le projet pour inclure un système complet de gestion des employés et des départements, avec des fonctionnalités avancées comme les lambdas et les streams. Les concepts suivants sont abordés :  

- **Gestion des employés et des départements**  
- **HashSet et HashMap pour les collections**  
- **Tri et filtrage avec TreeSet et TreeMap**  
- **Fonctions lambda et API Stream**  

---

### **Fonctionnalités**  

#### **Gestion des employés et des départements : Prosit 9 à 11**  
1. **Ajout, recherche, et suppression d'employés**.  
2. **Gestion des départements** à l'aide de `HashSet` et tri via `TreeSet`.  
3. **Affectation des employés aux départements** via `HashMap`.  
4. **Tri des employés et départements avec `TreeMap`**.  

#### **Gestion des étudiants avec lambdas et streams : Prosit 12**  
1. Affichage conditionnel des étudiants selon des prédicats.  
2. Extraction des noms des étudiants en une chaîne formatée.  
3. Création dynamique d'étudiants via un fournisseur (`Supplier`).  
4. Tri des étudiants avec un comparateur (`Comparator`).  
5. Conversion de listes en flux (`Stream`).  

---

### **Structure du Projet : Prosits 9 à 12**  

- **src/tn/esprit/gestionemployes/entities** : Contient les classes principales (Employe, Departement, Etudiant).  
- **src/tn/esprit/gestionemployes/management** : Contient les interfaces (`IGestion`, `IDepartement`, `Management`) et leurs implémentations.  
- **src/tn/esprit/gestionemployes/main** : Contient la classe **Main** pour tester toutes les fonctionnalités.  

---

## **Liens vers les Prosits**  

Chaque **Prosit** contient des instructions spécifiques ayant contribué au développement de ce module. Consultez la branche correspondante pour chaque :  

- **Prosit 9** : Gestion des employés avec une structure `ArrayList`.  
  [Lien Prosit 9](https://github.com/chahinesaadellaoui/WorkshopGit/tree/prosit9)  

- **Prosit 10** : Gestion des départements avec `HashSet` et tri avec `TreeSet`.  
  [Lien Prosit 10](https://github.com/chahinesaadellaoui/WorkshopGit/tree/prosit10)  

- **Prosit 11** : Affectation des employés aux départements avec `HashMap` et tri via `TreeMap`.  
  [Lien Prosit 11](https://github.com/chahinesaadellaoui/WorkshopGit/tree/prosit11)  

- **Prosit 12** : Gestion des étudiants avec lambdas et streams.  
  [Lien Prosit 12](https://github.com/chahinesaadellaoui/WorkshopGit/tree/prosit12)  

---

## **Concepts Clés Utilisés**  

### **Gestion des Employés et Départements**  
- Implémentation des fonctionnalités avec des collections avancées (`ArrayList`, `HashSet`, `HashMap`).  
- Gestion des tris et filtrages via `TreeSet` et `TreeMap`.  
- Respect des bonnes pratiques d'encapsulation et de validation avec des redéfinitions de méthodes (`toString`, `equals`, etc.).  

### **Programmation Fonctionnelle**  
- Utilisation des lambdas et des streams pour une manipulation dynamique des données (`Predicate`, `Consumer`, `Function`).  
- Application des paradigmes fonctionnels dans les projets de gestion d'étudiants.

---

## **Scripts Disponibles**  

Dans le répertoire du projet, vous pouvez exécuter :  

### **Tests**  
Testez manuellement les fonctionnalités suivantes :  
- Gestion des employés et départements.  
- Affectation et tri avec `HashMap` et `TreeMap`.  
- Affichage et manipulation des étudiants avec lambdas et streams.  

### **Compilation (Build)**  
Étant donné qu'il s'agit d'un projet **Java pur**, il n'y a pas de processus de build complexe comme dans les projets **React** ou **Node.js**. La simple étape de compilation avec `javac` est suffisante.  

---

## **Auteur**  
**Chahine Saadellaoui** : Diplômé en science informatique  

---

## **Licence**  
Ce projet est open source et peut être librement modifié et redistribué.  

---

### **Notes Importantes**  
- Veillez à tester chaque module dans sa branche respective.  
- Le projet est conçu pour être exécuté localement via une JVM compatible.

---

Si vous souhaitez d'autres modifications ou sections, faites-le-moi savoir !
