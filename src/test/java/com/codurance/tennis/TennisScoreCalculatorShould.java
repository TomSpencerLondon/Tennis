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
}
