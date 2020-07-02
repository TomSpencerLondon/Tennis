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
    if(sameBelowForty(player1Score, player2Score)){
      buildEvenString(player1Score, result);
    }else if(differentBelowforty(player1Score, player2Score)){
      buildScoreString(player1Score, player2Score, result);
    }else if(isDeuce(player1Score, player2Score)){
      buildDeuce(result);
    }else if(isAdvantage(player1Score, player2Score)){
      buildAdvantageString(player1Score, player2Score, result);
    }else if(isWinner(player1Score, player2Score)){
      buildWinnerString(player1Score, player2Score, result);
    }

    return result.toString();
  }

  private boolean sameBelowForty(int player1Score, int player2Score) {
    return player1Score == player2Score && player1Score < 3;
  }

  private boolean differentBelowforty(int player1Score, int player2Score){
    return player1Score != player2Score && player1Score < 3;
  }

  private void buildDeuce(StringBuilder result) {
    result.append("Deuce");
  }

  private void buildEvenString(int player1Score, StringBuilder result) {
    result.append(scores.get(player1Score));
    result.append(" all");
  }

  private void buildScoreString(int player1Score, int player2Score, StringBuilder result) {
    result.append(scores.get(player1Score));
    result.append(", ");
    result.append(scores.get(player2Score));
  }

  private void buildWinnerString(int player1Score, int player2Score, StringBuilder result) {
    result.append("Game ");
    if(player1Score > player2Score){
      result.append(player1);
    }else {
      result.append(player2);
    }
  }

  private void buildAdvantageString(int player1Score, int player2Score, StringBuilder result) {
    if(player1Score > player2Score){
      result.append("Advantage ");
      result.append(player1);
    }else{
      result.append("Advantage " );
      result.append(player2);
    }
  }

  private boolean isDeuce(int player1Score, int player2Score) {
    return player1Score == player2Score && player1Score >= 3;
  }

  private boolean isWinner(int player1Score, int player2Score) {
    return (player1Score > 3 || player2Score > 3) && (abs(player1Score - player2Score) > 1);
  }

  private boolean isAdvantage(int player1Score, int player2Score) {
    return (player1Score >= 3 && player2Score >= 3) && (abs(player1Score - player2Score) == 1);
  }

}
