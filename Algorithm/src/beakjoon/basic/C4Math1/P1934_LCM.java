package beakjoon.basic.C4Math1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1934_LCM {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howMany = Integer.parseInt(br.readLine());
        for(int i=0;i<howMany;i++){
            String str = br.readLine();
            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);
            int LCM = 1;
            while(a>1||b>1){
                for(int k=2;k<=Math.max(a,b);k++){
                    if(a%k ==0 && b%k ==0){
                        LCM *= k;
                        a /= k; b/= k;
                        break;
                    }else if(a %k ==0){
                        LCM *=k;
                        a /= k;
                        break;
                    }else if(b %k ==0){
                        LCM *=k;
                        b /= k;
                        break;
                    }
                }
            }
            System.out.println(LCM);

        }
    }
}
