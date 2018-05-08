package beakjoon.basic.C2DataStructure1;

import java.util.ArrayList;
import java.util.Scanner;

public class Josepous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Josepous _this = new Josepous();
        String inputStr[] = sc.nextLine().split(" ");

        int howMany = Integer.parseInt(inputStr[0]);
        int num = Integer.parseInt(inputStr[1]);

        ArrayList<Integer> IntArr = new ArrayList<Integer>();
        for(int i=0; i<howMany ; i++){
            IntArr.add(i+1);
        }

        int currentCursor = 0; // can't be negative
        int length = IntArr.size();

        while (length > 0){
            // 이동 -> 출력 -> 제거
            currentCursor = _this.moveCursor(currentCursor , num , length);
//            System.out.println("currentCursor => "+currentCursor);
            System.out.println(IntArr.get(currentCursor-1));
            IntArr.remove(currentCursor-1);
            currentCursor--; length--;
//            System.out.println("length => "+length);
//            System.out.println("Int Arr => "+ IntArr.toString());
        }


    }

    public int moveCursor(int currentCursor , int num , int nowSize){
        int cursorAfterMove = currentCursor + num;
        System.out.println(currentCursor + " = currentCursor");
        System.out.println(cursorAfterMove + " = cursorAfterMove");

        // length를 넘었을때 체크
        if ( (currentCursor/nowSize) == 0 ){
            System.out.println("@@@@@@@@@@@  1");
        }else{
            if( currentCursor == nowSize ){
                cursorAfterMove = currentCursor;
                System.out.println("@@@@@@@@@@@  2");
            }else{
                cursorAfterMove = currentCursor - nowSize;
                System.out.println("@@@@@@@@@@@  3");
            }

        }

        return cursorAfterMove;
    }

}
// 0 으로 바꾼다.
// queue -> 한번에 3개씩 이동해라 !