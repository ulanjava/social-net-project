package snproject.msUser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/MsUser/info")
public class MsUserController {


    @GetMapping("/{id}")
    public MsUser getMsUsersById(
            @PathVariable("id") String id) {

        List<MsUser> msUserLists =  Arrays.asList(
                new MsUser("1", "Title 1", "Tt", "Desc 1"),
                new MsUser("2", "Title 2", "Ttt", "Desc 2"));

        MsUser MsUser = new MsUser(msUserLists);

        return MsUser;
    }
}
