package collections;
 
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
 
public class PriorityQueueLinkedListEx {
 
    public static void main(String[] args) {

        //priorityQueue has element will sort elements priority wise
        //it uses comparable interface compareTo method for deciding the priority of elements added
        Queue<Integer> q = new PriorityQueue<Integer>();

        q.offer(15);
        q.offer(10);
        q.offer(12);
        q.offer(1);
        q.offer(15);

        //peek returns ele at mouth of queue but doesnt remove it.
        //poll returns ele at moth of queue but also remove it from mouth of queue so that
        // next element then moves in to mouth
        System.out.println(q.size());
        System.out.println("peek:"+q.peek());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());


        //LinkedList - FIFO structure
        System.out.println("output from LinkedList implementation of Queue interface:");
        q = new LinkedList<Integer>();

        q.offer(15);
        q.offer(10);
        q.offer(12);
        q.offer(1);
        q.offer(15);

        //peek returns ele at mouth of queue but doesnt remove it.
        //poll returns ele at moth of queue but also remove it from mouth of queue so that
        // next element then moves in to mouth
        System.out.println(q.size());
        System.out.println("peek:"+q.peek());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());

    }
 
}