package beakjoon.basic.C2DataStructure1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringAnalysis {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] result;
        String inputStr;
        char[] inputCharArray;

        while ((inputStr = br.readLine()) != null && inputStr.length() != 0){
            result = new int[4];
            inputCharArray = inputStr.toCharArray();
            for(int element : inputCharArray){
                if(element < 97+26 && element >= 97){
                    result[0]++;
                }else if(element < 65+26 && element >= 65){
                    result[1]++;
                }else if(element < 48+10 && element >= 48){
                    result[2]++;
                }else if(element == 32){
                    result[3]++;
                }
            }

            for(int i : result){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }

    }
}
// 소문자 a = 97
// 대문자 A = 65
// 숫자 0 = 48
// 공백 = 32
// 이 순서대로 배열에 넣어서 출력

// eof 처리를 해줘야 한다.