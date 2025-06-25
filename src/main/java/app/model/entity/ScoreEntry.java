package app.model.entity;

public class ScoreEntry {
    int playerID;
    int turnID;
    int score;
    //float time;

    public ScoreEntry(int playerID, int turnID, int score){
        this.playerID = playerID;
        this.turnID = turnID;
        this.score = score;
    }
}
