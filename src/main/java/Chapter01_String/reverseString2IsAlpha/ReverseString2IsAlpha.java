package Chapter01_String.reverseString2IsAlpha;

import java.util.Scanner;

public class ReverseString2IsAlpha {
    public String solution(String problem) {
        char[] charArrayWithProblem = problem.toCharArray();
        int left = 0;
        int right = problem.length() - 1;
        while (left < right) {
            if (Character.isAlphabetic(charArrayWithProblem[left])
                    && Character.isAlphabetic(charArrayWithProblem[right])) {
                char tempChar = charArrayWithProblem[left];
                charArrayWithProblem[left] = charArrayWithProblem[right];
                charArrayWithProblem[right] = tempChar;
                left++;
                right--;
            } else {
                left++;
                right--;
            }
        }
        return String.valueOf(charArrayWithProblem);
    }

    public static void main(String[] args) {
        ReverseString2IsAlpha reverseString2IsAlpha = new ReverseString2IsAlpha();
        Scanner fromKeyboard = new Scanner(System.in);
        String problem = fromKeyboard.next();
        System.out.println(reverseString2IsAlpha.solution(problem));

    }
}
