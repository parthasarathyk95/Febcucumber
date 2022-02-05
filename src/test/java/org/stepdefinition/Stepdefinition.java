package org.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.utility.BaseClass;
import org.utility.LoginPojoFacebook1;

import io.cucumber.java.en.*;


public class Stepdefinition extends BaseClass{
	@Given("user need to be in login page")
	public void user_need_to_be_in_login_page() {

	}

	@When("user should enter invalid username and invalid password")
	public void user_should_enter_invalid_username_and_invalid_password() throws IOException {
		LoginPojoFacebook1 l = new LoginPojoFacebook1();
		
		fillTextbox(l.getTxtUser(), readExcel(0, 1));
		
		fillTextbox(l.getTxtPass(), readExcel(1, 1));
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() throws InterruptedException {
		
		LoginPojoFacebook1 l = new LoginPojoFacebook1();
		btnclick(l.getLoginbtn());
		Thread.sleep(2000);
	}

	@Then("user will navigate to invalid credential page")
	public void user_will_navigate_to_invalid_credential_page() throws InterruptedException {
		String currenturl= driver.getCurrentUrl();
		System.out.println(currenturl);
		Assert.assertTrue("verifying the invalid credential page", currenturl.contains("privacy"));
		System.out.println("invalid username and invalid password");
	}
	
	@When("user should enter valid username and invalid password")
	public void user_should_enter_valid_username_and_invalid_password() throws IOException {
		LoginPojoFacebook1 l = new LoginPojoFacebook1();
		
		fillTextbox(l.getTxtUser(), readExcel(0, 1));
		
		fillTextbox(l.getTxtPass(), readExcel(1, 1));
	}
	@Then("user will navigate to Invalid credential page")
	public void userWillNavigateToInvalidCredentialPage() {
		String currenturl= driver.getCurrentUrl();
		System.out.println(currenturl);
		Assert.assertTrue("verifying the invalid credential page", currenturl.contains("privacy"));
		System.out.println("valid username and invalid password");
		
	}

	@When("user should enter valid {string} username and {string} invalid password")
	public void userShouldEnterValidUsernameAndInvalidPassword(String user, String pass) {
		LoginPojoFacebook1 l = new LoginPojoFacebook1();
		
		fillTextbox(l.getTxtUser(), user);
		
		fillTextbox(l.getTxtPass(), pass);
	}
	
	@When("user should enter invalid Username")
	public void userShouldEnterInvalidUsername(io.cucumber.datatable.DataTable d) {
		LoginPojoFacebook1 l = new LoginPojoFacebook1();
		// Without header
		fillTextbox(l.getTxtUser(), d.asList().get(0));
	}

	@When("user should enter invalid Password")
	public void userShouldEnterInvalidPassword(io.cucumber.datatable.DataTable d) {
		LoginPojoFacebook1 l = new LoginPojoFacebook1();
		fillTextbox(l.getTxtPass(), d.asLists().get(1).get(2));
	} 
}
