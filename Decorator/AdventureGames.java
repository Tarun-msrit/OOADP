package Decorator;
public class AdventureGames extends DecoratorOutdoor {

	DecathlonPOS dp;
	String game;
	public AdventureGames(DecathlonPOS dp,String game) {
		this.dp=dp;
		this.game=game;
	}

	@Override
	public String getDescription() {
		
		return (dp.getDescription()+" and "+game);
	}

	@Override
	public int getCurrentStock() {
		
		return dp.getCurrentStock()+10;
	}
}
