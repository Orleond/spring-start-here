package services;

import lombok.Getter;
import org.springframework.stereotype.Component;
import repositories.CommentRepository;

@Getter
@Component
public class UserService {
    private CommentRepository commentRepository;

    public UserService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
}
