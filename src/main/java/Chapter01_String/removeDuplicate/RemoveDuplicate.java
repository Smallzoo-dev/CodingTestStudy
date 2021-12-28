package Chapter01_String.removeDuplicate;

import java.util.Scanner;

public class RemoveDuplicate {
    public String solution(String problem) {
        String answer = "";
        for (int i = 0; i < problem.length(); i++) {
            if (problem.indexOf(problem.charAt(i)) == 1) {
                answer += problem.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        Scanner fromKeyboard = new Scanner(System.in);
        String problem = fromKeyboard.next();
        System.out.println(removeDuplicate.solution(problem));
    }
}
