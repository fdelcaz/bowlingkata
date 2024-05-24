public class BowlingGame {
  public int getScore(String input) {
    int numberOfOnes = (int) input.chars().filter(x -> x == '1').count();
    int numberOfTwos = (int) input.chars().filter(x -> x == '2').count();

    return numberOfOnes + numberOfTwos * 2;
  }
}
