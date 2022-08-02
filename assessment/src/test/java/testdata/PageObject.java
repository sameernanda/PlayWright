package testdata;

public class PageObject {
	public String cookieAccept = "//button[@id='onetrust-accept-btn-handler']";
	public String register = "//div[contains(text(),'Anmelden')]";
	public String registerPageHeadingText = "//h3[contains(text(),'Jetzt mit PAYBACK starten')]";
	public String registePageradioButton = "//label[contains(text(),'Noch keine PAYBACK Karte? Neue Karte auswählen.')]";
	public String slider =".pb-slider__arrow-right";
	public String burgerKingCardPicker ="//div[@class='swiper-slide pb-card-picker__cards swiper-slide-active']//img[@alt='BURGER KING®']";
	public String signUpButton =".pb-sign-up-block_edited .pb-sign-up__button";
	public String emailField ="//input[@id='email']";
	public String passwordField ="//input[@id='pin']";
	public String furtherbutton ="//div[@data-block-type='authentication']//span[contains(text(),'Weiter')]";
	public String emailFieldError ="//label[@for='email']//../..//div[@class='pb-form-field__error-msg pb-form-field__error-msg_hidden']";
	public String passwordFieldError ="//label[@for='pin']//../..//div[@class='pb-form-field__error-msg pb-form-field__error-msg_hidden']";
	public String personalDataPageHeadingText = "//h3[contains(text(),'Jetzt mit PAYBACK starten')]";
	public String oneStepButton ="text = Nur noch ein Schritt";
	public String anredeFieldError ="//select[@id='salutation']//../..//div[@class='pb-form-field__error-msg pb-form-field__error-msg_hidden']";
	public String vornameFieldError ="//input[@id='firstName']//../..//div[@class='pb-form-field__error-msg pb-form-field__error-msg_hidden']";
	public String nachnameFieldError ="//input[@id='lastName']//../..//div[@class='pb-form-field__error-msg pb-form-field__error-msg_hidden']";
	public String geburtsdatumFieldError ="//input[@name='birthday']//../..//div[@class='pb-form-field__error-msg pb-form-field__error-msg_hidden']";
	public String straßeFieldError ="//input[@id='street']//../..//div[@class='pb-form-field__error-msg pb-form-field__error-msg_hidden']";
	public String hausnummerFieldError ="//input[@id='floor']//../..//div[@class='pb-form-field__error-msg pb-form-field__error-msg_hidden']";
	public String plzFieldError ="//input[@id='zipCode']//../..//div[@class='pb-form-field__error-msg pb-form-field__error-msg_hidden']";
	public String ortFieldError ="//input[@id='city']//../..//div[@class='pb-form-field__error-msg pb-form-field__error-msg_hidden']";
	public String salutation ="select[name='salutation']";
	public String firstName ="//input[@id='firstName']";
	public String lastName ="//input[@id='lastName']";
	public String calendar ="//input[@placeholder='TT/MM/JJJJ']";
	public String birthDayDate =".js__input-dob-day";
	public String birthDayMonth =".js__input-dob-month";
	public String birthDayYear =".js__input-dob-year";
	public String street ="//input[@id='street']";
	public String floor ="//input[@id='floor']";
	public String zipCode ="//input[@id='zipCode']";
	public String city ="//input[@id='city']";
}
