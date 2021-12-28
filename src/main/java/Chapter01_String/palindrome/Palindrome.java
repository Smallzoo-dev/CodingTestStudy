package Chapter01_String.palindrome;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public String solution(String problem) {
        int length = problem.length();
        for (int i = 0; i < length / 2; i++) {

        }
        return null;
    }



    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        Scanner fromKeyboard = new Scanner(System.in);
        String problem = fromKeyboard.next();
        System.out.println(palindrome.solution(problem));
    }
}
