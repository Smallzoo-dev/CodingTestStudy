package Chapter01_String.wordIndSentence;

import java.util.Scanner;

public class WordInSentence {

    public String solution1(String problemStr) {
        String answer = "";
        int count = Integer.MIN_VALUE;
        String[] strArr = problemStr.split(" ");
        for (String eachWord : strArr) {
            int length = eachWord.length();
            if (length > count) {
                count = length;
                answer = eachWord;
            }
        }
        return answer;
    }

    public String solution2(String problemStr) {
        String answer = "";
        int count = Integer.MIN_VALUE;
        int index;
        while ((index = problemStr.indexOf(" ")) != -1) {
            String temp = problemStr.substring(0, index);
            int length = temp.length();
            if (length > count) {
                count = length;
                answer = temp;
            }
            problemStr = problemStr.substring(index + 1);
        }
        if (problemStr.length() > count) {
            answer = problemStr;
        }
        return answer;
    }



    public static void main(String[] args) {
        WordInSentence wordInSentence = new WordInSentence();
        Scanner fromKeyboard = new Scanner(System.in);
        String problemStr = fromKeyboard.nextLine();
        System.out.println(wordInSentence.solution1(problemStr));
    }
}
