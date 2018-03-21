package beakjoon.basic.course_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {

    public static void main(String[] args) {
        Stack _this = new Stack();
        Scanner sc = new Scanner(System.in);
//        int how_many = sc.nextInt();
        // 다시 한번 확인하자 nextInt는 개행문자를 버퍼에 남긴다.
        int how_many = Integer.parseInt(sc.nextLine());

        ArrayList<Integer> stack = new ArrayList<Integer>();

        for(int i=0; i<how_many;i++){
            String input_Str = sc.nextLine();
            String check_str[] = input_Str.split(" ");
//            split 메서드 확인
//            System.out.println("check str => " + Arrays.toString(check_str) );
            if ( check_str[0].equals("push")){
                // js 랑 착각함 string 의 동일 여부를 물을때에는 equals 라는 것을 확인하자
                stack.add(Integer.parseInt(check_str[1]));
                // 왜 push 는?? - 인자의 갯수가 다르기 때문에
            }else{
                System.out.println(_this.actionFunc(stack , check_str[0]));
            }

        }

    }



    public int actionFunc(ArrayList<Integer> stack , String func_name){
        int result = 0;
        switch (func_name){
            case "pop" :
                result = this.pop(stack);
                break;
            case "size" :
                result = this.size(stack);
                break;
            case "empty" :
                result = this.empty(stack);
                break;
            case "top" :
                result = this.top(stack);
                break;
            default:
                break;
        }
        return result;
    }


    public int pop(ArrayList<Integer> stack){
        int length = stack.size();
        if(length == 0){
            return -1;
        }else{
            int result = stack.get(length-1);
            stack.remove(length-1);
            return result;
        }

    }

    public int size(ArrayList<Integer> stack){
        return stack.size();
    }

    public int empty(ArrayList<Integer> stack){
        int length = stack.size();
        int result = (length < 1)? 1 : 0;
        return result;
    }

    public int top(ArrayList<Integer> stack){
        int length = stack.size();
        if(length == 0){
            return -1;
        }else {
            return stack.get(length-1);
        }
    }
    // constuctor

}
