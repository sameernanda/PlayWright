package test;

import java.nio.file.Paths;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;

import testdata.PageObject;
import testdata.UserInfo;
import utils.Constants;
import utils.commonUtils;

/**
 * 
 * @author samirananda
 * This class refers to all the assessment related tests to be run.
 */
public class Payback extends Setup{
	public Page page;
	public commonUtils utils = new commonUtils();
	public PageObject po = new PageObject();

	@BeforeTest
	@Parameters({"type","browser"})
	public void beforeTest(@Optional("headless") String LaunchType, String browser) {
		page = Setup.setupSession(LaunchType, browser);
	}
	
	@Test
	public void testApp() {
		page.navigate(Constants.URL);
		utils.click(page, po.cookieAccept);
		utils.assertText(page.title(),Constants.homePageTiltle);
		utils.click(page, po.register);
		utils.assertWebText(page, po.registerPageHeadingText, Constants.registerPageHeading);
		utils.clickCheckbox(page, po.registePageradioButton);

		while(!page.isVisible(po.burgerKingCardPicker)) {
			utils.click(page, po.slider);
		}
		utils.click(page, po.burgerKingCardPicker);
		
		utils.click(page, po.signUpButton);
		
		utils.click(page, po.furtherbutton);
		//Verify Email field validation
		utils.assertWebText(page, po.emailFieldError, Constants.emailFieldValidation);
		//Verify password field validation
		utils.assertWebText(page, po.emailFieldError, Constants.emailFieldValidation);
		
		utils.filldata(page, po.emailField, UserInfo.getEmail());
		utils.filldata(page, po.passwordField, UserInfo.getPassword());
		
		//Screenshot particular Element
		page.locator(po.emailField).screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("emailField.png")));
		
		utils.click(page, po.furtherbutton);
		utils.assertWebText(page, po.registerPageHeadingText, Constants.personalDataPageHeading);
		
		utils.click(page, po.oneStepButton);
		//Screenshot whole page
		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("errorPage.png")).setFullPage(true));
		verifyUIError();
		fillFormData();
		
		utils.click(page, po.oneStepButton);
	}
	
	@AfterTest
	public void afterTest() {
		Setup.terminateSession();
	}
	
	/**
	 * This method will verify all UI Error on the registration form
	 */
	public void verifyUIError() {
		utils.assertWebText(page, po.anredeFieldError, Constants.salutationFieldError);
		utils.assertWebText(page, po.vornameFieldError, Constants.firstNameFieldError);
		utils.assertWebText(page, po.nachnameFieldError, Constants.lastNameFieldError);
		utils.assertWebText(page, po.geburtsdatumFieldError, Constants.birthDayFieldError);
		utils.assertWebText(page, po.straßeFieldError, Constants.streetFieldError);
		utils.assertWebText(page, po.hausnummerFieldError, Constants.floorFieldError);
		utils.assertWebText(page, po.plzFieldError, Constants.zipCodeFieldError);
		utils.assertWebText(page, po.ortFieldError, Constants.cityFieldError);
	}
	
	/**
	 * This method will fill out all the details on the registration form
	 */
	public void fillFormData() {
		utils.selectDropdown(page, po.salutation, "2");
		utils.filldata(page, po.firstName, "Pay");
		utils.filldata(page, po.lastName, "Back");
		utils.click(page, po.calendar);
		utils.filldata(page, po.birthDayDate, "02");
		utils.filldata(page, po.birthDayMonth, "08");
		utils.filldata(page, po.birthDayYear, "2022");
		utils.filldata(page, po.street, "Street");
		utils.filldata(page, po.floor, "Floor");
		utils.filldata(page, po.zipCode, "1242");
		utils.filldata(page, po.city, "Munich");
	}

}
