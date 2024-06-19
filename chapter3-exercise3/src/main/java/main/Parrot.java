package main;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Parrot {
    private String name;

    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}
