package com.example.steps.base;


import com.example.model.User;
import com.example.model.Users;
import com.example.pages.TestApplicationPage;
import net.thucydides.core.annotations.Step;

public class BaseSteps {

    private TestApplicationPage testApplicationPage;

    @Step
	public void entersUserCredentials(String username, String password) {
        testApplicationPage.enterUserCredentials(username, password);
	}

    @Step
	public void entersUserCredentials(String user) {
        User pUser = Users.TEST_USER;
        testApplicationPage.enterUserCredentials(pUser.Username, pUser.Password);
	}

    @Step
    public void launchApplication() {
        testApplicationPage.Launch();
	}
}
