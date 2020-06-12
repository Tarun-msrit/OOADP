package Observer;
public class Client {

	public static void main(String[] args) {
		AsiaFestival af=new AsiaFestival(20, "Diwali");
		AsiaCustomer india=new AsiaCustomer(af);
		af.notifyEveryone();
		india.display();
		
		af.changeDisc(30, "new year");
		india.display();
	}

}
