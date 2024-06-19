package main;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Parrot {
    private String name;

    public Parrot() {
        System.out.println("Parrot created");
    }

    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}
