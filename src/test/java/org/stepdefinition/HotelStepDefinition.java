package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.BaseCucu.HBaseCucumber;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojocucu.HotelLoginCucu;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelStepDefinition extends HBaseCucumber {
	 
	@Given("User is in adactinhotelapp login page")
	public void user_is_in_adactinhotelapp_login_page() {
		launchBrowser();
		launchurl("http://adactinhotelapp.com/index.php");
	}
		
	@When("User enters invalid {string} and {string}")
	public void user_enters_invalid_and(String username, String password) {
	  
		HotelLoginCucu pj=new HotelLoginCucu();
		filltextbox(pj.getTxtusername(),username);
		filltextbox(pj.getTxtpassword(),password);
		}
	
	@When("User enters invalid username and password")
	public void user_enters_invalid_username_and_password(DataTable d) {
	   List<Map<String, String>> list= d.asMaps();
	   
	   Map<String, String> map = list.get(2);
	    String username=map.get("username");
	    String password=map.get("password");
	    
	    
	    HotelLoginCucu pjc=new HotelLoginCucu();
		filltextbox(pjc.getTxtusername(),username);
		filltextbox(pjc.getTxtpassword(),password);
		
	    
	    
	}

	@When("click login button")
	public void click_login_button() throws InterruptedException {
		HotelLoginCucu pj1=new HotelLoginCucu();
		btnclick(pj1.getBtnlogin());
				Thread.sleep(3000);   
	}

	@Then("User must validate the results based on {string}")
	public void user_must_validate_the_results_based_on(String type) {
		
		if(type.equals("positive")) {
			
			HotelLoginCucu pj2=new HotelLoginCucu();
			urlAssertionForvalidLogin();}
			
			else if(type.equals("negative")) {
				HotelLoginCucu pj3=new HotelLoginCucu();
			assertionForInvalidLogin(pj3.getTextinvalid());	
		    
	}}
		
	@Then("User must be in invalid  page")
	public void user_must_be_in_invalid_page() {
		HotelLoginCucu pj3=new HotelLoginCucu();
		assertionForInvalidLogin(pj3.getTextinvalid());	 
	}

	@Then("User must be in invalid credentials page")
	public void user_must_be_in_invalid_credentials_page() throws InterruptedException {
		HotelLoginCucu pj4=new HotelLoginCucu();
		assertionForInvalidLogin(pj4.getTxtinvalid());	
	    Thread.sleep(3000);
	}

	
	}


