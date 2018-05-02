package com.example.pages;

import com.example.pages.base.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://test:1234/login.html")
public class TestApplicationPage extends BasePage {

    @FindBy(xpath = "//*[@id='ui-id-1']")
    private WebElementFacade login_header;

    @FindBy(xpath = "//*[@id='view1']")
    private WebElementFacade login_username;

    @FindBy(xpath = "//*[@id='view2']")
    private WebElementFacade login_password;

    @FindBy(xpath="/html/body/div[3]/div[3]/div/button")
    private WebElementFacade login_button;

	public void enterUserCredentials(String username, String password) {
		enterText(login_username, username);
		enterText(login_password, password);
		login_button.click();
	}
}