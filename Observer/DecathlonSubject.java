package Observer;
public interface DecathlonSubject {
	public void notifyEveryone();
	public void attach(DecathlonObserver dObserver);
}
