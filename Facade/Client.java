package Facade;
public class Client {

	public static void main(String[] args) {
		DecathlonFacade df=new DecathlonFacade(true, 2000);
		df.purchasedItem();
		df.calculateBill();
		
		df=new DecathlonFacade(false, 2000);
		df.purchasedItem();
		df.calculateBill();
		

	}

}
