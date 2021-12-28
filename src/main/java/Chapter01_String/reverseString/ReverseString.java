package Chapter01_String.reverseString;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {
    public ArrayList<String> solution1(int number, String[] strArray) {
        ArrayList<String> answer = new ArrayList<>();
        for (String each :
                strArray) {
            String temp = new StringBuilder(each).reverse().toString();
            answer.add(temp);
        }
        return answer;
    }

    public ArrayList<String> solution2(int number, String[] strArray) {
        ArrayList<String> answer = new ArrayList<>();
        for (String each :
                strArray) {
            char[] tempWordArr = each.toCharArray();
            int left = 0, right = each.length() - 1;
            while (left < right) {
                char tempCharacter = tempWordArr[left];
                tempWordArr[left] = tempWordArr[right];
                tempWordArr[right] = tempCharacter;
                left++;
                right--;
            }
            answer.add(String.valueOf(tempWordArr));
        }
        return answer;
    }

        public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        Scanner fromKeyboard = new Scanner(System.in);
        int number = fromKeyboard.nextInt();
        String[] strArray = new String[number];
        for (int i = 0; i < number; i++) {
            strArray[i] = fromKeyboard.next();
        }
        for (String each :
                reverseString.solution1(number, strArray)) {
            System.out.println(each);
        }
    }
}
