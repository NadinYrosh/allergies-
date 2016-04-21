import static spark.Spark.*;
import java.util.HashMap;

public class Allergies {
  public Integer allergiesScore(String input) { //- (String number)- its an input. Sting= words, Integer=numbers, *input* its a parameter--//
    Integer score = 0;
    if (input.equals("eggs")){
      score += 1;
    }
    return score;
  }
}
