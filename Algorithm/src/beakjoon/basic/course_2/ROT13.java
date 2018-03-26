package beakjoon.basic.course_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ROT13 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr;
        while ((inputStr = br.readLine()) != null && inputStr.length() != 0){
            char[] inputCharArr = inputStr.toCharArray();
            char[] resultCharArr = new char[inputStr.length()];
            int resultCount = 0;
            for(int chToint : inputCharArr){
                if(chToint >= 97 && chToint <= 122){
                    if(chToint+13 > 122){
                        resultCharArr[resultCount] = (char)(chToint-13);
                    }else{
                        resultCharArr[resultCount] = (char)(chToint+13);
                    }
                }else if(chToint >= 65 && chToint <= 90){
                    if(chToint+13 > 90){
                        resultCharArr[resultCount] = (char)(chToint-13);
                    }else{
                        resultCharArr[resultCount] = (char)(chToint+13);
                    }
                }else{
                    resultCharArr[resultCount] = (char)chToint;
                }

                resultCount ++;
            }

            for(char element : resultCharArr){
                System.out.print(element);
            }
            System.out.print('\n');

        }
    }

}
