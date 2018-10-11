package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		PlayerEditor playerEditor = context.getBean("playerEditor", PlayerEditor.class);
		
		System.out.println("Before Player Edit");
		System.out.println(playerEditor.getPlayer(4).toString());
		
		playerEditor.changePosition(4, "WR");
		
		System.out.println("After Player Edit");
		System.out.println(playerEditor.getPlayer(4).toString());

	}

}
