package Template;
public class Client {

	public static void main(String[] args) {
		
		System.out.println("ONLINE MODE");
		OrderProcessing orderProcessing=new OnlineProcessing();
		orderProcessing.processOrder();
		
		System.out.println("OFFLINE MODE");
		orderProcessing=new OfflineProcessing();
		orderProcessing.processOrder();
	}

}
