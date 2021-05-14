import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class TwoFerTest {
	@Test
	public void testThatTwoFerReturnsCorrectStringNoName() {
		assertArrayEquals("One for you, one for me.", new TwoFer().getTwoFer());
	}

}
