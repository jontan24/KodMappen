package inl�mning4;

public class Account {
	private String nbr;
	private double balance;

	public String getNbr() {
		return nbr;
	}

	public void setNbr(String nbr) {
		this.nbr = nbr;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void credit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}//dags att testa
	
}
	