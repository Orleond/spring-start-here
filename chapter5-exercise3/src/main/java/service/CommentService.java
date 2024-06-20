package service;

import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class CommentService {

    public CommentService() {
        System.out.println("CommentService created");
    }
}
