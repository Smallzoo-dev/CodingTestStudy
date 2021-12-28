package Chapter01_String.toUpperCase;


import java.util.Scanner;

public class ToUpperCase {

    public String solution(String str) {
        String answer = "";
        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each)) {
                answer += Character.toLowerCase(each);
            } else {
                answer += Character.toUpperCase(each);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ToUpperCase toUpperCase = new ToUpperCase();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(toUpperCase.solution(str));
    }
}
