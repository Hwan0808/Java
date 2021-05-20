package num2;

public class Ex03 {
	
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(0);
		ba.deposit(100_000);
		ba.withdraw(100_000);
		ba.withdraw(200_000);
	}
	
}

class BankAccount {
	
	int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int money) {
		
		if(money < 0) 
		try {
			throw new InvalidWithdraw("양수를 입력하세요");
		} catch (InvalidWithdraw e) {
			e.printStackTrace();
		}
		
		else {
		balance += money;
		System.out.printf("정상 입금처리 : 입금금액=%6d, 잔금 =%6d\n",money,balance);
		}
	}
	
	public void withdraw(int money) {
		if(money < 0) 
		try {
			throw new InvalidWithdraw("양수를 입력하세요");
		} catch (InvalidWithdraw e) {
			e.printStackTrace();
		}
		else if (balance < money) 
		try {
			throw new InvalidWithdraw("초과출금 요구 예외");
		} catch (InvalidWithdraw e) {
			e.printStackTrace();
		}
		else {
			balance -= money; 
			System.out.printf("정상 출금처리 : 인출금액=%6d, 잔금 =%6d\n",money,balance);

		}
	}
}

class InvalidWithdraw extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}
}