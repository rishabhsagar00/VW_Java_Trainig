package daily_assignment;

import java.util.*;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class LinkedListPriorityQueueAccount {

	public static void main(String[] args) {
		
        Queue<Account> q = new PriorityQueue<>();

        q.offer(new Account("Shiv", 1776, 2190));
        q.offer(new Account("Madhur", 7110, 2500));
        q.offer(new Account("Nitish", 3321, 5001));
        q.offer(new Account("Krish", 1889, 3228));

        System.out.println("peek:"+q.peek());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());

        System.out.println(q);

        
/************************************ Linked list implementation *********************/
        Queue<Account> q1 = new LinkedList<>();

        q1.offer(new Account("Spider-Man", 1445, 6000));
        q1.offer(new Account("Wanda Maximoff", 1997, 2000));
        q1.offer(new Account("Black Widow", 9917, 3000));
        q1.offer(new Account("Steve Rogers", 7781, 4000));

        System.out.println("peek:"+q.peek());
        System.out.println(q.size());

        System.out.println("poll:"+q.poll());
        System.out.println(q.size());

        System.out.println(q1);

	}

}