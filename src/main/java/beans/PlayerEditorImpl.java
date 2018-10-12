package beans;

public class PlayerEditorImpl implements PlayerEditor {
	
	private PlayerDao playerDao;
	
	//Adding Constructor
	public PlayerEditorImpl(PlayerDao playerDao) {
		this.playerDao = playerDao;
	}
	

	public PlayerDao getPlayerDao() {
		return playerDao;
	}

	public void setPlayerDao(PlayerDao playerDao) {
		this.playerDao = playerDao;
	}

	public void changeNumber(int playerNum, int newNum) {
		Player player = playerDao.find(playerNum);
		player.setNumber(newNum);
		playerDao.update(player);

	}

	public void changePosition(int playerNum, String newPosition) {
		Player player = playerDao.find(playerNum);
		player.setPosition(newPosition);
		playerDao.update(player);

	}

	public void useRedshirt(int playerNum) {
		// TODO Auto-generated method stub
		Player player = playerDao.find(playerNum);
		player.setRedshirted(true);
		playerDao.update(player);

	}

	public Player getPlayer(int playerNum) {
		// TODO Auto-generated method stub
		return playerDao.find(playerNum);
	}

}
