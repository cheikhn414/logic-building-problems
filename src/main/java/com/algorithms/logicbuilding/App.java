package com.algorithms.logicbuilding;

/**
 * Application principale pour résoudre des problèmes de construction logique.
 * Basée sur les ressources de https://www.geeksforgeeks.org/dsa/logic-building-problems/
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println("=== Problèmes de Construction Logique ===");
        System.out.println("Bienvenue dans ce projet pour résoudre des problèmes de logique!");
        System.out.println("Ressource: https://www.geeksforgeeks.org/dsa/logic-building-problems/");
        System.out.println();
        
        // Exemple de problème basique
        demonstrateBasicLogic();
    }
    
    /**
     * Démonstration d'un problème de logique basique.
     */
    public static void demonstrateBasicLogic() {
        System.out.println("--- Exemple de problème de logique ---");
        System.out.println("Vérification si un nombre est pair ou impair:");
        
        int number = 42;
        if (isEven(number)) {
            System.out.println(number + " est pair");
        } else {
            System.out.println(number + " est impair");
        }
    }
    
    /**
     * Vérifie si un nombre est pair.
     * @param number le nombre à vérifier
     * @return true si le nombre est pair, false sinon
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
