package daily_assignment;

import java.util.*;
import customeexception.Account;

public class ArrayListAccount {

	public static void main(String[] args) {
		
		List<Account> lt = new ArrayList<>();
		
		Account ac1 = new Account("Benjamin Pavard", 1201, 2000);
		lt.add(ac1);
		
		Account ac2 = new Account("Lucas Hernandez", 1351, 3810);
		lt.add(ac2);
		
		lt.add(new Account("Niko Mazaroui", 5431, 2230));
		lt.add(new Account("Kingsley Koman", 9761, 4495));
		
		System.out.println(lt);
		System.out.println(lt.size());
		
		lt.remove(2);
		System.out.println(lt);
		System.out.println(lt.size());
		
		boolean isIt = lt.contains(ac1);
		System.out.println(isIt + " Yes element is present!");
		
		Account ac3 = new Account("Sadio Mane", 5541, 2989);
		
		lt.set(2, ac3);
//		System.out.println(lt);
//		System.out.println(lt.size());
	}

}