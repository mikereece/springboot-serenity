package com.example.pages.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.PageObject;

public abstract class BasePage extends PageObject {

	public void Launch() {
		this.open();

		getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		getDriver().manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);

        resizeBrowser(getDriver());
        maximizeBrowser(getDriver());
	}

	public static void maximizeBrowser(WebDriver driver) {
		 driver.manage().window().maximize();
	}

	public static void resizeBrowser(WebDriver driver) {
		driver.manage().window().setSize(new Dimension(1920, 1080));
	}

	public static void enterText(WebElement inputField, String inputText) {
		inputField.click();
		inputField.clear();
		inputField.sendKeys(inputText);
	}
}