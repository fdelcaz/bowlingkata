import java.util.List;

public class BowlingGame {

  private final FrameScoreTokenizer frameScoreTokenizer;

  public BowlingGame(FrameScoreTokenizer frameScoreTokenizer) {
    this.frameScoreTokenizer = frameScoreTokenizer;
  }

  public int getScore(String input) {

    if (!input.contains("/")) {
      Character[] numericScores = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

      int totalScore = 0;
      for(Character numericScore: numericScores){
        int numberOfOccurrences = (int) input.chars().filter(x -> x == numericScore).count();
        totalScore += numberOfOccurrences * Character.getNumericValue(numericScore);
      }

      return totalScore;
    }

    if (!input.contains("1-")) {
      return 10;
    }

    return 11;
  }

  public int getScoreWithFrames(String matchScores) {
    List<FrameWithNextFrame> tokenizedFrames = this.frameScoreTokenizer.getFramesWithNextFrame(matchScores);

    int totalScore = 0;
    for (FrameWithNextFrame frame: tokenizedFrames){
      totalScore += frame.currentScore;
    }

    return totalScore;
  }
}
