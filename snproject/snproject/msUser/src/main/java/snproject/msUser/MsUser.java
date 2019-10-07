package snproject.msUser;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class MsUser {

    public MsUser(List<MsUser> msUserLists){

    }

    public MsUser(String userID, String name, String about_user, String email){
        this.userID = userID;
        this.name = name;
        this.about_user = about_user;
        this.email = email;

    }

    private String userID;
    private String name;
    private String about_user;
    private String email;


}
