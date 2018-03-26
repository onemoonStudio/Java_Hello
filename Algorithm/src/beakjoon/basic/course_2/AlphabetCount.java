package beakjoon.basic.course_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetCount{
public static void main(String[]args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] inputArr = br.readLine().toCharArray();
    System.out.println(inputArr.length);
    }
}
