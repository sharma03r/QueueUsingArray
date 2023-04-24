package Queue;

public class QueueFullException extends Exception {
    public QueueFullException(){
        System.out.println("Queue is full");
    }
}
