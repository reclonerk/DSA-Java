package ds.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CoreQueue {
    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<String>();
        queue.add("Rahul");
        queue.add("ajay");
        queue.add("Zara");

        System.out.println(queue);
    }
}
