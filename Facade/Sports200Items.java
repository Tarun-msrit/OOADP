package Facade;
import java.util.ArrayList;
import java.util.Scanner;


public class Sports200Items {

	ArrayList<String> itemsPurchased;
	Scanner scanner=new Scanner(System.in);
	int numItems;
	
	public Sports200Items() {
		itemsPurchased=new ArrayList<String>();
		numItems=0;
		selectItem();
	}
	
	public int getNumItems(){
		return numItems;
	}
	
	public void  getItems() {
		for(String item : itemsPurchased){
			System.out.println("Item \t"+item);
		}
	}
	
	public void  selectItem() {
		System.out.println("Enter total No. of Items");
		numItems=scanner.nextInt();
		for (int i = 0; i < numItems; i++) {
			System.out.println("Enter the Items name and Qty");
			String selItem=scanner.next();
			itemsPurchased.add(selItem);
			
		}
		
	}
	
}
