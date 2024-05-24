import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingKataTest {

  private BowlingGame bowlingGame;

  @BeforeEach
  public void setup() {
    this.bowlingGame = new BowlingGame();
  }

  @ParameterizedTest
  @ValueSource(strings = {"-- -- -- -- -- -- -- -- -- -- "})
  public void all_spares_should_count_zero_points(String input) {

    assertEquals(0, bowlingGame.getScore(input));
  }

  @ParameterizedTest
  @ValueSource(strings = {"12 3- -- -- -- -- -- -- -- -- "})
  public void one_two_three_should_count_six_points(String input) {

    assertEquals( 6, bowlingGame.getScore(input));
  }

  @ParameterizedTest
  @ValueSource(strings = {"9- 9- 9- 9- 9- 9- 9- 9- 9- 9-"})
  public void ten_pairs_of_nine_and_a_miss_should_count_ninety_points(String input) {

    assertEquals( 90, bowlingGame.getScore(input));
  }
}
