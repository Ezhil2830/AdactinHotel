package org.pojocucu;

import org.BaseCucu.HBaseCucumber;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelCucu extends HBaseCucumber {

	public SelectHotelCucu() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='radio']")
	private WebElement prsRadio;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement prscont;
	public WebElement getPrsRadio() {
		return prsRadio;
	}
	public WebElement getPrscont() {
		return prscont;
	}
	private void rbNextpg() throws InterruptedException {
		Thread.sleep(2000);
		btnclick(getPrsRadio());
		btnclick(getPrscont());
		
		
	}
	
	}

