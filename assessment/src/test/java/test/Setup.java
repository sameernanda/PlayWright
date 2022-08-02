package test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

/**
 * 
 * @author samirananda
 * Refers to Base class to initialize Browser/Page with different launch option and with option headless or browser mode. 
 */
public class Setup {
	static Browser browser = null ;
	public static Page setupSession(String launchType, String browserName) {
		LaunchOptions lo = new LaunchOptions();
		Playwright playwright = Playwright.create();
		if(launchType.equalsIgnoreCase("head")) {
			lo.headless= false;
			lo.slowMo = (double) 1000;
		}
		
		switch(browserName) {
		case "chromium":
			browser = playwright.chromium().launch(lo);
			break;
		case "firefox":
			browser = playwright.firefox().launch(lo);
			break;
		case "safari":
			browser = playwright.webkit().launch(lo);
			break;
		default:
			System.out.println("No Browser...");
		}
		
		Page page = browser.newPage();
		return page;
	}
	
	public static void terminateSession() {
		browser.close();
	}

}
