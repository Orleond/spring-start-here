package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs1 = context.getBean(CommentService.class);
        var cs2 = context.getBean(UserService.class);

        boolean b1 = cs1.getCommentRepository() == cs2.getCommentRepository();

        System.out.println(b1);
    }
}
