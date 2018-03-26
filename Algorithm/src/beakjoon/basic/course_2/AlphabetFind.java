package beakjoon.basic.course_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlphabetFind {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabetArray = new int[26];
        for(int i = 0;i<alphabetArray.length;i++){
            alphabetArray[i] = -1;
        };

        int index=0;
        char[] inputStr = br.readLine().toCharArray();

        for(int element : inputStr){
            if(alphabetArray[element-97] == -1){
                alphabetArray[element-97] = index;
            }
            index++;
        }
        for(int element : alphabetArray){
            System.out.print(element + " ");
        }
        System.out.print("\n");
    }
}
