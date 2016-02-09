import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class LeetSpeakTest {

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
  public void leetspeak_replacesEveryoInAStringWithA0_wordChanges() {
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("b00 b00", testLeetSpeak.leetspeak("boo boo"));
  }
  @Test
  public void leetspeak_replacesEveryIInAStringWithA1_wordChanges() {
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("1 lik3 1k3", testLeetSpeak.leetspeak("I like Ike"));
  }

  @Test
  public void leetspeak_replacesEverySInAStringWithAZ_wordChanges() {
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("r0z3z ar3 r3d", testLeetSpeak.leetspeak("roses are red"));
  }

  @Test
  public void leetspeak_doesNotReplaceSWhenFirstLetter_wordChanges() {
    LeetSpeak testLeetSpeak = new LeetSpeak();
    assertEquals("suzi3 sunzhin3", testLeetSpeak.leetspeak("susie sunshine"));
  }
}
