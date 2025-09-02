package guru.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


//Esta clase se encarga de crear una forma de acceder a los diferentes tipos de Servicios segun el caso
public class GreetingServiceFactory {
    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    //Aqui tenemos el constructor que devuelve cada valor dependiendo de lo que le pasemos
    public GreetingService createGreetingService(String lang) {
        switch (lang){
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
