import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
        HashMap model = new HashMap();
        model.put("template", "templates/index.vtl" );
        return new ModelAndView(model, "templates/layout.vtl");
      }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
        HashMap model = new HashMap();
        model.put("template", "templates/results.vtl" );
        Allergies allergyList = new Allergies();
        ArrayList<String> resultArray = new ArrayList<String>();
        Set<String> resultSet = request.queryParams();
        for ( String str : resultSet ) {
          resultArray.add(str);
        }
        model.put("results", allergyList.allergiesScore(resultArray));
        return new ModelAndView(model, "templates/layout.vtl");
      }, new VelocityTemplateEngine());

  }
}
