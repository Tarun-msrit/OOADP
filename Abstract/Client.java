package Abstract;
public class Client {

	
	public static void main(String[] args) {
		Factory factory=new Abled();
		OutdoorAdventure oA=factory.outdoorAdventure("para");
		oA.display();
		
		OutdoorRegular outdoorRegular=factory.outdoorRegular("Cric");
		outdoorRegular.display();
		
		factory=new DifferentlyAbled();
		outdoorRegular=factory.outdoorRegular("foo");
		outdoorRegular.display();
		oA=factory.outdoorAdventure("trek");
		oA.display();
		
		
		

	}

}
