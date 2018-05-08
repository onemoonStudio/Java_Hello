package beakjoon.basic.C3DP1;


import java.io.BufferedReader;
import java.io.InputStreamReader;

// f(n) = max[ f(n-3) + a(n-1)+a(n)  , f(n-2) + a(n) , f(n-1) ]

public class DrinkWine {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howManyGlass = Integer.parseInt(br.readLine());
        int wine[] = new int[10001];
        int maxWine[] = new int[10001];

        String temp;
        int count = 1;

        while ((temp = br.readLine()) != null && temp.length() != 0){
            wine[count++] = Integer.parseInt(temp);
        }

        maxWine[1] = wine[1];
        maxWine[2] = wine[1] + wine[2];
        maxWine[3] = findMax(wine[1] + wine[2],wine[1] + wine[3],wine[2] + wine[3]);

        for(int k=3;k<howManyGlass;k++){
            maxWine[k+1] = findMax(
                    maxWine[k-2] + wine[k] + wine[k+1],
                    maxWine[k-1] + wine[k+1],
                    maxWine[k]
            );
        }

        System.out.println(maxWine[howManyGlass]);


    }

    public static int findMax(int a , int b, int c){
        if(a>=b && a>=c){
            return a;
        }else if(b>=a && b>=c){
            return b;
        }else{
            return c;
        }
    }
}
