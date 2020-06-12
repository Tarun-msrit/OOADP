package Decorator;
public class GamesOnTable extends DecoratorIndoor {
	
	DecathlonPOS dp;
	String game;
	public GamesOnTable(DecathlonPOS dp, String game) {
		this.dp=dp;
		this.game=game;
	}

	@Override
	public String getDescription() {
		
		return (dp.description+" and "+game);
	}

	@Override
	public int getCurrentStock() {
		
		return dp.getCurrentStock()+10;
	}

}
