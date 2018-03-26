package beakjoon.basic.course_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class FourNumber extends Stack {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        FourNumber stackOne = new FourNumber();
        FourNumber stackTwo = new FourNumber();

        String inputStr;
        char[] strToCh;
        int checkSpace;
        long stackOneNumber =0L;
        long stackTwoNumber =0L;

        while((inputStr = br.readLine()) != null && inputStr.length() != 0){
            // Start
            strToCh = inputStr.toCharArray();
            checkSpace = 0;

            for(int i =0 ; i<strToCh.length ; i++){
                if(strToCh[i] == 32){checkSpace++;}else{
                    if(checkSpace < 2){
                        // stack 1
                        stackOne.push(strToCh[i]-48);
                    }else{
                        // stack 2
                        stackTwo.push(strToCh[i]-48);
                    }
                }
            }

            int stackSize = stackOne.size();
            for(int i=0;i<stackSize;i++){
                stackOneNumber += (int)stackOne.pop()*(long)Math.pow( 10,i );
            }
            stackSize = stackTwo.size();
            for(int i=0;i<stackSize;i++){
                stackTwoNumber += (int)stackTwo.pop()*(long)Math.pow( 10,i );
            }
            System.out.println(stackOneNumber + stackTwoNumber);
        }
    }
}


// 사실 숫자를 안쓰고 char를 붙이는 형식으로 풀 수도 있다.
// 힘들었던 부분
// stackTwoNumber += ((long)stackTwo.pop()*Math.pow( 10,i ));
// long 타입으로 바꿔야 하는데 Math.pow 앞에만 (long) 을 해주면 된다. 나머지는 int라도 상관이 없다.
// 실수한 부분
// for(int i=0;i<stack.size();i++) stack.pop()
// 이렇게 하면 안된다. stack이 계속 줄어들기 때문에 사이즈가 고정되지 않는다.