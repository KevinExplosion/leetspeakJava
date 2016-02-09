import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class LeetSpeak {
  public static void main(String[] args) {}

  public static String leetspeak(String sentence) {
    sentence = sentence.replace('e', '3');
    sentence = sentence.replace('o', '0');
    sentence = sentence.replace('I', '1');
    sentence = sentence.replace('s', 'z');
    String[] words = sentence.split("\\s+");
    for (int i = 0; i < words.length; i++) {
      if (words[i].startsWith("z")) {
        words[i] = words[i].replaceFirst("z", "s");
      }
    }
      String joined = String.join(" ", words);
      return joined;
    }
}
