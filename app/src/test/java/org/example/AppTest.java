/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void emptyExampleTest(){
        App classUnderTest = new App();
        assertNotNull(classUnderTest);
    }

    // Tests the App#add function
    // Ron Kupferman
    @Test
    public void testAdd() {
        assertEquals(175, App.add(8, 167));
        assertNotEquals(175, App.add(8, -167));
        assertEquals(0, App.add(16665, -16665));
        assertNotEquals(1, App.add(0, -1));
        assertEquals(1, App.add(-1, 2));
        assertEquals(-1, App.add(0, -1));
    }

    // Tests the App#isPrime function
    // Ron Kupferman
    @Test
    public void testIsPrime() {
        assertTrue(App.isPrime(997));
        assertFalse(App.isPrime(996));
        assertTrue(App.isPrime(1987));
        assertFalse(App.isPrime(1998));
    }

    // Tests the App#reverse function
    // Ron Kupferman
    @Test
    public void testReverse() {
        assertEquals("cba", App.reverse("abc"));
        assertNotEquals("abc", App.reverse("abc"));
        assertEquals("", App.reverse(""));
        // Test palindrome
        assertEquals("TACOCAT", App.reverse("TACOCAT"));
    }

    // Tests the App#factorial function
    // Ron Golan
    @Test
    public void testFactorial() {
        assertThrows(IllegalArgumentException.class, () -> App.factorial(-1));
        assertEquals(120, App.factorial(5));
        assertNotEquals(125, App.factorial(5));
        assertEquals(1, App.factorial(0));
        assertEquals(1, App.factorial(1));
    }

    // Tests the App#isPalindrome function
    // Ron Golan
    @Test
    public void testIsPalindrome() {
        assertFalse(App.isPalindrome("abc"));
        assertTrue(App.isPalindrome(""));
        assertTrue(App.isPalindrome("TACOCAT"));
        assertFalse(App.isPalindrome("TEST"));
    }

    // Tests the App#fibonacciUpTo function
    // Ron Golan
    @Test
    public void testFibonacciUpTo() {
        assertEquals(List.of(0, 1, 1, 2, 3, 5, 8), App.fibonacciUpTo(10));
        assertThrows(IllegalArgumentException.class, () -> App.fibonacciUpTo(-1));
    }

	@Test
	public void testAverage() {
		int[] empty = new int[0];
		int[] arr1 = {1, 6, 4, 5};
		int[] arr2 = {7, 2, 4, 11};
		assertThrows(IllegalArgumentException.class, () -> App.average(empty));
		assertEquals(4.0, App.average(arr1), 0.0000001);
		assertEquals(6.0, App.average(arr2), 0.0000001);
	}

	@Test
	public void testIsAnagram() {
		assertTrue(App.isAnagram("start", "trsta"));
		assertTrue(App.isAnagram("anagram", "gaarman"));
		assertTrue(!App.isAnagram("abcde", ""));
		assertTrue(!App.isAnagram("", "absc"));
	}

	@Test
	public void testMostCommonWord() {
		String text1 = "As the sun began to set, the light from the horizon bathed the city in a warm glow. Street lights flickered on, casting gentle light over the sidewalks. In the distance, the lighthouse beamed its light across the ocean, guiding ships safely to shore. She stood by the window, watching the fading light reflect off the glass buildings. Even as darkness crept in, tiny sources of light—from lanterns, windows, and stars—kept the world from falling completely into shadow. The light, though dimmer now, still offered comfort.";
		String text2 = "big big dog massive dog yes of course";

		assertEquals("light", App.mostCommonWord(text1));
		assertNotEquals("dog", App.mostCommonWord(text2));
	}
}
