package LAB23;

public class ArrayQueueADT<T> {
    private int maxSize;
    private int front;
    private int rear;
    private Object [] queue;
    public static void main(String[] args){
        ArrayQueueModule circleQueue = new ArrayQueueModule(50);
    }

    public ArrayQueueADT(int MaxSize) {
        maxSize = MaxSize;
        queue = new Object[maxSize];
        front = 0;
        rear = 0;
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void enqueue(T n) {

        if(isFull()) {throw new RuntimeException ("Queue is full");}

        queue[rear] = n;
        rear = (rear + 1) % maxSize;
    }
    public T element() {
        if(isEmpty()) {throw new RuntimeException ("Queue is empty");}
        return (T) queue[front];
    }
    public  T dequeue() {
        Object item;
        if(isEmpty()){throw new RuntimeException ("Queue is empty");}
        front = (front + 1) % maxSize;
        item = queue[front];
        return (T) item;
    }
    public int size() {

        return (rear + maxSize - front) % maxSize;
    }
    public void clear(){
        queue = new Object[maxSize];
        front = 0;
        rear = 0;
    }
}
