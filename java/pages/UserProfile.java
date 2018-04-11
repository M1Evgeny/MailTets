package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webDriverInitializator.WebDriverInitializator;

public class UserProfile {
	private static final String USER_PROFILE = "//*[@id='PH_user-email']";
	private static final String LOGOUT = "//*[@id='PH_logoutLink']";
	private static final String WRIGTH_LETTER = "//*[@class='b-toolbar__item']/a[@data-name='compose']";

	WebDriver driver;
	WebDriverWait wait;

	public UserProfile() {
		driver = WebDriverInitializator.getDriver();
		wait = new WebDriverWait(driver, 10);
	}

	public WebElement getUserProfile() {
		return wait.until(ExpectedConditions.elementToBeClickable(By
				.xpath(USER_PROFILE)));
	}
	
	public WebElement getLogout(){
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(LOGOUT)));
	}
	
	public WebElement getWrigthLetter(){
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(WRIGTH_LETTER)));
	}

}
