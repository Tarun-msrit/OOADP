package Factory;
public class SeniorCitizen extends Customer {

	public SeniorCitizen() {
		
	}

	@Override
	public void printRate() {
			System.out.println("Discount for Senior Citzen is 20%");

	}

}
