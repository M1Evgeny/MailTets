package pages;

public class WrigthLetterSteps {
	private static final String EMAIL = "tathtp@mail.ru";
	private static final String TOPIC = "Test letter";

	public static void wrigthLetter(WrigthLetter page) {
		page.getTo().sendKeys(EMAIL);
		page.getTopic().sendKeys(TOPIC);
		
	}

}
