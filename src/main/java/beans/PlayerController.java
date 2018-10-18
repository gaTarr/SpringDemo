package beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlayerController {
	@Autowired PlayerDao dao;
	
	private static final String[] positions = {"QB", "RB", "OL", "WR", "TE", "DL", "LB", "CB", "S", "K", "P"};
	
	@RequestMapping(value = "/form")
		public ModelAndView player() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("playerForm");
		modelAndView.addObject("player",  new Player());
		modelAndView.addObject("positions", positions);
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/result")
		public ModelAndView ProcessPlayer(Player player) {
			System.out.println("In processPlayer");
			ModelAndView modelAndView = new ModelAndView();
			player.setGradYear();  //added 10/18/18
			dao.insertPlayer(player);
			System.out.println("Value in getName " + player.getName());
			modelAndView.setViewName("playerResult");
			modelAndView.addObject("p", player);
			return modelAndView;
	}
	
	@Bean
		public PlayerDao dao() {
			PlayerDao bean = new PlayerDao();
			return bean;
	}
	
	@RequestMapping(value = "/viewAll")
		public ModelAndView viewAll() {
		ModelAndView modelAndView = new ModelAndView();
		List<Player> allPlayers = dao.getAllPlayers();
		modelAndView.setViewName("viewRoster");
		modelAndView.addObject("all",  allPlayers);
		return modelAndView;
	}

}


