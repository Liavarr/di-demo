package guru.springframework.controllers;

import guru.springframework.controller.PropertyInjectedController;
import guru.springframework.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by jt on 5/24/17.
 */
public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    public void setUp() throws Exception {
        // Asignamos a nuestro objeto una nueva instancia
        this.propertyInjectedController = new PropertyInjectedController();
        // Y a su atributo publico le añadimos el objeto greeting service implementation
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        // Comparamos el valor de la cadena de Greeting Service Implementation con el valor del objeto dentro de Property injected controller.sayGreeting, llamando al metodo dentro del objeto
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}