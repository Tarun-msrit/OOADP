package Factory;
public class Kids extends Customer {

	public Kids() {
		
	}

	@Override
	public void printRate() {
		System.out.println("Discount for kids is 10% ");
	}

}
