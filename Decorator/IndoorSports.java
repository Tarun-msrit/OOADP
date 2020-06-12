package Decorator;
public class IndoorSports extends DecathlonPOS {

	public IndoorSports() {
		description="Indoor Sports";
	}

	@Override
	public int getCurrentStock() {
		
		return 10;
	}

}
