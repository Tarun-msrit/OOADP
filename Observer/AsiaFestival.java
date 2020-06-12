package Observer;
import java.util.ArrayList;


public class AsiaFestival implements DecathlonSubject {

	ArrayList<DecathlonObserver> myObservers;
	AsiaDiscount discount;
	public AsiaFestival(int disc, String name) {
		myObservers=new ArrayList<DecathlonObserver>();
		discount=new AsiaDiscount();
		discount.setDisc(disc, name);
	}

	@Override
	public void notifyEveryone() {
		for(DecathlonObserver o: myObservers){
			o.update(discount);
		}
	}

	@Override
	public void attach(DecathlonObserver dObserver) {
		myObservers.add(dObserver);
	}
	
	public void changeDisc(int disc, String name){
		discount.setDisc(disc, name);
		this.notifyEveryone();
	}

}
