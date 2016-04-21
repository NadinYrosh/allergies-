import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import java.util.ArrayList;


public class AllergiesTest {

  @Test
  public void checka_AllergiesScorer_1(){
    Allergies testAllergies = new Allergies();
    ArrayList<String> testAllergyArray = new ArrayList();
    testAllergyArray.add("eggs");
    Integer expected = 1;
    assertEquals(expected, testAllergies.allergiesScore(testAllergyArray));
  }
  @Test
  public void checka_AllergiesScorer_2(){
    Allergies testAllergies = new Allergies();
    ArrayList<String> testAllergyArray = new ArrayList();
    testAllergyArray.add("peanuts");
    Integer expected = 2;
    assertEquals(expected, testAllergies.allergiesScore(testAllergyArray));
  }
  @Test
  public void checka_AllergiesScorer_4(){
    Allergies testAllergies = new Allergies();
    ArrayList<String> testAllergyArray = new ArrayList();
    testAllergyArray.add("shellfish");
    Integer expected = 4;
    assertEquals(expected, testAllergies.allergiesScore(testAllergyArray));
  }
  @Test
  public void checka_AllergiesScorer_8(){
    Allergies testAllergies = new Allergies();
    ArrayList<String> testAllergyArray = new ArrayList();
    testAllergyArray.add("strawberries");
    Integer expected = 8;
    assertEquals(expected, testAllergies.allergiesScore(testAllergyArray));
  }
  @Test
  public void checka_AllergiesScorer_16(){
    Allergies testAllergies = new Allergies();
    ArrayList<String> testAllergyArray = new ArrayList();
    testAllergyArray.add("tomatoes");
    Integer expected = 16;
    assertEquals(expected, testAllergies.allergiesScore(testAllergyArray));
  }
  @Test
  public void checka_AllergiesScorer_32(){
    Allergies testAllergies = new Allergies();
    ArrayList<String> testAllergyArray = new ArrayList();
    testAllergyArray.add("chocolate");
    Integer expected = 32;
    assertEquals(expected, testAllergies.allergiesScore(testAllergyArray));
  }
  @Test
  public void checka_AllergiesScorer_64(){
    Allergies testAllergies = new Allergies();
    ArrayList<String> testAllergyArray = new ArrayList();
    testAllergyArray.add("pollen");
    Integer expected = 64;
    assertEquals(expected, testAllergies.allergiesScore(testAllergyArray));
  }
  @Test
  public void checka_AllergiesScorer_128(){
    Allergies testAllergies = new Allergies();
    ArrayList<String> testAllergyArray = new ArrayList();
    testAllergyArray.add("cats");
    Integer expected = 128;
    assertEquals(expected, testAllergies.allergiesScore(testAllergyArray));
  }
}
