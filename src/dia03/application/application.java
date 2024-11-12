package dia03.application;

import dia03.entities.Comment;
import dia03.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class application {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("boa");
        Comment c2 = new Comment("legal");

        Post p1 = new Post(sdf.parse("21/10/2024 15:20:12"), "traveling to new zealand", "im going to visit this wonderful country", 12);
        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);
    }
}
