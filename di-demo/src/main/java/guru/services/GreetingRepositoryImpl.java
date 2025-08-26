package guru.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    public GreetingRepositoryImpl() {

    }
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "Primärer Grußdienst";

    }

}
