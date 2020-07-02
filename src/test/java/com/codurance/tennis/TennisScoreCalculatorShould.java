package com.codurance.tennis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TennisScoreCalculatorShould {
  private TennisScoreCalculator tennisScoreCalculator;

  @BeforeEach
  void setUp() {
    tennisScoreCalculator = new TennisScoreCalculator();
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
    assertEquals("Forty all", tennisScoreCalculator.score(3, 3));
  }
}
