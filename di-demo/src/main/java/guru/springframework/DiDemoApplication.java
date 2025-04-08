package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;

import guru.springframework.controller.MyController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		// Guardamos el context para usarlo ahora
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		// Ahora preguntamos al context que me de un Bean llamado "myController" desde el context
		MyController controller = (MyController) ctx.getBean("myController");
		
		// Ahora llamamos al metodo del objeto bean del context, como vemos no hemos instanciado un objeto controller como tal, lo ha dado el contexto.
		controller.hello();

	}

}
