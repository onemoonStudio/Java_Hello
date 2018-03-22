package QueueStructure;

public class CircularQueue implements QueueInterface {
    private int front;
    private int rear;
    private int count;
    private int size;
    private int increment;
    private Object[] queueArray;

    public CircularQueue(int queueSize , int incrementValue){
        front = 0; rear = 0; count = 0;
        size = queueSize;
        increment = incrementValue;
        queueArray = new Object[size];
    }

    @Override
    public boolean isEmpty() {
        return (count == 0);
    }

    @Override
    public void enQueue(Object x) {
        if(count == size){
            // if queue is full
            int oldSize = size;
            size += increment;
            Object[] tempArray = new Object[size];
            System.arraycopy(queueArray ,0,tempArray,0,oldSize);
            queueArray = tempArray;
            front=0;rear=oldSize;
        }
        queueArray[rear] = x;
        rear = (rear +1)%size;
        count ++;
    }

    @Override
    public Object deQueue() {
        if(!isEmpty()){
            Object temp = queueArray[front];
            front = (front+1)%size;
            count--;
            return temp;
        }
        return null;
    }

    @Override
    public Object Peek() {
        if(!isEmpty()){
            return queueArray[front];
        }
        return null;
    }
}
