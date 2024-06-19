package beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Person {
    private String name;
    private Parrot parrot;

    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
