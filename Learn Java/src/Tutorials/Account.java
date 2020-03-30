package Tutorials;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	static double annualInterestRate;
	private Date dateCreated;
	
	Account(){
		id=0;
		balance=0;
		annualInterestRate=0;
		dateCreated=new Date();
	}
	
	Account(int newId,double newBalance){
		id=newId;
		balance=newBalance;
		dateCreated=new Date();
	}
	//Mutator methods
	/* set id*/
	public void setId(int newId) {
		id= newId;
	}
	/*set balance*/
	public void setBalance(double newBalance) {
		balance=newBalance;
	}
	/* set annualInterestRate*/
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate=newAnnualInterestRate;
	}
	/*accessor method*/
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public String getDateCreated() {
		return dateCreated.toString();
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	public double getMonthlyInterest() {
		return balance*(getMonthlyInterestRate()/100);
	}
}
