package entities;

public class AccountBank {

	private int accountNumber;
	private String name;
	private double balance;

	private static final double TAXBALANCE = 5.00;

	// construtor com obrigatoriedade de numero da conta, nome da conta e depoisito
	// Inicial
	public AccountBank(int accoontNumber, String name, double initiallDeposit) {

		this.accountNumber = accoontNumber;
		this.name = name;
		deposit(initiallDeposit);

	}

	// construtor com obrigatoriedade de numero da conta e nome da conta
	public AccountBank(int accoontNumber, String name) {

		this.accountNumber = accoontNumber;
		this.name = name;

	}

	// criacao de metodos de acesso

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public Double getBalance() {

		return balance;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	// criacao de metodos de funcionalidade

	public void deposit(double depositValue) {

		this.balance += depositValue;

	}

	public void withdraw(double withdrawValue) {

		this.balance -= withdrawValue + TAXBALANCE;
	}

	@Override
	public String toString() {

		return String.format("Account %d, Holder: %s, Balance: $%.2f", this.accountNumber, this.name, this.balance);

	}

}
