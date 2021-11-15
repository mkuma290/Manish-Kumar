package spring.Spring_core.spring.Spring_core;



  public class bankaccount2 implements bankaccountservice
{    
	  double withdraw_bal;
      double deposit_bal;
      double id;
     // boolean fund;


	  public double getWithdraw_bal() {
		return withdraw_bal;
	}

	public void setWithdraw_bal(double withdraw_bal) {
		this.withdraw_bal = withdraw_bal;
	}

	public double getDeposit_bal() {
		return deposit_bal;
	}

	public void setDeposit_bal(double deposit_bal) {
		this.deposit_bal = deposit_bal;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	

	
	
	

	

	public bankaccount2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "bankaccount2 [withdraw_bal=" + withdraw_bal + ", deposit_bal=" + deposit_bal + ", id=" + id + "]";
	}

	public double withdraw(long accountid,double balance)
	{
		return 0;
	}
	
	 public double deposit(long accountid,double balance)
	{
		return 0;
	}
	 public double getbalance(long accountid)
	{
		return 0;
	}
	
	 

}

  interface bankaccountservice
  {
  	public double withdraw(long accountid,double balance);
  	public double deposit(long accountid,double balance);
  	public double getbalance(long accountid);
  	//public boolean fundtransfer(long fromaccount,long toaccount,double amount);
  }