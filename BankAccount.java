package oop;

public class BankAccount {

	private long accountNum = 000000000; //Chase uses 9 numbers
	private String routingNum = "267084131"; //Chase's Florida routing number
	private String name;
	private long ssn;
	private long balance = 0;
	private long futureBalance = 0;
	
	//Account set up
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSsn() {
		return ssn;
	}
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	public void setNum() {
		accountNum++;
	}
	
	//Deposits
	public void deposit(long num) {
		if(num > 200) {
			balance += 200;
			futureBalance += (balance+num-200);
		}
		else {
			balance += num;
		}
	}
	
	//Withdraws
	public void withdraw(long num) {
		if((balance - num) < 0) {
			System.out.println("WARNING ---- OVERDRAFT");
			System.out.println("You will be charged a $15 overdraft fee");
			balance -= (num+15);
		}
		else {
			balance -= num;
		}
	}
	
	//Print Recipt
	public void recipt() {
		if(futureBalance > 0) {
			System.out.println(this.name);
			System.out.println("Account #: "+this.accountNum);
			System.out.println("Future Balance: $ "+this.futureBalance);
			System.out.println("Available Balance: $ "+this.balance);
		}
		else {
			System.out.println(this.name);
			System.out.println("Account #: "+this.accountNum);
			System.out.println("Available Balance: $ "+this.balance);
		}
	}

}

