package Abstract;
public class Abled implements Factory {

	@Override
	public OutdoorAdventure outdoorAdventure(String type) {
		if(type.equals("trek")){
			return new TrekA();
		}
		else{
			return new ParaA();
		}
	}

	@Override
	public OutdoorRegular outdoorRegular(String type) {
		if (type.equals("foo")){
			return new FooA();
		}
		else{
			return new CircA();
		}
		
	}

}
