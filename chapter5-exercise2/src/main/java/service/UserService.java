package service;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repository.CommentRepository;

@Service
@Getter
public class UserService {
    private final CommentRepository commentRepository;

    public UserService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
}
