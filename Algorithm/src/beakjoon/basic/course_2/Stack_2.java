package beakjoon.basic.course_2;

public class Stack_2 {

    public static final int MAX = 100;

    private Object[] stack;
    private int top;

    public Stack_2(){
        stack = new Object[MAX];
        top = 0;
    }

    public void push(Object newValue) {
        // MAX를 지정하고 넘게되면 스택 크기를 추가한다.
        if( top >= stack.length ) {
            Object[] tempStack = stack;
            stack = new Object[stack.length + MAX];
            System.arraycopy(tempStack,0,stack,0,tempStack.length);
            // MAX값이 최대를 넘었을 때
        }
        stack[top++] = newValue;
//        System.out.println("\n"+stack.length + "  and   " + top);
    }

    public Object pop() {
        if(top == 0){return -1;}
        return stack[--top];
    }

    public int size() {
        return top;
    }

    public int empty(){
        if(top == 0){return 1;}
        else return 0;
    }

    public void show(){
        System.out.print("[" + stack[0]);
        for(int i=1;i<top;i++){
            System.out.print("," + stack[i]);
        }
        System.out.print("] \n");
    }

}