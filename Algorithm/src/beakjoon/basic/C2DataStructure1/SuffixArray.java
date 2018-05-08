package beakjoon.basic.C2DataStructure1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class SuffixArray{
    // version 2
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        ArrayList<String> inStrArray = new ArrayList<String>();
        for(int i=0;i<inputStr.length();i++){
            inStrArray.add(inputStr.substring(i));
        }
        Collections.sort(inStrArray);
        for(String str : inStrArray){
            System.out.println(str);
        }
    }

//      version 1
//    public static void main(String[] args) throws Exception {
//        SuffixArray queue = new SuffixArray();
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String inputStr = br.readLine();
//
//        for(int i=97 ; i < 123 ; i++){
//            int tempIdx = inputStr.indexOf(i);
//            String tempStr = inputStr;
//            ArrayList<String> subResult = new ArrayList<String>();
//
//            while(tempIdx > -1){
//                subResult.add(tempStr.substring(tempIdx));
//                tempStr = tempStr.substring(++tempIdx);
//                tempIdx = tempStr.indexOf(i);
//            }
//            Collections.sort(subResult);
//            for(String str : subResult){
//                queue.offer(str);
//            }
//        }
//
//        while( !queue.isEmpty() ){
//            System.out.println(queue.poll());
//        }
//
//
//
//    }

//    private int front , rear;
//    private Object[] queue;
//    private int MAX_SIZE;
//    private int increments;
//
//    public SuffixArray(){
//        front = -1;
//        rear = -1;
//        MAX_SIZE = 100;
//        increments = 10;
//        queue = new Object[MAX_SIZE];
//    }
//
//    public void offer(Object o) {
//        if( front == MAX_SIZE ){
//            Object[] temp = new Object[MAX_SIZE + increments];
//            System.arraycopy(queue , 0, temp,0,MAX_SIZE);
//            queue = temp;
//            MAX_SIZE += increments;
//        }
//        queue[++rear] = o;
//    }
//
//    public Object poll() {
//        if(this.isEmpty()){
//            return null;
//        }
//        return queue[++front];
//
//    }
//
//    public Object peek() {
//        if(this.isEmpty()){
//            return null;
//        }
//        return queue[front + 1];
//    }
//
//    public boolean isEmpty(){
//        return ((front-rear)==0);
//    }
}
