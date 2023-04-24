package Queue;

public class QueueUse {
    public static void main(String[] args) throws QueueEmptyException, QueueFullException {
        QueueUsingArray obj = new QueueUsingArray(3);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);

        System.out.println(obj.front());

        System.out.println(obj.size());
        System.out.println(obj);
    }
}
