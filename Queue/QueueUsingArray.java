package Queue;

public class QueueUsingArray {
    private int[] data;
    private int front;
    private int rear;
    private int size = 0;
    public QueueUsingArray(){
        data = new int[3];
        front = -1;
        rear = -1;
    }

    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
    }
    public int size(){
        size = data.length;
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public void enqueue(int element) throws QueueFullException{
        if(size == data.length){
            doubleCapacity();
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear+1)% data.length;
        data[rear] = element;
        size++;
    }

    private void doubleCapacity(){
        int[] temp = data;
        data = new int[2*temp.length];
        int index = 0;
        for(int i = front; i< temp.length; i++){
            data[index++] = temp[i];
        }
        for(int i = 0; i<front-1; i++){
            data[index++] = temp[i];
        }
        front = 0;
        rear = temp.length-1;
    }
    public int front() throws QueueEmptyException{
        if(size == 0){
            throw new QueueEmptyException();
        }
        return data[front];
    }
    public int dequeue() throws QueueEmptyException{
        if(size == 0){
            throw new QueueEmptyException();
        }
        int temp = data[front];
        front = (front+1)% data.length;
        size--;
        if(size == 0){
            rear = -1;
            front = -1;
        }
        return temp;
    }

}
