package beakjoon.basic.C2DataStructure1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlphabetNumber {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        AlphabetNumber thisObj = new AlphabetNumber();

        char[] checkArr = br.readLine().toCharArray();

        for(int ch : checkArr){
            // 캐스팅 된 char
//            thisObj.alphabetArr[ch-97]++;
            thisObj.alphabetArr[ch-'a']++;
        }

        for(int arrayValue : thisObj.alphabetArr){
            System.out.print(arrayValue+" ");
        }
        System.out.print("\n");
    }

    private int[] alphabetArr;

    public AlphabetNumber(){
        alphabetArr = new int[26];
    }

}