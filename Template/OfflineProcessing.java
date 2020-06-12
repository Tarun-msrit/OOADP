package Template;
import java.util.ArrayList;
import java.util.Scanner;


public class OfflineProcessing extends OrderProcessing {

	
	public OfflineProcessing() {
		
	}

	@Override
	public void selectItem() {
		System.out.println("Go try the availaible product in trial room");

	}

	@Override
	public void doPayment() {
		System.out.println("Please pay the total via card or cash");

	}

	@Override
	public void doDelivery() {
		System.out.println("Please collect your item in the counter");

	}

}
