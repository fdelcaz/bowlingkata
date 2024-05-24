import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingKataTest {

  private BowlingGame bowlingGame;

  @BeforeEach
  public void setup() {
    this.bowlingGame = new BowlingGame();
  }

  @ParameterizedTest
  @MethodSource("testCases")
  public void testScenarios(String input, int expectedResult) {
    assertEquals(expectedResult, bowlingGame.getScore(input));
  }

  static Stream<Arguments> testCases() {
    return Stream.of(
      Arguments.of("-- -- -- -- -- -- -- -- -- -- ", 0),
      Arguments.of("12 3- -- -- -- -- -- -- -- -- ", 6),
      Arguments.of("9- 9- 9- 9- 9- 9- 9- 9- 9- 9-", 90),
      Arguments.of("9/ 1- -- -- -- -- -- -- -- --", 11),
      Arguments.of("9/ -- -- -- -- -- -- -- -- --", 10)
//      Arguments.of("5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5", 150)
    );
  }
}
