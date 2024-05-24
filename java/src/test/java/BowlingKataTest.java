import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BowlingKataTest {

  @Test
  public void all_spares_should_count_zero_points() {

    String input = "-- -- -- -- -- -- -- -- -- -- ";
    BowlingGame bowlingGame = new BowlingGame();

    assertEquals(bowlingGame.getScore(input), 0);
  }

  @Test
  public void one_one_should_count_one_point() {

    String input = "1- -- -- -- -- -- -- -- -- -- ";
    BowlingGame bowlingGame = new BowlingGame();

    assertEquals(bowlingGame.getScore(input), 1);
  }

  @Test
  public void two_ones_should_count_two_points() {

    String input = "11 -- -- -- -- -- -- -- -- -- ";
    BowlingGame bowlingGame = new BowlingGame();

    assertEquals(bowlingGame.getScore(input), 2);
  }

  @Test
  public void one_two_three_should_count_six_points() {

    String input = "12 3- -- -- -- -- -- -- -- -- ";
    BowlingGame bowlingGame = new BowlingGame();

    assertEquals( 6, bowlingGame.getScore(input));
  }
}
