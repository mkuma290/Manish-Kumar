package spring.Spring_core.spring.Spring_core;
import java.util.*;
public class bankAccount
{
int accountid;
String accountHoldername;
String accounttype;
int accountbalance;
}
interface bankaccountrepository
{
	 double getbalance(long accountid);
	 public  double updatebalance(long accountid,double newbalance);
	
}


class bankaccountrepositoryimpl implements bankaccountrepository
{
	public double getbalance(long accountid)
	{
		return accountid;
	}
	public  double updatebalance(long accountid,double newbalance)
	{
		return newbalance;
	}

}
 