package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.utility.BaseClass;
import org.utility.LoginPojoFacebook1;

import io.cucumber.java.en.*;

public class ForgotStepDefinition extends BaseClass{
	@Given("user should lauch the chrome browser and launch the facebook url")
	public void userShouldLauchTheChromeBrowserAndLaunchTheFacebookUrl() {

	}

	@Given("user should pass the mobile number under find your account type")
	public void userShouldPassTheMobileNumberUnderFindYourAccountType() throws InterruptedException {
		//forgot password button click
		LoginPojoFacebook1 l = new LoginPojoFacebook1();
		btnclick(l.getForgotpass());
		//mobile number under find your account type
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("123456789");
		Thread.sleep(2000);
	}

	@Given("user should click search button")
	public void userShouldClickSearchButton() throws InterruptedException {
		LoginPojoFacebook1 l = new LoginPojoFacebook1();
		btnclick(l.getSearchbutton());
		Thread.sleep(2000);
	}

	@Then("user should navigate password recover page")
	public void userShouldNavigatePasswordRecoverPage() {
		String currenturl= driver.getCurrentUrl();
		System.out.println(currenturl);
		Assert.assertTrue("verifying the invalid credential page", currenturl.contains("recover"));
		System.out.println("user should navigate password recover page");
	}
}
