package ds.queue;

public class MainBasicQueue {


    public static void main(String[] args) {
        BasicQueue<String> queue = new BasicQueue<String>();
        queue.enQueue("Rahul");
        queue.enQueue("Ajay");
        queue.enQueue("Adarsh");

        System.out.println(queue.access(0));
    }
}
