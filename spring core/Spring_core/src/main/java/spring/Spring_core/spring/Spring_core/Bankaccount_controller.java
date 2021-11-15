package spring.Spring_core.spring.Spring_core;

import org.springframework.beans.factory.annotation.Required;

public class Bankaccount_controller 

{  
	
	double withdraw_amt;
	double deposit_amt;
	public double getWithdraw_amt() {
		return withdraw_amt;
	}
	
	public void setWithdraw_amt(double withdraw_amt) {
		this.withdraw_amt = withdraw_amt;
	}
	public double getDeposit_amt() {
		return deposit_amt;
	}
	public void setDeposit_amt(double deposit_amt) {
		this.deposit_amt = deposit_amt;
	}
	
	
	public Bankaccount_controller() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bankaccount_controller [withdraw_amt=" + withdraw_amt + ", deposit_amt=" + deposit_amt + "]";
	}
	@Required
	public double withdraw(long accountid,double balance)
	{
		
		return (balance-withdraw_amt);
	}
  	public double deposit(long accountid,double balance)
  	{
  		
  		return (balance+deposit_amt);
  	}
  	public double getbalance(long accountid)
  	{
  		return 0;
  	}
  	
}
