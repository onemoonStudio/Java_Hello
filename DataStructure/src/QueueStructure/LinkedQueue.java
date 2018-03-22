package QueueStructure;

public class LinkedQueue implements QueueInterface {
    private ListNode front;
    private ListNode rear;
    private int count;

    public LinkedQueue(){
        front = null;
        rear = null;
        count = 0;
    }

    @Override
    public boolean isEmpty() {
        return (count == 0);
    }

    @Override
    public void enQueue(Object x) {
        ListNode newNode = new ListNode();
        newNode.data = x;
        newNode.Link = null;
//        rear = newQueue;
        if( rear == null ){
            // 처음 추가하는 경우
            front = rear = newNode;
        }else{
            rear.Link = newNode;
            rear = newNode;
        }
        count ++;
    }

    @Override
    public Object deQueue() {
        if(!isEmpty()){
            Object temp = front.data;
            front = front.Link;
            if(front == null){
                // 리스트에 노드가 한개인 경우
                rear = null;
            }
            count --;
            return temp;
        }
        return null;
    }

    @Override
    public Object Peek() {
        if(!isEmpty()){
            return front.data;
        }
        return null;
    }
}
