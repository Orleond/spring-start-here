package service;

import lombok.Getter;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Getter
@Lazy
public class CommentService {

    public CommentService() {
        System.out.println("CommentService created");
    }
}
