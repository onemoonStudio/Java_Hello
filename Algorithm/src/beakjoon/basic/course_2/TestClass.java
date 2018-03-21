package beakjoon.basic.course_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int howMany = Integer.parseInt(Character.toString((char)br.read()));
            // 주의 ! br.read()는 char를 읽는다 !
            String[] test = new String[howMany];
            for(int i=0;i<howMany;i++){
                test[i] = br.readLine();
            }

            for(String element : test){
                System.out.print(element + "," );
            }
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }

//        buffered 리더도 마찬가지 read는 하나씩 읽어온다 그리고 버퍼에 개행문자를 남긴다.
        // readLine은 개행문자를 포함한 모든 라인을 읽어온다.

    }

}
