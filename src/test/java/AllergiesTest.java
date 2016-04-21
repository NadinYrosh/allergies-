import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;


public class AllergiesTest {

  @Test
  public void checka_AllergiesScorer_(){
    Allergies testAllergies = new Allergies();
    Integer expected = 1;
    assertEquals(expected, testAllergies.allergiesScore("eggs"));
  }
  // @Test
  // public void checkCoinCombo_Dime_1(){
  //   CoinCombo testCoinCombo = new CoinCombo();
  //   Integer expected = 2;
  //   assertEquals(expected, testCoinCombo.comboOfCoins(21).get("dimes"));
  // }
  // @Test
  // public void checkCoinCombo_nickel_1(){
  //   CoinCombo testCoinCombo = new CoinCombo();
  //   Integer expected = 1;
  //   assertEquals(expected, testCoinCombo.comboOfCoins(15).get("nikels"));
  // }
  // @Test
  // public void checkCoinCombo_penny_1(){
  //   CoinCombo testCoinCombo = new CoinCombo();
  //   Integer expected = 1;
  //   assertEquals(expected, testCoinCombo.comboOfCoins(6).get("pennies"));
  // }
}
