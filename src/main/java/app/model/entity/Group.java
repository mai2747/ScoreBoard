package app.model.entity;

import java.util.List;

public class Group {
    String GroupName;
    int GroupID;
    String password;
    List<Player> members;

    public Group(String groupName, String password){
        this.GroupName = groupName;
        this.password = password;
    }
}
