package LAB23;

public class ArrayQueueModule {
    private int maxSize;
    private int front;
    private int rear;
    private int [] queue;
    public static void main(String[] args){
        ArrayQueueModule circleQueue = new ArrayQueueModule(50);
    }

    public ArrayQueueModule(int MaxSize) {
        maxSize = MaxSize;
        queue = new int[maxSize];
        front = 0;
        rear = 0;
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void enqueue(int n) {

        if(isFull()) {throw new RuntimeException ("Queue is full");}

        queue[rear] = n;
        rear = (rear + 1) % maxSize;
    }
    public int element() {
        if(isEmpty()) {throw new RuntimeException ("Queue is empty");}
        return queue[front];
    }
    public  int dequeue() {
        int item;
        if(isEmpty()){throw new RuntimeException ("Queue is empty");}
        front = (front + 1) % maxSize;
        item = queue[front];
        return item;
    }
    public int size() {

        return (rear + maxSize - front) % maxSize;
    }
    public void clear(){
        queue = new int[maxSize];
        front = 0;
        rear = 0;
    }
}
