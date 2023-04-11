package javaPackage;

interface Bank
{
	String Bankname="Citigroup";
	String name="Harry";
	void Bankname();
	void accountHolderName();
}




public class BankDetails implements Bank{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Bank obj= new BankDetails();
			obj.Bankname();
			obj.accountHolderName();
	}

	@Override
	public void Bankname() {
		// TODO Auto-generated method stub
		System.out.println("The name of bank "+Bankname);
	}

	@Override
	public void accountHolderName() {
		// TODO Auto-generated method stub
		System.out.println("The name of account holder "+name);
	}

		
	}
	








