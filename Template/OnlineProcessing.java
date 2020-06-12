package Template;
import java.util.ArrayList;
import java.util.Scanner;


public class OnlineProcessing extends OrderProcessing {

	Item item;
	Scanner scanner =new Scanner(System.in);
	public OnlineProcessing() {
		selectedItem=new ArrayList<String>();
		totAmt=0;
		item=new Item();
	}

	@Override
	public void selectItem() {
		item.getItemList();
		
		boolean ch=true;
		while(ch){
			System.out.println("Enter Name of item to buy :");
			String selItem=scanner.next();
			if(item.itemList.containsKey(selItem)){
				selectedItem.add(selItem);
				totAmt+=item.itemList.get(selItem);
			}
			else{
				System.out.println("Does not exist");
			}
			System.out.println("Do u want to enter one more product \n");
			ch=scanner.nextBoolean();
		}
	}

	@Override
	public void doPayment() {
		
		System.out.println("Please pay the Bill Amt "+totAmt+" through NET BANKING");
	}

	@Override
	public void doDelivery() {
		
		System.out.println("The Order will be delivered to the Address and Shipping applies ");

	}

}
