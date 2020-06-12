package Decorator;
public class OutdoorSports extends DecathlonPOS {

	public OutdoorSports() {
		description="Outdoor Sports";
	}

	@Override
	public int getCurrentStock() {
		
		return 10;
	}

}
