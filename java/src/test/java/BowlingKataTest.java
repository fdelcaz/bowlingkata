import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingKataTest {

  private BowlingGame bowlingGame;

  @BeforeEach
  public void setup() {
    this.bowlingGame = new BowlingGame();
  }

  @Test
  public void all_spares_should_count_zero_points() {

    String input = "-- -- -- -- -- -- -- -- -- -- ";

    assertEquals(0, bowlingGame.getScore(input));
  }

  @Test
  public void one_two_three_should_count_six_points() {

    String input = "12 3- -- -- -- -- -- -- -- -- ";

    assertEquals( 6, bowlingGame.getScore(input));
  }

  @Test
  public void ten_pairs_of_nine_and_a_miss_should_count_ninety_points() {
    String input = "9- 9- 9- 9- 9- 9- 9- 9- 9- 9-";

    assertEquals( 90, bowlingGame.getScore(input));
  }
}
