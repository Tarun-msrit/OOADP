package Factory;
public class Client {

	
	public static void main(String[] args) {
		
		CategoryFactory categoryFactory=new CategoryFactory();
		
		Customer cust;
		
		cust=categoryFactory.categoryCustomer("Teen");
		
		cust=categoryFactory.categoryCustomer("Kids");
		
		cust=categoryFactory.categoryCustomer("Test");
		System.out.println(cust);
		
		cust=categoryFactory.categoryCustomer("Senior");

	}

}
