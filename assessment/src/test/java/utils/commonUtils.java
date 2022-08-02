package utils;

import org.testng.Assert;

import com.microsoft.playwright.Page;

public class commonUtils {
	public void click(Page page, String WebElement) {
		page.click(WebElement);
	}
	
	public void filldata(Page page, String WebElement, String data) {
		page.fill(WebElement, data);
	}
	
	public void pressKey(Page page, String WebElement, String key) {
		page.press(WebElement, key);
	}
	
	public void assertText(String actual, String expected) {
		Assert.assertEquals(actual.trim(), expected.trim());
	}
	
	public void assertWebText(Page page, String WebElement, String data) {
		Assert.assertEquals(page.locator(WebElement).textContent().trim(), data.trim());
	}
	
	public void clickCheckbox(Page page, String WebElement) {
		page.check(WebElement);
	}
	
	public void selectDropdown(Page page, String WebElement, String data) {
		page.selectOption(WebElement, data);
	}

}
