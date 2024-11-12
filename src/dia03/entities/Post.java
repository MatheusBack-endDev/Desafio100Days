package dia03.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> commentList = new ArrayList<>();

    public Post(){

    }

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void addComment(Comment comment){
        commentList.add(comment);
    }

    public void removeComment(Comment comment){
        commentList.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment)).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments: \n");
        for (Comment c: commentList){
            sb.append(c.getText()).append("\n");
        }
        return sb.toString();
    }
}
