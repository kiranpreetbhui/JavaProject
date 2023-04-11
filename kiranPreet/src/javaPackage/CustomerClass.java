package javaPackage;

public class CustomerClass {

	public static void main(String[] args) {
		CreateCustomer obj1=new CreateCustomer();
		obj1.setName("Harry");
		obj1.setSex("Male");
		obj1.setAddress("Virgania");
		obj1.setAmount(2000);
		
		System.out.println("The name of customer "+obj1.getName());
		System.out.println("The sex of customer "+obj1.getSex());
		System.out.println("The address of customer "+obj1.getAddress());
		System.out.println("The amount of customer "+obj1.getAmount());
		
		
		
	}

	

	}

class CreateCustomer
{
	private String name; 
	private String sex;
	private String address;
	private int amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	
	
	
}