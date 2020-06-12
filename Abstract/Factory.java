package Abstract;
public interface Factory {
	
	public OutdoorAdventure outdoorAdventure(String type);
	public OutdoorRegular  outdoorRegular(String type);
}
