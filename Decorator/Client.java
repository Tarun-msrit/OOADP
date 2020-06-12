package Decorator;
public class Client {

	public static void main(String[] args) {
		
		System.out.println("INDOOR GAMES");
		DecathlonPOS dpIndoor= new IndoorSports();
		System.out.println(dpIndoor.getDescription()+" Stock "+dpIndoor.getCurrentStock());
		
		dpIndoor=new GamesOnTable(dpIndoor, "TT");
		System.out.println(dpIndoor.getDescription()+" Stock "+dpIndoor.getCurrentStock());
		
		dpIndoor=new BoardGames(dpIndoor, "Chess");
		System.out.println(dpIndoor.getDescription()+" Stock "+dpIndoor.getCurrentStock());
		
		
		System.out.println("OUTDOOR GAMES");
		DecathlonPOS dpOutdoor=new OutdoorSports();
		System.out.println(dpOutdoor.getDescription()+" Stock "+dpOutdoor.getCurrentStock());
		
		dpOutdoor=new AdventureGames(dpOutdoor, "ParaGliding");
		System.out.println(dpOutdoor.getDescription()+" Stock "+dpOutdoor.getCurrentStock());
		
		dpOutdoor=new StadiumGames(dpOutdoor, "Cricket");
		System.out.println(dpOutdoor.getDescription()+" Stock "+dpOutdoor.getCurrentStock());
	}

}
