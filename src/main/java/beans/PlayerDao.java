package beans;

import java.util.List;

public interface PlayerDao {
	
	public void insert(Player player);
	public void update(Player player);
	public void update(List<Player> players);
	public void delete(int playerNum);
	public Player find(int playerNum);
	public List<Player> find(List<Integer> playerNums);
	public List<Player> find(String name);
	public List<Player> find(boolean redshirted);

}
