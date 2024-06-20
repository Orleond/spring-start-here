package main;

import config.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
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
