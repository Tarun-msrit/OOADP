package Factory;
public class CategoryFactory {
	
	Customer customer;
	public Customer categoryCustomer(String type) {
		
		customer=null;
		if(type.equalsIgnoreCase("teen")){
			customer=new Teen();
			return customer;
		}
		else if(type.equalsIgnoreCase("Kids")){
			customer=new Kids();
			return customer;
		}
		else if(type.equalsIgnoreCase("Senior")){
			customer=new SeniorCitizen();
			return customer;
		}
		else{
			return customer;
		}
		
	}
}
