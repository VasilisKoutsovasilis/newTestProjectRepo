package model;

public class PLayerCatalogue {
	private String[] players;
	
	public PLayerCatalogue() {
		this.players = new String[4];
		this.players[0] = "Vasilis";
		this.players[1] = "Nektarios";
		this.players[2] = "Yannis";
		this.players[3] = "Eleni";
	}
	
	public String getPlayer(int i) {
		if(i < 0 || i > 4)
			return null;
		else
			return this.players[i];
	}
	
	public String[] getPlayers() {
		return this.players;
	}

}
