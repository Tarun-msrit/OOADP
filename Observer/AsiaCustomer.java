package Observer;
public class AsiaCustomer implements DecathlonObserver {

	AsiaDiscount discount;
	DecathlonSubject subject;
	public AsiaCustomer(DecathlonSubject dSubject) {
		this.subject=dSubject;
		subject.attach(this);
	}

	@Override
	public void update(AsiaDiscount a) {
		discount=a;
	}
	
	public void display(){
		System.out.println("Discount : "+discount.disc+"\nName : "+discount.name);
	}

}
