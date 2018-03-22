package QueueStructure;

public class BasicQueue implements QueueInterface{
    private int front;
    private int rear;
    private int size;
    private int increment;
    private Object[] queueArray;

    public BasicQueue(int queueSize , int incrementValue){
        front = -1;
        rear = -1;
        size = queueSize;
        increment = incrementValue;
        queueArray = new Object[size];
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public void enQueue(Object x) {
        if(rear == size-1){
            size += increment;
            Object[] tempArray = new Object[size];
            System.arraycopy(queueArray,0,tempArray,0,queueArray.length);
            queueArray = tempArray;
        }
        queueArray[++rear] = x;
    }

    @Override
    public Object deQueue() {
        if(!isEmpty()){
            return queueArray[++front];
        }
        return null;
    }

    @Override
    public Object Peek() {
        if(!isEmpty()){
            int temp = front + 1;
            return queueArray[temp];
        }
        return null;
    }
}
