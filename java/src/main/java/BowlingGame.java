public class BowlingGame {
  public int getScore(String input) {

    return (int) input.chars().filter(x -> x == '1').count();
  }
}
