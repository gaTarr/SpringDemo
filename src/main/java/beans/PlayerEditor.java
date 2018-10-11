package beans;

public interface PlayerEditor {
	
	public void changeNumber(int playerNum, int newNum);
	public void changePosition(int playerNum, String newPosition);
	public void useRedshirt(int playerNum);
	public Player getPlayer(int playerNum);
	

}
