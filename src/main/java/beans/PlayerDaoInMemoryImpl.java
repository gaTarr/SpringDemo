package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerDaoInMemoryImpl implements PlayerDao {
	
	private Map<Integer, Player> playersMap = new HashMap<Integer, Player>();
	
	{
		Player player1 = new Player(4, "Nate Stanley", "QB");
		Player player2 = new Player(94, "AJ Epenesa", "DE");
		
		playersMap.put(player1.getNumber(), player1);
		playersMap.put(player2.getNumber(), player2);
	}

	public void insert(Player player) {
		// TODO Auto-generated method stub
		playersMap.put(player.getNumber(), player);

	}

	public void update(Player player) {
		// TODO Auto-generated method stub
		playersMap.put(player.getNumber(), player);

	}

	public void update(List<Player> players) {
		// TODO Auto-generated method stub
		for(Player player: players) {
			update(player);
		}

	}

	public void delete(int playerNum) {
		// TODO Auto-generated method stub
		playersMap.remove(playerNum);

	}

	public Player find(int playerNum) {
		// TODO Auto-generated method stub
		return playersMap.get(playerNum);
	}

	public List<Player> find(List<Integer> playerNums) {
		// TODO Auto-generated method stub
		List<Player> players = new ArrayList<Player>();
		for(Integer playerNum: playerNums) {
			players.add(playersMap.get(playerNum));
		}
		return players;
	}

	public List<Player> find(String name) {
		// TODO Auto-generated method stub
		List<Player> players = new ArrayList<Player>();
		for(Player player: playersMap.values()) {
			if(name.equals(player.getName())) {
				players.add(player);
			}
		}
		return players;
	}

	public List<Player> find(boolean redshirted) {
		// TODO Auto-generated method stub
		List<Player> players = new ArrayList<Player>();
		for(Player player: playersMap.values()) {
			if(redshirted == (player.isRedshirted())) {
				players.add(player);
			}
		}
		return players;
	}

}
