package model;


public class GameModel {
	private PLayerCatalogue playerCatalogue;
	private String[] gamePlayers;
	private String[][] gameBoard;
	
	public GameModel() {
		this.playerCatalogue = new PLayerCatalogue();
		this.gamePlayers = new String[2];
	}
	
	public void selectPlayer(String player, int pos) {
		if(pos < 0 && pos > 4)
			return;
		else
			this.gamePlayers[pos] = player;
	}
	
	public boolean ready() {
		return (this.gamePlayers[0] != null && this.gamePlayers[1] != null);
	}
	
	public void startGame() {
		this.gameBoard = new String[3][3];
	}
	
	public boolean inPlay() {
		return (gameBoard != null);
	}
	
	public boolean noPlay() {
		return !inPlay();
	}
	
	public String[] getPlayers() {
		return this.gamePlayers;
	}
	
	public String[][] getGameBoard(){
		return this.gameBoard;
	}
	
	public void setGameBoard(String[][] gameBoard) {
		this.gameBoard = gameBoard;
	}
	
	public PLayerCatalogue getPlayerCatalogue() {
		return playerCatalogue;
	}

	public void setPlayerCatalogue(PLayerCatalogue playerCatalogue) {
		this.playerCatalogue = playerCatalogue;
	}

}
