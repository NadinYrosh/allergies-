import static spark.Spark.*;
import java.util.ArrayList;

public class Allergies {
  public Integer allergiesScore(ArrayList<String> input) { //- (String number)- its an input. Sting= words, Integer=numbers, *input* its a parameter--//
    Integer score = 0;
    if (input.contains("eggs")){
      score += 1;
    }
    if (input.contains("peanuts")) {
      score += 2;
    }
    if (input.contains("shellfish")){
      score += 4;
    }
    if (input.contains("strawberries")){
      score += 8;
    }
    if (input.contains("tomatoes")){
      score += 16;
    }
    if (input.contains("chocolate")){
      score += 32;
    }
    if (input.contains("pollen")){
      score += 64;
    }
    if (input.contains("cats")){
      score += 128;
    }
    return score;
  }
}
