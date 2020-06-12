package Template;
import java.util.ArrayList;


public abstract class OrderProcessing {

	ArrayList<String> selectedItem;
	int totAmt;
	final public void processOrder(){
		selectItem();
		doPayment();
		doDelivery();
	}
	
	public abstract void selectItem();
	public abstract void doPayment();
	public abstract void doDelivery();
}
