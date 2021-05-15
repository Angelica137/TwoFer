import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Before;

public class TwoFerTest {

	private TwoFer twofer;

	@Before
	public void setup() {
		twofer = new TwoFer();
	}

	@Test
	public void testThatTwoFerReturnsCorrectStringNoName() {
		String input = null;
		String expected = "One for you, one for me.";

		assertEquals(expected, twofer.getTwoFer(input));
	}

	public void testThatTwoFerReturnsCorrectStringWithName() {
		assertEquals("One for Anna, for me me.", new TwoFer().getTwoFer("Anna"));
	}

}
