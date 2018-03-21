package beakjoon.basic.course_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Editor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String startStr = sc.nextLine();
        int howMany = Integer.parseInt(sc.nextLine());
        ArrayList<Character> mainCArr = new ArrayList<Character>();

        // 먼저 arraylist에 넣어준다 메소드가 많기 때문에
        // ! char[]로는 메소드의 사용을 어떻게 해야 하는가??
        for(int k=0;k<startStr.length();k++){
            mainCArr.add(startStr.charAt(k));
        }
        int mainCursor = startStr.length()+1;


        for(int i=0;i<howMany;i++){
            System.out.println("mainCursor => "+mainCursor);
            System.out.println("mainCArr => "+mainCArr.toString());
            String command = sc.nextLine();
            String temp[] = command.split(" ");

            switch (temp[0]){
                case "L":
                    mainCursor += (mainCursor == 0) ? 0 : -1 ;
                    break;
                case "D":
                    mainCursor += (mainCursor == mainCArr.size()) ? 0 : 1 ;
                    break;
                case "B":
                    // 왼쪽 char 삭제후 커서 이동
                    if(mainCursor == 0){ }else {
                        mainCArr.remove(mainCursor);
                        mainCursor--;
                    }
                    break;
                case "P":
                    // 증감연산자 확인
                    mainCArr.add((mainCursor == 0)?mainCursor:mainCursor-1 , temp[1].toCharArray()[0]);
                    mainCursor++;
                    break;
            }
        }
        StringBuilder strb = new StringBuilder();

//        System.out.println(String.join("," , (CharSequence) mainCArr));
        // 붙이는거 다른 방식으로 생각해보기
        for(int k =0;k<mainCArr.size() ; k++){
            strb.append( mainCArr.get(k) );
        }
        System.out.println(strb.toString());
    }
}
// add 가 O(n) 이 아닌 상수 시간이 떠야한다.
// stack 두개 [ ]
// scanner -> buffered reader
