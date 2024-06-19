package config;

import main.Parrot;
import main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Ella");
        return p;
    }

    @Bean
    Person person(Parrot parrot) {
        Person p = new Person();
        p.setName("SomeName");
        p.setParrot(parrot);
        return p;
    }
}
