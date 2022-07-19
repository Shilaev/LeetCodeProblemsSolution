package IsPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionIsPalindromeCharsInNumberTest {

    @Test
    void charsInNumber_1_1() {
        assertEquals(1, SolutionIsPalindrome.numberLength(1));
    }

    @Test
    void charsInNumber_123456789_9() {
        assertEquals(9, SolutionIsPalindrome.numberLength(123456789));
    }

    @Test
    void charsInNumber_minus123456789_9() {
        assertEquals(9, SolutionIsPalindrome.numberLength(-123456789));
    }

    @Test
    void charsInNumber_0_1() {
        assertEquals(1, SolutionIsPalindrome.numberLength(0));
    }

    @Test
    void charsInNumber_minus749238560_9() {
        assertEquals(9, SolutionIsPalindrome.numberLength(-749238560));
    }
}