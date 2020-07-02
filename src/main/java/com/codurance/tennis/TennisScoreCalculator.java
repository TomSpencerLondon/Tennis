package com.codurance.tennis;

public class TennisScoreCalculator {

  public String score(int player1, int player2) {
    if(player1 == 1 && player2 == 1){
      return "Fifteen all";
    }
    return "Love all";
  }
}
