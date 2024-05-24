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
}
