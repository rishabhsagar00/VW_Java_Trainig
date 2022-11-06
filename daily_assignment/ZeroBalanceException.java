package daily_assignment;

import customeexception.InsufficientBalanceException;

import java.util.*;
import customeexception.Account;

public class ZeroBalanceException {

	public static void main(String[] args) {

		Account ob = new Account("David Warner", 1229, 1200);

		Scanner sc = new Scanner(System.in);
		String s;

		do {
			System.out.println("Enter the amount to withdraw: ");
			double amt = sc.nextDouble();

			try {
				amt = ob.withdraw(amt);
			} catch (InsufficientBalanceException e) {
				System.out.println(e);
				break;
			}
			System.out.println("Do you wish to continue:(y/n):");
			s = sc.next();

		} while (s.charAt(0) == 'y' || s.charAt(0) == 'Y');

		sc.close();
		System.out.println("program ends here...");
	}

}