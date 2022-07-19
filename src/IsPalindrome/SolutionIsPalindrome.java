package IsPalindrome;

import java.util.ArrayList;
import java.util.Collections;

public class SolutionIsPalindrome {
    public static void main(String[] args) {

    }

    public static int numberLength(int num) {
        if (num == 0) return 1;
        int counter = 0;
        num = Math.abs(num);
        while (num > 0) {
            counter++;
            num /= 10;
        }
        return counter;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        ArrayList<Integer> numList = new ArrayList<Integer>();
        while (x > 0) {
            numList.add(x % 10);
            x /= 10;
        }
        ArrayList<Integer> numListReversed = new ArrayList<Integer>(numList);
        Collections.reverse(numListReversed);
        return numList.equals(numListReversed);
//        int length = numberLength(num);
//        for (int i = 1; i < length; i++) {
//            if ((num / i * length * 10) != (num % i * length * 10)) return false;
//        }
//
//        return true;

//        if (x < 0) return false;
//
//        if (x >= 0 && x <= 9) return true;
//
//        if (x >= 10 && x <= 99) {
//            int firstChar = x / 10;
//            int lastChar = x % 10;
//            if (firstChar == lastChar) return true;
//        }
//
//        if (x >= 100 && x <= 230) {
//            int firstChar = x / 100;
//            int lastChar = x % 10;
//            if (firstChar == lastChar) return true;
//        }
    }
}
/*
 * Есть функции:
 * Сложение, вычитание, умножение, деление
 * нужно написать функцию, в которой будет Корень или квадрат и так далее.
 */


//9. Palindrome Number
//        Easy
//
//        Given an integer x, return true if x is palindrome integer.
//
//        An integer is a palindrome when it reads the same backward as forward.
//
//        For example, 121 is a palindrome while 123 is not.
//
//
//
//        Example 1:
//
//        Input: x = 121
//        Output: true
//        Explanation: 121 reads as 121 from left to right and from right to left.
//
//        Example 2:
//
//        Input: x = -121
//        Output: false
//        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//
//        Example 3:
//
//        Input: x = 10
//        Output: false
//        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//
//
//
//        Constraints:
//
//        -231 <= x <= 231 - 1
//
//
//        Follow up: Could you solve it without converting the integer to a string?