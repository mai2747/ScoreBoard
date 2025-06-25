package app.model.entity;

import java.util.List;

public class Group {
    String groupName;
    String password;
    String groupID;
    List<Player> members;

    public Group(String groupName, String password, String groupID, List<Player> members){
        this.groupName = groupName;
        this.password = password;
        this.groupID = groupID;
        this.members = members;
    }

    public void setGroupID(String groupID){
        this.groupID = groupID;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setMembers(List<Player> members) {
        this.members = members;
    }

}
