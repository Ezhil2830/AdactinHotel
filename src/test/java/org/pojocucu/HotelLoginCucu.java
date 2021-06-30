package org.pojocucu;

import org.BaseCucu.HBaseCucumber;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HotelLoginCucu extends HBaseCucumber {
	
	public HotelLoginCucu() {
		
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtusername;
	@FindBy(id="password")
	private WebElement txtpassword;
	@FindBy(id="login")
	private WebElement btnlogin;
	@FindBy(id="username_span")
	private WebElement txtinvalid;
	@FindBy(xpath="//div[@class='auth_error']")
	private WebElement Textinvalid;
	
		public WebElement getTextinvalid() {
		return Textinvalid;
	}
	public WebElement getTxtinvalid() {
		return txtinvalid;
	}
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	private void hlpage(String username,String password) {
		filltextbox(getTxtusername(),username);
		filltextbox(getTxtpassword(),password);
		btnclick(getBtnlogin());
		
		
	}


		
	}


