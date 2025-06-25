package app.model;

import app.model.entity.Group;
import app.model.entity.Player;

import java.util.*;

public class GroupManager {
    Set<String> usedGroupIDs = new HashSet<>();
    // 起動と同時にデータベースから取得するべき？
    Group currentGroup;

    public Group createGroup(String groupName, String password, String groupID, List<Player> members){
        currentGroup = new Group(groupName, password, groupID, members);
        // Update DB at this point
        return currentGroup;
    }

    public void updateGroupInfo(String groupName, String password, List<Player> members){
        if(currentGroup == null) return;

        currentGroup.setGroupName(groupName);
        currentGroup.setPassword(password);
        currentGroup.setMembers(members);

        // Update DB at this point
    }

    public void deleteGroup(){

    }

    public void deleteHistory(){

    }

    private String generateGroupID() {
        String id;
        do {
            id = UUID.randomUUID().toString();
        } while (usedGroupIDs.contains(id));

        usedGroupIDs.add(id);
        return id;
    }
}
