package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.CommentRepository;
import service.CommentService;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cr1 = context.getBean(CommentService.class).getCommentRepository();
        var cr2 = context.getBean(UserService.class).getCommentRepository();

        System.out.println(cr1 == cr2);
    }
}
