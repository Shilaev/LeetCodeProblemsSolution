package IsPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class SolutionIsPalindromeIsPalindromeTest {

    @Test
    void isPalindrome_121_true() throws Exception {
        assertTrue(SolutionIsPalindrome.isPalindrome(121));
    }

    @Test
    void isPalindrome_minus121_false() throws Exception {
        assertFalse(SolutionIsPalindrome.isPalindrome(-121));
    }

    @Test
    void isPalindrome_123_false() throws Exception {
        assertFalse(SolutionIsPalindrome.isPalindrome(123));
    }

    @Test
    void isPalindrome_10_false() throws Exception {
        assertFalse(SolutionIsPalindrome.isPalindrome(10));
    }

    @Test
    void isPalindrome_44_true() throws Exception {
        assertTrue(SolutionIsPalindrome.isPalindrome(44));
    }

    @Test
    void isPalindrome_313_true() throws Exception {
        assertTrue(SolutionIsPalindrome.isPalindrome(313));
    }

    @Test
    void isPalindrome_0_true() throws Exception {
        assertTrue(SolutionIsPalindrome.isPalindrome(0));
    }

    @Test
    void isPalindrome_1_true() throws Exception {
        assertTrue(SolutionIsPalindrome.isPalindrome(1));
    }

    @Test
    void isPalindrome_6_true() throws Exception {
        assertTrue(SolutionIsPalindrome.isPalindrome(6));
    }

    @Test
    void isPalindrome_66666_true() throws Exception {
        assertTrue(SolutionIsPalindrome.isPalindrome(6666));
    }

    @Test
    void isPalindrome_8723278_true() throws Exception {
        assertTrue(SolutionIsPalindrome.isPalindrome(8723278));
    }

    @Test
    void isPalindrome_8723279_false() throws Exception {
        assertFalse(SolutionIsPalindrome.isPalindrome(8723279));
    }

}