package processors;

import lombok.Getter;
import lombok.Setter;
import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import repository.CommentRepository;

@Getter
@Setter
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {
    @Autowired
    private CommentRepository commentRepository;

    private Comment comment;

    public void processComment() {

    }

    public void validateComment() {

    }
}
