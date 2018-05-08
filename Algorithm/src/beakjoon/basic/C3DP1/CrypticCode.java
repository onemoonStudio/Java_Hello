package beakjoon.basic.C3DP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CrypticCode {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int divided = 1000000;

        String inputStr = br.readLine();
        int tenNum=0; int oneNum = 0;
        int result[] = new int[inputStr.length()+1];
        result[0] = 1;
        result[1] = 1;

        if(inputStr.length() >= 2){
            for(int i=2;i<inputStr.length()+1;i++){
                tenNum = (int)(inputStr.charAt(i-2)-'0');
                oneNum = (int)(inputStr.charAt(i-1)-'0');
                int checkAlpha = 10*tenNum+oneNum;
                if(checkAlpha == 10 || checkAlpha == 20){
                    result[i] = result[i-2];
                }else if(checkAlpha >10 && checkAlpha<=26){
                    result[i] = ((result[i-1]%divided) + (result[i-2]%divided))%divided;
                }else{
                    result[i] = result[i-1];
                }
            }
        }
        if(inputStr.charAt(0) == '0'){
            System.out.println(0);
        }else{
            System.out.println(result[inputStr.length()]);
        }


    }
}
