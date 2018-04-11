package pages;

public class UserProfileSteps {

	public static String createUserProfileSteps(UserProfile profile) {
		return profile.getUserProfile().getText();
	}

	public static void wrigthUserLetter(UserProfile profile) {
		profile.getWrigthLetter().click();
	}

	public static void logoutFromUserProfile(UserProfile profile) {
		profile.getLogout().click();
	}

}

