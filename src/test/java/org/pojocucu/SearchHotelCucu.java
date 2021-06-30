package org.pojocucu;

import org.BaseCucu.HBaseCucumber;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelCucu extends HBaseCucumber {

	public SearchHotelCucu() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement clkLocation;
	@FindBy(id="hotels")
	private WebElement clkHotel;
	@FindBy(id="room_type")
	private WebElement clkRoom;
	@FindBy(id="room_nos")
	private WebElement clkRno;
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	@FindBy(id="datepick_out")
	private WebElement checkOut;
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	@FindBy(id="child_room")
	private WebElement childRoom;
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement btnSearch;
	public WebElement getClkLocation() {
		return clkLocation;
	}
	public WebElement getClkHotel() {
		return clkHotel;
	}
	public WebElement getClkRoom() {
		return clkRoom;
	}
	public WebElement getClkRno() {
		return clkRno;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	private void regHotel(String value) {
		selectByValue(getClkLocation(),value);
		selectByValue(getClkHotel(),value);
		selectByValue(getClkRoom(),value);
		selectByValue(getClkRno(),value);
		filltextbox(getCheckIn(),value);
		filltextbox(getCheckOut(),value);
		selectByValue(getAdultRoom(),value);
		selectByValue(getChildRoom(),value);
		btnclick(getBtnSearch());
		
	}
	
		

	}

