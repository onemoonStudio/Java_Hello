package beakjoon.basic.C2DataStructure1;
// version 2
// using two stack

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Editor_2 {
    public static void main(String[] args) throws Exception{
        Editor_2 stackLeft = new Editor_2();
        Editor_2 stackRight = new Editor_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder SB = new StringBuilder();
        String inputStr = br.readLine();
        char[] charArr = inputStr.toCharArray();
        for(char element : charArr){
            stackLeft.push(element);
        }

        int howMany = Integer.parseInt(br.readLine());
        for(int k=0;k<howMany;k++){
            String[] orderArr = br.readLine().split(" ");
            switch (orderArr[0]){
                case "L" :
                    if(stackLeft.size() != 0){
                        stackRight.push(stackLeft.pop());
                    }
                    break;
                case "D" :
                    if(stackRight.size() != 0){
                        stackLeft.push(stackRight.pop());
                    }
                    break;
                case "B" :
                    if(stackLeft.size() != 0){
                        stackLeft.pop();
                    }
                    break;
                case "P" :
                    stackLeft.push(orderArr[1]);
                    break;
            }
        }

        int howManyRight = stackRight.size();
        for(int i=0;i<howManyRight;i++){
            SB.append(stackRight.pop());
        }
        int howManyLeft = stackLeft.size();
        for(int k=0;k<howManyLeft;k++){
            SB.insert(0,stackLeft.pop());
        }
        System.out.println(SB.toString());

    }


    // stack 클래스

    public static final int MAX = 100;
    private int top;
    private Object[] stack;

    public Editor_2(){
        this.stack = new Object[MAX];
        this.top = 0;
    }

    public void push(Object pushedValue){
        if(top >= MAX){
            Object[] temp = new Object[this.stack.length + MAX];
            System.arraycopy(this.stack,0,temp,0,this.stack.length);
            stack = temp;
        }
        this.stack[top++] = pushedValue;
    }
    public Object pop(){
        if(top==0){return -1;}
        return this.stack[--top];
    }
    public int empty(){
        if(top==0){return 1;}
        return 0;
    }
    public int size(){
        return this.top;
    }
    public void show(){
        System.out.println("top is " + this.top);
        System.out.print("stack is [ ");
        for(int i=0;i<top;i++){
            System.out.print(this.stack[i] + " ");
        }
        System.out.print("]\n");
    }
}

// ?? 왜 안되지 확인 해보기

