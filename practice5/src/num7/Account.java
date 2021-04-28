package num7;

public class Account {
	
	private String owner;
	private long balance;
	
	public void SetOwner(String owner) {
		this.owner = owner;
	}
	
	public void SetBalance(long balance) {
		this.balance = balance;
	}
	
	public String GetOwner() {
		return this.owner;
	}
	
	public long GetBalance() {
		return this.balance;
	}
	
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public long deposit(long amount) {
		return this.balance += amount;
	}
	
	public long withdraw(long amount) {
		return this.balance -= amount;
	}
	
	public static void main(String[] args) {
		
		Account a1 = new Account("√÷√¢»Ø",1_000_000);
		a1.deposit(500000);
		a1.withdraw(500000);
		System.out.println(a1.GetBalance());
	}

}
