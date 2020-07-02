package com.codurance.tennis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TennisScoreCalculatorShould {
  private TennisScoreCalculator tennisScoreCalculator;

  @BeforeEach
  void setUp() {
    tennisScoreCalculator = new TennisScoreCalculator("John", "Alice");
  }

  @Test
  void return_love_all_for_0_0() {
    assertEquals("Love all", tennisScoreCalculator.score(0, 0));
  }

  @Test
  void return_fifteen_all_for_1_1() {
    assertEquals("Fifteen all", tennisScoreCalculator.score(1, 1));
  }

  @Test
  void return_thirty_all_for_2_2() {
    assertEquals("Thirty all", tennisScoreCalculator.score(2, 2));
  }

  @Test
  void return_forty_all_for_3_3() {
    assertEquals("Deuce", tennisScoreCalculator.score(3, 3));
  }

  @Test
  void return_forty_thirty_for_3_2() {
    assertEquals("Forty, Thirty", tennisScoreCalculator.score(3, 2));
  }

  @Test
  void return_thirty_fifteen_for_2_1() {
    assertEquals("Thirty, Fifteen", tennisScoreCalculator.score(2, 1));
  }

  @Test
  void return_thirty_forty_for_2_3() {
    assertEquals("Thirty, Forty", tennisScoreCalculator.score(2, 3));
  }

  @Test
  void return_advantage_player1_for_4_3() {
    assertEquals("Advantage John", tennisScoreCalculator.score(4, 3));
  }
}
