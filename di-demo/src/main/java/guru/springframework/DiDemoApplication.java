package guru.springframework;

import guru.springframework.controller.ConstructorInjectedController;
import guru.springframework.controller.GetterInjectedController;
import guru.springframework.controller.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;

import guru.springframework.controller.MyController;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// Hemos cambiado Services a otra ruta, debajo de guru, tenemos que llamar ahora con Component Scan para que detecte otras rutas:
@ComponentScan(basePackages = {"guru.services", "guru.springframework"})
public class DiDemoApplication {

	public static void main(String[] args) {
		// Guardamos el context para usarlo ahora
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		// Ahora preguntamos al context que me de un Bean llamado "myController" desde el context
		MyController controller = (MyController) ctx.getBean("myController");
		
		// Ahora llamamos al metodo del objeto bean del context, como vemos no hemos instanciado un objeto controller como tal, lo ha dado el contexto.
		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

	}

}
