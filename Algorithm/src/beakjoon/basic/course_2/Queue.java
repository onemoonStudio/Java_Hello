package beakjoon.basic.course_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue _this = new Queue();
        ArrayList<Integer> queue = new ArrayList<Integer>();
        int how_many = Integer.parseInt(sc.nextLine());

        for(int i=0; i<how_many;i++){
            String input_Str = sc.nextLine();
            String check_str[] = input_Str.split(" ");
            if ( check_str[0].equals("push")){
                queue.add(Integer.parseInt(check_str[1]));
            }else{
                System.out.println(_this.actionFunc( queue , check_str[0]));
            }
        }
    }

    public int actionFunc(ArrayList<Integer> queue , String func_name){
        int result = 0;
        switch (func_name){
            case "pop" :
                result = this.pop(queue);
                break;
            case "size" :
                result = this.size(queue);
                break;
            case "empty" :
                result = this.empty(queue);
                break;
            case "front" :
                result = this.front(queue);
                break;
            case "back":
                result = this.back(queue);
                break;
            default:
                break;
        }
        return result;
    }

    public int pop(ArrayList<Integer> queue){
        int result = -1;
        if(queue.size() != 0){ result = queue.get(0); queue.remove(0);}
        // 주의할것 queue.get(0) != null 방식은 안된다.
        // 없는것에서 null을 가져오려 했기 때문에
        return result;
    }
    public int size(ArrayList<Integer> queue){
        return queue.size();
    }
    public int empty(ArrayList<Integer> queue){
        return queue.size() == 0 ? 1:0;
    }
    public int front(ArrayList<Integer> queue){
        int result = -1;
        if(queue.size() != 0){ result = queue.get(0);}
        return result;
        }
    public int back(ArrayList<Integer> queue){
        int result = -1;
        if(queue.size() != 0){ result = queue.get(queue.size()-1);}
        return result;
    }


}
