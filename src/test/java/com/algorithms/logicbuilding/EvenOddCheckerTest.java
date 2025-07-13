package com.algorithms.logicbuilding;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Tests unitaires pour la classe EvenOddChecker.
 */
@DisplayName("EvenOddChecker Tests")
public class EvenOddCheckerTest {
    
    @Test
    @DisplayName("Test isEvenNaive avec nombres pairs")
    public void testIsEvenNaiveWithEvenNumbers() {
        assertTrue(EvenOddChecker.isEvenNaive(0));
        assertTrue(EvenOddChecker.isEvenNaive(2));
        assertTrue(EvenOddChecker.isEvenNaive(4));
        assertTrue(EvenOddChecker.isEvenNaive(100));
        assertTrue(EvenOddChecker.isEvenNaive(-2));
        assertTrue(EvenOddChecker.isEvenNaive(-100));
    }
    
    @Test
    @DisplayName("Test isEvenNaive avec nombres impairs")
    public void testIsEvenNaiveWithOddNumbers() {
        assertFalse(EvenOddChecker.isEvenNaive(1));
        assertFalse(EvenOddChecker.isEvenNaive(3));
        assertFalse(EvenOddChecker.isEvenNaive(5));
        assertFalse(EvenOddChecker.isEvenNaive(101));
        assertFalse(EvenOddChecker.isEvenNaive(-1));
        assertFalse(EvenOddChecker.isEvenNaive(-101));
    }
    
    @Test
    @DisplayName("Test isEvenBitwise avec nombres pairs")
    public void testIsEvenBitwiseWithEvenNumbers() {
        assertTrue(EvenOddChecker.isEvenBitwise(0));
        assertTrue(EvenOddChecker.isEvenBitwise(2));
        assertTrue(EvenOddChecker.isEvenBitwise(4));
        assertTrue(EvenOddChecker.isEvenBitwise(100));
        assertTrue(EvenOddChecker.isEvenBitwise(-2));
        assertTrue(EvenOddChecker.isEvenBitwise(-100));
    }
    
    @Test
    @DisplayName("Test isEvenBitwise avec nombres impairs")
    public void testIsEvenBitwiseWithOddNumbers() {
        assertFalse(EvenOddChecker.isEvenBitwise(1));
        assertFalse(EvenOddChecker.isEvenBitwise(3));
        assertFalse(EvenOddChecker.isEvenBitwise(5));
        assertFalse(EvenOddChecker.isEvenBitwise(101));
        assertFalse(EvenOddChecker.isEvenBitwise(-1));
        assertFalse(EvenOddChecker.isEvenBitwise(-101));
    }
    
    @Test
    @DisplayName("Test que les deux approches donnent le même résultat")
    public void testBothApproachesGiveSameResult() {
        int[] testNumbers = {0, 1, 2, 3, 4, 5, 42, 43, 100, 101, -1, -2, -42, -43};
        
        for (int number : testNumbers) {
            assertEquals(EvenOddChecker.isEvenNaive(number), EvenOddChecker.isEvenBitwise(number),
                    "Les deux approches doivent donner le même résultat pour " + number);
        }
    }
    
    @ParameterizedTest
    @DisplayName("Test avec nombres pairs via paramètres")
    @ValueSource(ints = {0, 2, 4, 6, 8, 10, 100, 1000, -2, -4, -100})
    public void testEvenNumbersParameterized(int number) {
        assertTrue(EvenOddChecker.isEven(number));
        assertTrue(EvenOddChecker.isEvenFast(number));
        assertFalse(EvenOddChecker.isOdd(number));
        assertFalse(EvenOddChecker.isOddFast(number));
    }
    
    @ParameterizedTest
    @DisplayName("Test avec nombres impairs via paramètres")
    @ValueSource(ints = {1, 3, 5, 7, 9, 11, 101, 1001, -1, -3, -101})
    public void testOddNumbersParameterized(int number) {
        assertFalse(EvenOddChecker.isEven(number));
        assertFalse(EvenOddChecker.isEvenFast(number));
        assertTrue(EvenOddChecker.isOdd(number));
        assertTrue(EvenOddChecker.isOddFast(number));
    }
    
    @Test
    @DisplayName("Test cas limites")
    public void testEdgeCases() {
        // Test avec 0 (nombre pair)
        assertTrue(EvenOddChecker.isEven(0));
        assertTrue(EvenOddChecker.isEvenFast(0));
        
        // Test avec Integer.MAX_VALUE (nombre impair)
        assertFalse(EvenOddChecker.isEven(Integer.MAX_VALUE));
        assertFalse(EvenOddChecker.isEvenFast(Integer.MAX_VALUE));
        
        // Test avec Integer.MIN_VALUE (nombre pair)
        assertTrue(EvenOddChecker.isEven(Integer.MIN_VALUE));
        assertTrue(EvenOddChecker.isEvenFast(Integer.MIN_VALUE));
    }
    
    @Test
    @DisplayName("Test cohérence entre toutes les méthodes")
    public void testAllMethodsConsistency() {
        int[] testNumbers = {0, 1, 2, 3, 42, 43, -1, -2, -42, -43, 100, 101};
        
        for (int number : testNumbers) {
            boolean expected = (number % 2 == 0);
            
            assertEquals(expected, EvenOddChecker.isEvenNaive(number));
            assertEquals(expected, EvenOddChecker.isEvenBitwise(number));
            assertEquals(expected, EvenOddChecker.isEven(number));
            assertEquals(expected, EvenOddChecker.isEvenFast(number));
            assertEquals(!expected, EvenOddChecker.isOdd(number));
            assertEquals(!expected, EvenOddChecker.isOddFast(number));
        }
    }
} 