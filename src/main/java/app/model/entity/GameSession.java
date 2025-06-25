package app.model.entity;

import java.util.*;

public class GameSession {
    Date date; // ゲーム開始の時間を記録。DB用意してデータ損失を防ぐ。
    List<Player> playOrder;
    List<ScoreEntry> scores = new ArrayList<>(); //-- 表を模して保存
    Player currentPlayer;
    int currentTurnID = 1;

    public void submitScore(int score){
        scores.add(new ScoreEntry(currentPlayer.getPlayerID(), currentTurnID, score));
        // Update DB at this point

        currentTurnID++;
        currentPlayer = getCurrentPlayer();
    }

    public Player getCurrentPlayer() {
        int currentPlayerIndex = currentTurnID % playOrder.size();
        return playOrder.get(currentPlayerIndex);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPlayOrder(List<Player> playOrder){
        if(playOrder.isEmpty()){
            System.out.println("Play order is empty");
            System.out.println("Failed setPlayOrder()");
            return;
        }
        this.playOrder = playOrder;
        currentPlayer = playOrder.get(0);
    }

    public void setCurrentPlayer(Player player){
        currentPlayer = player;
    }
}
