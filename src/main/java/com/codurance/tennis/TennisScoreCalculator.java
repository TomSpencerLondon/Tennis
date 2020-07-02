package com.codurance.tennis;

import static java.lang.Math.*;

import java.util.HashMap;

public class TennisScoreCalculator {

  private final String player1;
  private final String player2;
  HashMap<Integer, String> scores = new HashMap<Integer, String>();

  public TennisScoreCalculator(String player1, String player2) {
    this.player1 = player1;
    this.player2 = player2;
    this.scores.put(0, "Love");
    this.scores.put(1, "Fifteen");
    this.scores.put(2, "Thirty");
    this.scores.put(3, "Forty");
  }

  public String score(int player1Score, int player2Score) {
    StringBuilder result = new StringBuilder();
    if(player1Score == player2Score && player1Score < 3){
      result.append(scores.get(player1Score));
      result.append(" all");
    }else if(player1Score == player2Score){
      result.append("Deuce");
    }else if((player1Score >= 3 && player2Score >= 3) && (abs(player1Score - player2Score) == 1)){
      if(player1Score > player2Score){
        result.append("Advantage ");
        result.append(player1);
      }else{
        result.append("Advantage " );
        result.append(player2);
      }
    }else{
      result.append(scores.get(player1Score));
      result.append(", ");
      result.append(scores.get(player2Score));
    }

    return result.toString();
  }

}
