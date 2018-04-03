package beakjoon.step.one_ten;

import java.util.Scanner;

public class overAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int howMany = Integer.parseInt(sc.nextLine());
        for(int i=0;i<howMany;i++){

            String input = sc.nextLine();
            String[] inputArr = input.split(" ");
            int studentsNum =Integer.parseInt(inputArr[0]);
            int sum = 0;
            for(int k=0;k<studentsNum;k++){
                sum += Integer.parseInt(inputArr[k+1]);
            }

            double average = sum/studentsNum;
            double overAverage = 0;
            for( int j=0;j<studentsNum;j++){
                if(Integer.parseInt(inputArr[j+1]) > average){
                    overAverage++;
                }
            }

            System.out.printf("%.3f",Math.round(overAverage/studentsNum*100000d)/1000d);
            System.out.print("%\n");
        }
    }
}
