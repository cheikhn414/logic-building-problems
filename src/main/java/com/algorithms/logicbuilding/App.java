package com.algorithms.logicbuilding;

/**
 * Application principale pour résoudre des problèmes de construction logique.
 * Basée sur les ressources de https://www.geeksforgeeks.org/dsa/logic-building-problems/
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println("=== Logic Building Problems ===");
        System.out.println("Welcome to this project for solving logic problems!");
        System.out.println("Resource: https://www.geeksforgeeks.org/dsa/logic-building-problems/");
        System.out.println();
        
        // Démonstration de l'algorithme Even/Odd
        demonstrateEvenOddAlgorithm();
    }
    
    /**
     * Démonstration de l'algorithme Even/Odd avec différentes approches.
     */
    public static void demonstrateEvenOddAlgorithm() {
        System.out.println("--- Even/Odd Algorithm Demonstration ---");
        System.out.println("Based on: https://www.geeksforgeeks.org/dsa/check-whether-given-number-even-odd/");
        System.out.println();
        
        int[] testNumbers = {0, 1, 2, 3, 42, 43, -1, -2, 100, 101};
        
        for (int number : testNumbers) {
            System.out.println("Testing number: " + number);
            
            // Approche naïve (modulo)
            boolean isEvenNaive = EvenOddChecker.isEvenNaive(number);
            System.out.println("  Naive approach (modulo): " + (isEvenNaive ? "EVEN" : "ODD"));
            
            // Approche efficace (bitwise)
            boolean isEvenBitwise = EvenOddChecker.isEvenBitwise(number);
            System.out.println("  Bitwise approach: " + (isEvenBitwise ? "EVEN" : "ODD"));
            
            // Vérification de cohérence
            if (isEvenNaive == isEvenBitwise) {
                System.out.println("  ✓ Both approaches agree");
            } else {
                System.out.println("  ✗ Approaches disagree!");
            }
            
            System.out.println();
        }
        
        // Démonstration de performance comparative
        demonstratePerformanceComparison();
    }
    
    /**
     * Démonstration comparative de performance entre les deux approches.
     */
    public static void demonstratePerformanceComparison() {
        System.out.println("--- Performance Comparison ---");
        
        int iterations = 1000000;
        int testNumber = 123456789;
        
        // Test de l'approche naïve
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            EvenOddChecker.isEvenNaive(testNumber + i);
        }
        long naiveTime = System.nanoTime() - startTime;
        
        // Test de l'approche bitwise
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            EvenOddChecker.isEvenBitwise(testNumber + i);
        }
        long bitwiseTime = System.nanoTime() - startTime;
        
        System.out.println("Testing " + iterations + " iterations:");
        System.out.println("  Naive approach (modulo): " + naiveTime / 1_000_000 + " ms");
        System.out.println("  Bitwise approach: " + bitwiseTime / 1_000_000 + " ms");
        
        if (bitwiseTime < naiveTime) {
            double improvement = (double) (naiveTime - bitwiseTime) / naiveTime * 100;
            System.out.println("  Bitwise is " + String.format("%.2f", improvement) + "% faster");
        } else if (naiveTime < bitwiseTime) {
            double improvement = (double) (bitwiseTime - naiveTime) / bitwiseTime * 100;
            System.out.println("  Naive is " + String.format("%.2f", improvement) + "% faster");
        } else {
            System.out.println("  Both approaches have similar performance");
        }
        
        System.out.println();
        System.out.println("Note: Bitwise operations are generally faster as they work directly");
        System.out.println("with binary representation, while modulo requires division.");
    }
}
