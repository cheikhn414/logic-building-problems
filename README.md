# Problèmes de Construction Logique

## Description
Ce projet est conçu pour résoudre des problèmes de construction logique en utilisant Java 21 et Maven. Il est basé sur les ressources de GeeksforGeeks pour les problèmes DSA de construction logique.

## Ressources
- [GeeksforGeeks - Logic Building Problems](https://www.geeksforgeeks.org/dsa/logic-building-problems/)

## Technologies utilisées
- **Java**: Version 21
- **Maven**: Gestionnaire de dépendances et build tool
- **JUnit 5**: Framework de test

## Structure du projet
```
logic-building-problems/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/algorithms/logicbuilding/
│   │           └── App.java
│   └── test/
│       └── java/
│           └── com/algorithms/logicbuilding/
│               └── AppTest.java
├── pom.xml
└── README.md
```

## Comment utiliser ce projet

### Prérequis
- Java 21 installé sur votre système
- Maven installé

### Compilation
```bash
mvn clean compile
```

### Exécution
```bash
mvn exec:java -Dexec.mainClass="com.algorithms.logicbuilding.App"
```

### Tests
```bash
mvn test
```

### Empaquetage
```bash
mvn package
```

## Contribution
1. Créez des classes pour différents types de problèmes de logique
2. Ajoutez des tests unitaires pour chaque solution
3. Documentez vos solutions avec des commentaires clairs
4. Utilisez les bonnes pratiques de programmation Java

## Exemples de problèmes à résoudre
- Vérification de nombres pairs/impairs
- Calculs mathématiques
- Manipulation de chaînes
- Algorithmes de tri
- Problèmes de logique booléenne
- Patterns et séquences

## Auteur
Projet créé pour l'apprentissage des problèmes de construction logique en Java. 