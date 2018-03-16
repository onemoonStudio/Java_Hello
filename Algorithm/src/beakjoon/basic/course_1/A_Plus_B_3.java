package beakjoon.basic.course_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A_Plus_B_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        A_Plus_B_3 _main_obj = new A_Plus_B_3();
        int how_many = sc.nextInt();

//        _main_obj.func_1(how_many,sc,2);
        _main_obj.func_2(how_many,sc);
    }

    public void func_1(int how_many , Scanner sc, int choice_method){

        ArrayList<String> custom_arr = new ArrayList<String>();

        for(int k = 0; k< how_many ; k++){
            int result = 0;
            for(int o = 0; o < 2 ; o++){
                int temp = sc.nextInt();
                result += temp;
            }
            custom_arr.add(Integer.toString(result));
        }

        switch (choice_method){
            case 1:
                // method 1
                for(int i = 0 ; i < custom_arr.size() ; i++){
                    System.out.println(custom_arr.get(i));
                }
                break;
            case 2:
            default:
                // method 2
                Iterator<String> iter = custom_arr.iterator();

                while(iter.hasNext()){
                    String temp = iter.next();
                    System.out.println(temp);
                }
                break;
        }
    }

    public void func_2(int how_many, Scanner sc){
        // method 3
        String baseString = "";
        for (int i=0; i<how_many*2;i++){
            baseString = baseString + sc.next() + " ";
        }

        StringTokenizer tokens = new StringTokenizer(baseString);
        while(tokens.hasMoreTokens()){
            int sub_result = Integer.parseInt(tokens.nextToken()) + Integer.parseInt(tokens.nextToken());
            // 여기서 2번 도는 for문을 쓸 필요가 없다 !
            System.out.println(sub_result);
        }
    }

}
