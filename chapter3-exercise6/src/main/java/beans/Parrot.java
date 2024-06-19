package beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
public class Parrot {
    private String name;

    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}
