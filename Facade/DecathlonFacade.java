package Facade;
public class DecathlonFacade {
	
	Sports200Items spItems;
	Sports200ProcessSales spProcess;
	
	public DecathlonFacade(boolean gift,int totAmt) {
		spItems=new Sports200Items();
		int numItems=spItems.getNumItems();
		spProcess=new Sports200ProcessSales(gift, totAmt, numItems);
	}
	
	public void purchasedItem() {
		spItems.getItems();
	}
	public void calculateBill(){
		spProcess.processSale();
	}
}
