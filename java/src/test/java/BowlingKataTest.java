import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BowlingKataTest {

  private BowlingGame bowlingGame;
  private FrameScoreTokenizer frameScoreTokenizer;

  @BeforeEach
  public void setup() {
    this.frameScoreTokenizer = mock(FrameScoreTokenizer.class);
    this.bowlingGame = new BowlingGame(this.frameScoreTokenizer);
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

  @Test
  public void testFrameScoreTokenizer() {
    String currentGame = "1- 1- -- -- -- -- -- -- -- -- ";

    FrameWithNextFrame firstFameWithNextFrame = new FrameWithNextFrame(1,1);
    FrameWithNextFrame secondFameWithNextFrame = new FrameWithNextFrame(1,0);

    List<FrameWithNextFrame> framesWithNextFrames = List.of(firstFameWithNextFrame, secondFameWithNextFrame);
    when(this.frameScoreTokenizer.getFramesWithNextFrame(currentGame)).thenReturn(framesWithNextFrames);

    assertEquals(2, bowlingGame.getScoreWithFrames(currentGame));
  }
}

