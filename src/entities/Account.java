package entities;

public class Account {
	// Atributos
	private int numberAccount; // numeroConta
	private String nameAccount; // nomeConta
	private double balance; // balance = saldo
	private double deposit; // deposit = deposito
	private double withdraw; // withdraw = saque
	
	// Método Construtor
	public Account() {
		
	}
	
	
	public Account(int numberAccount, String nameAccount, double deposit) {
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
		setDeposit(deposit);
		
		// this.deposit = deposit;
	}
	
	// Métodos Getters e Setters
	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}
	
	public int getNumberAccount() {
		return numberAccount;
 	}
	
	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}
	
	public String getNameAccount() {
		return nameAccount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// Métodos
	public void setDeposit(double deposit) {
		this.deposit = deposit;
		balance = balance + this.deposit;
	}
	
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
		balance = balance - this.withdraw - 5.00;
	}
	
	public String toString(){
		return "Account " 
				+ numberAccount 
				+ ", "
				+ "Holder: "
				+ nameAccount
				+ ", "
				+ "Balance: $ "
				+ String.format("%.2f%n", balance);				
	}
	
	
	/*
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public double getDeposit() {
		return deposit;
	}
	
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	
	public double getWitdraw() {
		return withdraw;
	}
	*/
	
}
