package StackStructure;

public class Stack implements StackInterface{
//    private static final int StackMax = 100;

    private int top;
    private int size;
    private int increment;
    private Object[] stackArray;


    public Stack(int stackSize , int incrementValue){
        top = -1;
        size = stackSize;
        increment = incrementValue;
        stackArray = new Object[size];
    }

    @Override
    public boolean isEmpty() {
        return top == -1 ;
    }

    @Override
    public void push(Object x) {
        if( top == size - 1 ){
            // if stack is full
            size += increment;
            Object[] tempArray = new Object[size];
            System.arraycopy(stackArray,0,tempArray,0,stackArray.length);
            stackArray = tempArray;
        }
        stackArray[++top] = x;
    }

    @Override
    public Object pop() {
        if(!isEmpty()){
            return stackArray[top--];
        }
        return null;

    }

    @Override
    public Object peek() {
        if(!isEmpty()){
            return stackArray[top];
        }
        return null;
    }
}
