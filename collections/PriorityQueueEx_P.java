package collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;

public class PriorityQueueEx_P {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.offer(15);
		q.offer(5);
		q.offer(20);
		q.offer(1);
		
		
		System.out.println(q.size());
		System.out.println("Peek:  "+q.peek());
		System.out.println("Poll:  "+q.poll());
		
		
		q = new LinkedList<Integer>();
		q.offer(10);
		q.offer(10);
		System.out.println("size of linkedlist   "+q.size());
		

	}

}
