package app.model.entity;

public class Player {
    String name;
    int playerID;

    public Player(String name, int playerID){
        this.name = name;
        this.playerID = playerID;
    }

    public String getName(){ return name; }
    public int getPlayerID(){ return playerID; }

    public void setName(String newName){
        name = newName;
    }

    @Override
    public String toString(){
        return name;
    }
}
