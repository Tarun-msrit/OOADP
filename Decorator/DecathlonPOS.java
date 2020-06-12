package Decorator;
public abstract class DecathlonPOS {
	
	String description="Unknown Game";
	
	public String getDescription(){
		return description;
	}
	
	public abstract int getCurrentStock();
	
}
