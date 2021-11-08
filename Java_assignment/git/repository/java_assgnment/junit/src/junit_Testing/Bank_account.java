package junit_Testing;
import java.util.*;
 class Insufficient_amount_exception extends Exception 
{
	 
}
   public class Bank_account
   { 
     public void withdraw(int amount) throws Insufficient_amount_exception
     {  
      int balance=100000;
    	 if(amount<balance)
    	 {
    		 throw new Insufficient_amount_exception();
    	 }
    	 else
    	 {
    		 balance=balance-amount;
    	 }
     }
   }
