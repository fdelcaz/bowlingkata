public class BowlingGame {
  private static final int STRIKE_SCORE = 30;

  public int getScore(String input) {

//    char STRIKE = 'X';
    Character[] numericScores = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    int totalScore = 0;
    for(Character numericScore: numericScores){
      int numberOfOccurrences = (int) input.chars().filter(x -> x == numericScore).count();
      totalScore += numberOfOccurrences * Character.getNumericValue(numericScore);
    }

//    int totalStrikes = (int) input.chars().filter(x -> x == STRIKE).count();
//    totalScore += totalStrikes * STRIKE_SCORE;

    return totalScore;
  }
}
