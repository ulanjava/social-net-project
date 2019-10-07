package snproject.msPost;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Post {



    public Post(){

    }

    public Post(String postID, String userID, String postText){
        this.postID = postID;
        userID = userID;
        this.postText = postText;
    }

    private String postID;
    private String postText;

}
