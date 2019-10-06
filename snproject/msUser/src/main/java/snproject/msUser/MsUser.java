package snproject.msUser;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class MsUser {

    public MsUser(List<MsUser> msUserLists){

    }

    public MsUser(String id, String name, String about_user, String email){
        this.id = id;
        this.name = name;
        this.about_user = about_user;
        this.email = email;

    }

    private String id;
    private String name;
    private String about_user;
    private String email;


}
