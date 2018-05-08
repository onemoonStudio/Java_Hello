package beakjoon.basic.C1InOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class A_Plus_B_7 {
    public static void main(String[] args) {
        A_Plus_B_7 _this = new A_Plus_B_7();
        Scanner sc = new Scanner(System.in);
        int how_many = sc.nextInt();

//        _this.func_7(how_many,sc);
        _this.func_8(how_many,sc);
    }

    public void func_7(int how_many , Scanner sc){
        for(int i=0; i<how_many ; i++){
            int sub_result = 0;
            for(int k=0;k<2;k++){
                sub_result += sc.nextInt();
            }
            System.out.println("Case #"+(i+1)+": " +sub_result);
        }
    }

    public void func_8(int how_many , Scanner sc){
        for(int i=0; i<how_many ; i++){
            int sub_result = 0;
            ArrayList<Integer> iArr = new ArrayList<Integer>();

            for(int k=0;k<2;k++){
                int temp =sc.nextInt();
                sub_result += temp;
                iArr.add(temp);
            }

            System.out.println("Case #"+(i+1)+": " +
                    iArr.get(0) + " + " + iArr.get(1) + " = "
                    +sub_result);
        }
    }
}
