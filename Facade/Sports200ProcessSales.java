package Facade;
import java.util.Scanner;


public class Sports200ProcessSales {
	boolean gift;
	int totAmt;
	int numItems;
	Scanner scanner=new Scanner(System.in);
	public Sports200ProcessSales(boolean gift, int totAmt, int numItems) {
		super();
		this.gift = gift;
		this.totAmt = totAmt;
		this.numItems = numItems;
	}
	
	public void processSale() {
		
		if(!gift){
			System.out.println("No Gift Card , Please pay total AMT "+totAmt);
		}
		else{
			if(numItems>1){
				System.out.println("You have purchased more than one item, gift card not elgible");
				System.out.println("Please pay the totAmt "+totAmt);
			}
			else if(numItems<1){
				System.out.println("No Items in Basket");
			}
			else{
				System.out.println("Enter the gift value : ");
				int giftVal=scanner.nextInt();
				if(totAmt>=giftVal){
					totAmt=totAmt-giftVal;
					System.out.println("Gift Applied : please pay "+totAmt);
				}
				else{
					totAmt=totAmt-giftVal;
					System.out.println("Total Amt covered by gift , totAmt"+totAmt);
				}
				
			}
		}
	}
	
	
	
}
