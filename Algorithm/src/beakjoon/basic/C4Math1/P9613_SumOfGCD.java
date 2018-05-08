package beakjoon.basic.C4Math1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9613_SumOfGCD {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howMany = Integer.parseInt(br.readLine());
        for(int h=0;h<howMany;h++){
            int result=0;
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int len = Integer.parseInt(st.nextToken());
            int arr[] = new int[len];
            for(int i=0;i<len;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for(int i=0;i<len;i++){
                for(int k=i+1;k<len;k++){

                    int GCD = 1;
                    int a = arr[i];
                    int b = arr[k];
                    boolean flag = true;

                    while(flag){
                        for(int p=2;p<=Math.max(a,b);p++){
                            if(a%p ==0 && b%p ==0){
                                GCD *= p;
                                a /= p; b/= p;
                                break;
                            }else if(p == Math.max(a,b)){
                                flag = false;
                            }
                        }
                    }
                    result += GCD;

                }
            }
            System.out.println(result);
        }
    }
}
