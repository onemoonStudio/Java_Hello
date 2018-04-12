package beakjoon.step.one_ten;

import java.util.Scanner;

public class NumberOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputSentence = sc.nextLine();
        char inputCharArr[] = inputSentence.toCharArray();

        int result = 0;
        boolean flag = false;

        for(char element :inputCharArr){
            if(element != ' '){
                flag = true;
            }else if (element == ' '){
                if(flag){
                    result ++;
                    flag = false;
                }
            }
        }
        if(flag){
            result ++;
        }

        System.out.println(result);
    }
}
