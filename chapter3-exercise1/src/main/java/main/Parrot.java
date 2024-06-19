package main;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Parrot {
    private String name;

    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}
