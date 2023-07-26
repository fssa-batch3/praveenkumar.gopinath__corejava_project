package day05.practice;

public interface ATM {
	public boolean deposit(Account account, double amount);

	public boolean withdraw(Account account, double amount) throws Exception;

	public double getBalance(Account account);
}