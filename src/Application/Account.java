package Application;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
		System.out.println("You new withdrawLimit is: " + withdrawLimit);
	}

	public void deposit (double amount) {
			
		balance = balance + amount;
		System.out.println("\n Deposito realizado \n Seu novo saldo é: " + balance);
	}
		
	public void Withdraw(double amount) {
		if(balance < amount) {
			throw new IllegalArgumentException("You don't have balance to withdraw");
		}
		if(withdrawLimit < amount) {
			throw new IllegalArgumentException("You exceded the limit withdraw!");
		}
		
		balance = balance - amount;
		System.out.println("\n Saque realizado \n Seu novo saldo é: " + balance);
	}

	
	
}
