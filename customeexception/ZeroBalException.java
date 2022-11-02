package customeexception;
import exceptionhandling.ExceptionEx;

public class ZeroBalException extends ExceptionEx {
	private double currBal;
	private double withAmt;
	private int acctno;
	public ZeroBalException(double currBal, double withAmt, int acctno) {
		super();
		this.currBal = currBal;
		this.withAmt = withAmt;
		this.acctno = acctno;
	}
	@Override
	public String toString() {
		return "ZeroBalanceException [currBal=" + currBal + ", withAmt=" + withAmt + ", acctno=" + acctno + "]";
	}
}