package javaPackage;

public class Customer {
	String name;
	String sex;
	String address;
	int fee;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1= new Customer();
		c1.name = "regina";
		c1.sex= "Male";
		c1.address= "Virgania";
	    c1.fee=  2000; 
	    
	    System.out.println("Name of customer1 "+c1.name);
		System.out.println("Sex of customer1 "+c1.sex);
		System.out.println("Address of customer1 "+c1.address);
		System.out.println("Fee of customer1 " +c1.fee);
		   
		Customer c2= new Customer();
		c2.name="Fidelis";
		c2.sex= "Male";
		c2.address="Virgania";
		c2.fee= 4000;
		
		System.out.println("Name of customer2 "+c2.name);
		System.out.println("Sex of customer2 "+c2.sex);
		System.out.println("Address of customer2 "+c2.address);
		System.out.println("Fee of customer2 "+c2.fee);
		
		Customer c3= new Customer();
		c3.name="Laxmi";
		c3.sex= "Female";
		c3.address="Virgania";
		c3.fee= 6000;
		
		System.out.println("Name of customer3 "+c3.name);
		System.out.println("Sex of customer3 "+c3.sex);
		System.out.println("Address of customer3 "+c3.address);
		System.out.println("Fee of customer3 "+c3.fee);
		
		Customer c4= new Customer();
		c4.name="Usman";
		c4.sex= "Male";
		c4.address="Virgania";
		c4.fee= 8000;
		
		System.out.println("Name of customer4 "+c4.name);
		System.out.println("Sex of customer4 "+c4.sex);
		System.out.println("Address of customer4 "+c4.address);
		System.out.println("Fee of customer4 "+c4.fee);
	}

				
		

	}

