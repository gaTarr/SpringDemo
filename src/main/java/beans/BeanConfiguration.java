package beans;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public PlayerDao playerDao() {
		PlayerDaoInMemoryImpl bean = new PlayerDaoInMemoryImpl();
		return bean;
		
	}
	
	@Bean (autowire=Autowire.BY_NAME)
	public PlayerEditor playerEditor() {
		PlayerEditorImpl bean = new PlayerEditorImpl(playerDao());
		//bean.setPlayerDao(playerDao());
		return bean;
	}
	
	@Bean
	public PlayerDao playerDaoJdbc() {
		PlayerDaoJdbcImpl bean = new PlayerDaoJdbcImpl();
		return bean;
	}

}
