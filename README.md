# **WorkshopGit**  
## **Zoo Management Project**  

Ce projet est une simulation basée sur **Java** pour la gestion des zoos. Il implémente les concepts suivants : **programmation orientée objet**, gestion des exceptions personnalisées, polymorphisme, interfaces et énumérations comme spécifié dans les **Prosits 1 à 8**.

---

## **Scripts Disponibles**  

Dans le répertoire du projet, vous pouvez exécuter :  

### **Tests**  
Testez manuellement les fonctionnalités suivantes :  
- Ajout, recherche et suppression d'animaux dans un zoo.  
- Validation des exceptions personnalisées :  
  - `ZooFullException`  
  - `InvalidAgeException`  
  - `DuplicateAnimalException`  

---

### **Compilation (Build)**  
Étant donné qu'il s'agit d'un projet **Java pur**, il n'y a pas de processus de build complexe comme dans les projets **React** ou **Node.js**. La simple étape de compilation avec `javac` est suffisante.  

---

## **Fonctionnalités**  

### **Gestion des Animaux et du Zoo**  
- Ajouter, supprimer et rechercher des animaux dans un zoo.  
- Comparer deux zoos pour déterminer lequel a le plus d'animaux.  

### **Exceptions Personnalisées**  
- **`ZooFullException`** : Levée lorsque le zoo dépasse sa capacité maximale.  
- **`InvalidAgeException`** : Levée lorsqu'un animal est créé avec un âge négatif.  
- **`DuplicateAnimalException`** : Levée lorsqu'un animal avec le même nom est ajouté deux fois.  

### **Comportements Spécialisés**  
- Les animaux aquatiques peuvent nager (méthode `swim()`).  
- Les comportements alimentaires sont définis via des interfaces (**Carnivore**, **Herbivore**, **Omnivore**).  
- Des classes spécifiques comme **Dolphin** et **Penguin** démontrent le polymorphisme.  

---

## **Structure du Projet**  

- **src/tn/esprit/gestionzoo/entities** : Contient les classes entité (Animal, Zoo, Aquatic, Terrestrial, etc.).  
- **src/tn/esprit/gestionzoo/exceptions** : Contient les classes d'exceptions personnalisées.  
- **src/tn/esprit/gestionzoo/main** : Contient la classe **Main** pour exécuter l'application.  

---

## **Liens vers les Prosits**  

Chaque **Prosit** contient des instructions spécifiques ayant contribué au développement de ce projet. Consultez la branche correspondante pour chaque : 

 - **Prosit 1** : Structure de base du projet Zoo Management, y compris les premières configurations et l'initialisation des classes Animal et Zoo.
  [Lien Prosit 1](https://github.com/chahinesaadellaoui/WorkshopGit/tree/prosit1)  

- **Prosit 2** : Structure de base des classes **Animal** et **Zoo**, constructeurs et méthode `displayZoo()`.  
  [Lien Prosit 2](https://github.com/chahinesaadellaoui/WorkshopGit/tree/prosit2)  

- **Prosit 3** : Ajout, recherche et suppression des animaux ; gestion des doublons et capacité maximale du zoo.  
  [Lien Prosit 3](https://github.com/chahinesaadellaoui/WorkshopGit/tree/prosit3)  

- **Prosit 4** : Encapsulation, validation et organisation du code en packages.  
  [Lien Prosit 4](https://github.com/chahinesaadellaoui/WorkshopGit/tree/prosit4)  

- **Prosit 5** : Introduction des sous-classes **Aquatic** et **Terrestrial**, polymorphisme avec la méthode `swim()`.  
  [Lien Prosit 5](https://github.com/chahinesaadellaoui/WorkshopGit/tree/prosit5)  

- **Prosit 6** : Fonctionnalités avancées, gestion des animaux aquatiques et calcul de la profondeur maximale.  
  [Lien Prosit 6](https://github.com/chahinesaadellaoui/WorkshopGit/tree/prosit6)  

- **Prosit 7** : Gestion des exceptions personnalisées (**ZooFullException**, **InvalidAgeException**).  
  [Lien Prosit 7](https://github.com/chahinesaadellaoui/WorkshopGit/tree/prosit7)  

- **Prosit 8** : Comportements alimentaires via les **interfaces** et les **énumérations**.  
  [Lien Prosit 8](https://github.com/chahinesaadellaoui/WorkshopGit/tree/prosit8)  

---

## **En savoir plus**  

### **Développement Java**  
Pour apprendre **Java**, consultez la [documentation officielle Java](https://docs.oracle.com/javase/tutorial/).  

---

## **Concepts Clés Utilisés**  

- **Polymorphisme** : Illustré par la méthode `swim()` et les interfaces alimentaires.  
- **Interfaces** : Implémentées via **Carnivore**, **Herbivore** et **Omnivore**.  
- **Gestion des Exceptions** : Les exceptions personnalisées assurent la validation et la gestion des erreurs.  

---

## **Dépannage**  

### **Problèmes Courants**  

#### **Erreurs de Compilation**  

- **Erreur : unreported exception InvalidAgeException**  
  Assurez-vous que tous les constructeurs ou méthodes lançant `InvalidAgeException` sont enveloppés dans un **try-catch**.  

- **Erreur : cannot find symbol**  
  Vérifiez les noms de classes et les chemins des fichiers. Utilisez la commande **javac** appropriée pour compiler les fichiers dans leurs répertoires respectifs.  

---

## **Déploiement**  
Ce projet est conçu pour fonctionner localement sur la **Java Virtual Machine (JVM)**. Aucun déploiement n'est requis.  
Pour exécuter sur un serveur, assurez-vous que le serveur dispose d'une **JVM compatible** installée.  

---

## **Auteur**  
**Chahine Saadellaoui** : Diplômé en science informatique  

---

## **Licence**  
Ce projet est open source et peut être librement modifié et redistribué.  
