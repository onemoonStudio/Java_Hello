package beakjoon.basic.C4Math1;

import java.util.Scanner;

public class P11005_DecimalTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        String str[] = sc.nextLine().split(" ");
        int num = Integer.parseInt(str[0]);
        int target = Integer.parseInt(str[1]);

        while(num >= target){
            int temp = num%target;
            num /= target;

            if(temp < 10){
                //sb.append(temp);
                sb.insert(0,temp);
            }else{
                char item = (char)(temp-10+(int)'A');
                sb.insert(0,item);
            }

        }

        if(num<10){
            sb.insert(0,num);
        }else{
            char item = (char)(num-10+(int)'A');
            sb.insert(0,item);
        }
        System.out.println(sb.toString());

    }
}
