package daily_assignment;

import java.util.*;

public class TreeSetAccount {

	public static void main(String[] args) {


		SortedSet<Account> st = new TreeSet<>();

		Account acc = new Account("Arjun", 2240, 12000);

		st.add(acc);

		Account acc1 = new Account("Suraj", 3943, 17640);

		st.add(acc1);

		st.add(new Account("Sahil", 2512, 19103));
		st.add(new Account("Joshua", 3522, 14104));
		st.add(new Account("Arjun", 2240, 18862));

		System.out.println(st.size());

		System.out.println(st.contains(acc));
		
		

		/********* Comparator interface **********/

		System.out.println("Sorting based on employee's dept number...");
		method(new ComparatorEmp());
	}

	public static void method(Comparator<Employee> c) {

		SortedSet<Employee> st1 = new TreeSet<Employee>(c);

		Employee e11 = new Employee(2, "Arjun", 2240.76, 102);

		st1.add(e11);

		Employee e1 = new Employee(1, "Suraj", 2900.89, 101);

		st1.add(e1);

		st1.add(new Employee(4, "Sahil", 3512.78, 104));
		st1.add(new Employee(3, "Joshua", 3522.34, 103));

		System.out.println(st1);
	}

}