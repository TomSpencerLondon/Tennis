package com.codurance.tennis;

public class TennisScoreCalculator {

  public String score(int player1, int player2) {
    StringBuilder stringBuilder = new StringBuilder();
    for (Score score : Score.values()) {
      if (player1 == score.input) {
        stringBuilder.append(score.output);
      }
    }
    return stringBuilder.append(" all").toString();
  }

  private enum Score {
    LOVE(0, "Love"),
    FIFTEEN(1, "Fifteen"),
    THIRTY(2, "Thirty"),
    FORTY(3, "Forty");

    private final int input;
    private final String output;

    Score(int input, String output) {
      this.input = input;
      this.output = output;
    }
  }
}
