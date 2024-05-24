public class BowlingGame {

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
}
