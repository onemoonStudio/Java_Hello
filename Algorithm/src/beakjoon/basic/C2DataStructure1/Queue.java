package beakjoon.basic.C2DataStructure1;

import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);
        int howMany = Integer.parseInt(sc.nextLine());

        for(int i=0;i<howMany;i++) {
            String inStr = sc.nextLine();
            String funcName = inStr.split(" ")[0];


            switch (funcName) {
                case "push":
                    queue.push(Integer.parseInt(inStr.split(" ")[1]));
                    break;
                case "pop":
                    Object popNum = queue.pop();
                    if (popNum == null) {
                        System.out.println("-1");
                    } else {
                        System.out.println(popNum);
                    }
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.empty() ? 1 : 0);
                    break;
                case "front":
                    if (queue.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.front());
                    }
                    break;
                case "back":
                    if (queue.empty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(queue.back());
                    }
                    break;
                default:
                    break;
            }
        }

    }

    private Object[] Queue;
    private int size;
    private int increments;
    private int front;
    private int rear;

    public Queue(){
        //constructor
        size = 20;
        increments = 10;
        Queue = new Object[size];
        front = -1;
        rear = -1;
    }

    public void push(Object element){
        if(rear == size - 1){
            Object[] temp = new Object[size+increments];
            System.arraycopy(Queue,0,temp,0,size);
            size = size+increments;
            Queue = temp;

        }
        Queue[++rear] = element;
    }

    public Object pop(){
        if(front == rear){
            return null;
        }
        return Queue[++front];
    }

    public int size(){
        return (rear - front);
    }

    public boolean empty(){
        return (rear-front) == 0 ? true : false ;
    }

    public Object front(){
        if(empty()){
            return null;
        }
        return Queue[front+1];
    }

    public Object back(){
        if(empty()){
            return null;
        }
        return Queue[rear];
    }

}


