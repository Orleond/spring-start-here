package main;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class Person {
    private String name;
    private Parrot parrot;
}
