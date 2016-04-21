import static spark.Spark.*;
import java.util.ArrayList;

public class Allergies {
  public Integer allergiesScore(ArrayList<String> input) { //- (String number)- its an input. Sting= words, Integer=numbers, *input* its a parameter--//
    Integer score = 0;
    if (input.contains("eggs")){
      score += 1;
    } else if (input.contains("peanuts")) {
      score += 2;
    } else if (input.contains("shellfish")){
      score += 4;
    } else if (input.contains("strawberries")){
      score += 8;
    } else if (input.contains("tomatoes")){
      score += 16;
    } else if (input.contains("chocolate")){
      score += 32;
    } else if (input.contains("pollen")){
      score += 64;
    } else if (input.contains("cats")){
      score += 128;
    }
    return score;
  }
}
