package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public PlayerDao playerDao() {
		PlayerDaoInMemoryImpl bean = new PlayerDaoInMemoryImpl();
		return bean;
		
	}
	
	@Bean
	public PlayerEditor playerEditor() {
		PlayerEditorImpl bean = new PlayerEditorImpl();
		bean.setPlayerDao(playerDao());
		return bean;
	}

}
