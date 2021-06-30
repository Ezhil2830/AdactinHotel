package org.pojocucu;

import org.BaseCucu.HBaseCucumber;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPageHotelCucu extends HBaseCucumber{

	public BookingPageHotelCucu() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement txtfirstname;
	@FindBy(id="last_name")
	private WebElement txtlastname;
	@FindBy(id="address")
	private WebElement txtaddress;
	@FindBy(id="cc_num")
	private WebElement txtcreditcard;
	@FindBy(id="cc_type")
	private WebElement selectType;
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement selectMonth;
	@FindBy(id="cc_exp_year")
	private WebElement selectYear;
	@FindBy(id="cc_cvv")
	private WebElement txtcvv;
	@FindBy(id="book_now")
	private WebElement clkbook;
	@FindBy(id="order_no")
	private WebElement txtorder;
	public WebElement getTxtfirstname() {
		return txtfirstname;
	}
	public WebElement getTxtlastname() {
		return txtlastname;
	}
	public WebElement getTxtaddress() {
		return txtaddress;
	}
	public WebElement getTxtcreditcard() {
		return txtcreditcard;
	}
	public WebElement getSelectType() {
		return selectType;
	}
	public WebElement getSelectMonth() {
		return selectMonth;
	}
	public WebElement getSelectYear() {
		return selectYear;
	}
	public WebElement getTxtcvv() {
		return txtcvv;
	}
	public WebElement getClkbook() {
		return clkbook;
	}
	public WebElement getTxtorder() {
		return txtorder;
	}

	private void book(String value) throws InterruptedException {
		Thread.sleep(3000);
		filltextbox(getTxtfirstname(),value);
		filltextbox(getTxtlastname(),value);
		filltextbox(getTxtaddress(),value);
		filltextbox(getTxtcreditcard(),value);
		selectByValue(getSelectType(),value);
		selectByValue(getSelectMonth(),value);
		selectByValue(getSelectYear(),value);
		filltextbox(getTxtcvv(),value);
		btnclick(getClkbook());
		Thread.sleep(9000);
		getAttribute(getTxtorder());
	}
}
