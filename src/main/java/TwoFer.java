public class TwoFer {

	public String getTwoFer(String name) {
		return name != null ? String.format("One for %1$s, %2$s", name, "one for me.") : "One for you, one for me.";
	}

}
