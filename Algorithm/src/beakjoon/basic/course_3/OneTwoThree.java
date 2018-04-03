package beakjoon.basic.course_3;

import java.util.ArrayList;
import java.util.Scanner;

public class OneTwoThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> func = new ArrayList<>();
        int howMany = Integer.parseInt(sc.nextLine());


        for(int i=0;i<howMany;i++){
            int inputNum = Integer.parseInt(sc.nextLine());
            func.add(1);
            func.add(2);
            func.add(4);

            for(int k=3; k < inputNum ;k++){
                func.add(
                        func.get(k-1)+
                        func.get(k-2)+
                        func.get(k-3)
                );
            }
            System.out.println(func.get(inputNum-1));
            func.clear();
        }
    }
}

// 앞에 1을 더한경우
// 앞에 2를 더한경우
// 앞에 3을 더한경우

