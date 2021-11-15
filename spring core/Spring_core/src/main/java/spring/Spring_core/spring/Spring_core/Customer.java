package spring.Spring_core.spring.Spring_core;

public class Customer
{
	 int customerId;
	 String customerName;
	 String customerContact;
	 String customerAddress;
	 
	 public Customer(int customerId, String customerName, String customerContact, String customerAddress) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.customerContact = customerContact;
			this.customerAddress = customerAddress;
		}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + "]";
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		//System.out.println("Setting customer id");
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		//System.out.println("Setting customer name");
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		//System.out.println("Setting customer contact");
		this.customerContact = customerContact;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		//System.out.println("Setting customer address");
		this.customerAddress = customerAddress;
	}
	
	
	//parameterized constructor
	
	
	//default constructor
	public Customer() {
		super();
		
	}
	

}

