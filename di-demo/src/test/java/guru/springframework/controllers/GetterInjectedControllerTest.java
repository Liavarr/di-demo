package guru.springframework.controllers;

import guru.springframework.controller.GetterInjectedController;
import guru.springframework.services.GreetingServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by jt on 5/24/17.
 */
public class GetterInjectedControllerTest {

    // Creamos un atributo Getter intjected contoller
    private GetterInjectedController getterInjectedController;

    @BeforeEach
    public void setUp() throws Exception {
        // Antes de empezar cada prueba asignamos un nuevo GetterInjectedController a nuestro atributo
        // Asignamos una nueva instancia
        this.getterInjectedController = new GetterInjectedController();

        // Ahora por getter le metemos el Greeting Service object
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        // Comprueba si el primer valor y el segundo son iguales
        assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
    }
}