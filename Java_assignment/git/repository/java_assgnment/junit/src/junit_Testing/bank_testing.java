package junit_Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class bank_testing {

	@Test
	public void test() throws Insufficient_amount_exception {
		Bank_account b=new Bank_account();
		b.withdraw(10000);
	}

}
