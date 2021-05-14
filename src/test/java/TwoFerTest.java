import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TwoFerTest {
	@Test
	public void testThatTwoFerReturnsCorrectStringNoName() {
		assertEquals("One for you, one for me.", new TwoFer().getTwoFer());
	}

}
