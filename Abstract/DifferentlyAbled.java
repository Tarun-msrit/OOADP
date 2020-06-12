package Abstract;
public class DifferentlyAbled implements Factory {

	@Override
	public OutdoorAdventure outdoorAdventure(String type) {
		if(type.equals("trek")){
			return new TrekD();
		}
		else{
			return new ParaD();
		}
	}

	@Override
	public OutdoorRegular outdoorRegular(String type) {
		if (type.equals("foo")){
			return new FooD();
		}
		else{
			return new CricD();
		}
	}

}
