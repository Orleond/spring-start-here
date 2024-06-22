package services;

import lombok.Getter;
import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Getter
@Service
public class CommentService {
    private CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
}
