package num6;

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
	
	public static void main(String[] args) {
		
	}

}
