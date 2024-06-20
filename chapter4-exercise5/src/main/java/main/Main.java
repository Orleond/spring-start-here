package main;

import config.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var commentService = context.getBean(CommentService.class);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo Comment");

        commentService.publishComment(comment);
    }
}
