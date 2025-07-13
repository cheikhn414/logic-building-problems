package com.algorithms.logicbuilding;

/**
 * Classe pour vérifier si un nombre est pair ou impair.
 * Implémente deux approches : naïve avec modulo et efficace avec bitwise AND.
 * 
 * Basée sur : https://www.geeksforgeeks.org/dsa/check-whether-given-number-even-odd/
 */
public class EvenOddChecker {
    
    /**
     * [Approche naïve] Vérifie si un nombre est pair en utilisant l'opérateur modulo.
     * Complexité temporelle : O(1), Complexité spatiale : O(1)
     * 
     * @param n le nombre à vérifier
     * @return true si le nombre est pair, false s'il est impair
     */
    public static boolean isEvenNaive(int n) {
        // Trouver le reste de la division par 2
        int rem = n % 2;
        return rem == 0;
    }
    
    /**
     * [Approche efficace] Vérifie si un nombre est pair en utilisant l'opérateur bitwise AND.
     * Complexité temporelle : O(1), Complexité spatiale : O(1)
     * 
     * Le dernier bit de tous les nombres impairs est toujours 1, 
     * tandis que pour les nombres pairs, c'est 0.
     * 
     * @param n le nombre à vérifier
     * @return true si le nombre est pair, false s'il est impair
     */
    public static boolean isEvenBitwise(int n) {
        // Opération bitwise AND avec 1
        return (n & 1) == 0;
    }
    
    /**
     * Version simplifiée de l'approche naïve.
     * 
     * @param n le nombre à vérifier
     * @return true si le nombre est pair, false s'il est impair
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    
    /**
     * Version simplifiée de l'approche bitwise.
     * 
     * @param n le nombre à vérifier
     * @return true si le nombre est pair, false s'il est impair
     */
    public static boolean isEvenFast(int n) {
        return (n & 1) == 0;
    }
    
    /**
     * Vérifie si un nombre est impair.
     * 
     * @param n le nombre à vérifier
     * @return true si le nombre est impair, false s'il est pair
     */
    public static boolean isOdd(int n) {
        return !isEven(n);
    }
    
    /**
     * Vérifie si un nombre est impair en utilisant l'approche bitwise.
     * 
     * @param n le nombre à vérifier
     * @return true si le nombre est impair, false s'il est pair
     */
    public static boolean isOddFast(int n) {
        return (n & 1) == 1;
    }
} 