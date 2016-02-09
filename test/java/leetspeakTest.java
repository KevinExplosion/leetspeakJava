import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class leetspeakTest {

  @Test
  public void leetspeak_returnsAStringAsIsWhenNoLeetspeakIsPresent_wordDoesntChange() {
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("happy", testLeetSpeak.leetspeak("happy"));
  }

  @Test
  public void leetspeak_replacesEveryEInAStringWithA3_wordChanges() {
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("3l3phant", testLeetSpeak.leetspeak("elephant"));
  }

  @Test
  public void leetspeak_replacesEveryOInAStringWithA0_wordChanges() {
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("b00 b00", testLeetSpeak.leetspeak("boo boo"));
  }
}
