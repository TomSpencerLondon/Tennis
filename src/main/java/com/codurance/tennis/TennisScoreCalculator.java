package com.codurance.tennis;

import java.util.HashMap;

public class TennisScoreCalculator {
  HashMap<Integer, String> scores = new HashMap<Integer, String>();

  public TennisScoreCalculator() {
    this.scores.put(0, "Love");
    this.scores.put(1, "Fifteen");
    this.scores.put(2, "Thirty");
    this.scores.put(3, "Forty");
  }

  public String score(int player1, int player2) {
    StringBuilder result = new StringBuilder();
    if(player1 == player2 && player1 < 3){
      result.append(scores.get(player1));
      result.append(" all");
    }else if(player1 == player2){
      result.append("Deuce");
    }else{
      result.append(scores.get(player1));
      result.append(", ");
      result.append(scores.get(player2));
    }

    return result.toString();
  }

}
