package collections;

public class AccountEx {
	private int account_no;
	private String name;
	private double balance;
	private String bank_name;
	

	public AccountEx(int account_no, String name, double balance, String bank_name) {
		super();
		this.account_no = account_no;
		this.name = name;
		this.balance = balance;
		this.bank_name = bank_name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public int getAccount_no() {
		return account_no;
	}
	
	//a1.equals(a2)
    
    @Override
	public String toString() {
		return "Account [account_no=" + account_no + ", name=" + name + ", balance=" + balance + ", bank_name="
				+ bank_name + "]";
	}


	@Override
    public boolean equals(Object obj)  //obj = a2
    {
		if(obj instanceof AccountEx) {
			return this.account_no == ((AccountEx)obj).account_no;
		}else {
			return false;
		}
    }
    
	
}