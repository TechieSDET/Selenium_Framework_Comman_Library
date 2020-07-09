package base;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface Wrappers {

	/**
	 * click WebElement
	 * 
	 * @param element
	 */
	public void clickButton(WebElement element);

	/**
	 * Scroll to a WebElement and click another WebElement
	 * 
	 * @param scrollToElement
	 * @param clickElement
	 */
	public void clickButton(WebElement scrollToElement, WebElement clickElement);

	/***
	 * Click Element - Without scroll to the element
	 * 
	 * @param element Webelement
	 * @throws Exception
	 */
	void clickButtonWithOutScroll(WebElement element);

	/***
	 * enter text
	 * 
	 * @param element
	 */
	void enterText(WebElement element, String... textValue);

	/***
	 * get text of element
	 * 
	 * @param element - WebElement
	 * @return - String - !!!element.getText()
	 */
	String getText(WebElement element);

	/***
	 * Mouse over to the element Web
	 * 
	 * @param element
	 */
	void mouseOver(WebElement element);

	/***
	 * Quit all openned Tabs
	 */
	void quitBrowser();

	/***
	 * Close the current window
	 */
	void closeBrowser();

	/***
	 * Switch to Parent Window ---using windowsHandles
	 */
	void switchToParentWindow();

	/***
	 * Switch to Last Window ---- using windowsHandles
	 */
	void switchToLastWindow();

	/***
	 * Method isElementDisplayed is used to verify element isDiplayed
	 * 
	 * @param elements- List of Elements
	 * @return - true or false
	 */
	boolean isElementDisplayed(List<WebElement> elements);

	/*
	 * gets the title of the current page
	 */
	String getPageTitle();

	/****
	 * Dropdown Select Methods
	 */
	interface SelectDropDown {

		void selectByIndex(WebElement element, int index);

		void SelectByValue(WebElement element, String value);

		void SelectByVisibleText(WebElement element, String text);

		void clickButtonWithOutScroll(WebElement element);

		void clickButton(WebElement scrollToElement, WebElement clickElement);

		void clickButton(WebElement element);
	}

}
