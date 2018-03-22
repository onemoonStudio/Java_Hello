package StackStructure;

// 만약 k개의 스택이 필요하다면 stackTop[k] 를 만들어 관리하면 된다.
// -> ex) isEmpty(int k)
public class LinkedStack implements StackInterface{
    private ListNode top;


    @Override
    public boolean isEmpty() {
        return (top == null);
    }

    @Override
    public void push(Object x) {
        ListNode newNode = new ListNode();
        newNode.data = x;
        newNode.link = top;
        top = newNode;
    }

    @Override
    public Object pop() {
        if(!isEmpty()){
            Object tempItem = top.data;
            top = top.link;
            return tempItem;
        }
        return null;
    }

    @Override
    public Object peek() {
        if(!isEmpty()){
            return top.data;
        }
        return null;
    }
}
