package org.stepdefinition;

import org.BaseCucu.HBaseCucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pojocucu.BookingPageHotelCucu;
import org.pojocucu.HotelLoginCucu;
import org.pojocucu.SearchHotelCucu;
import org.pojocucu.SelectHotelCucu;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepD extends HBaseCucumber {
	
	@When("user enter valid {string} and {string}.")
	public void user_enter_valid_and(String user, String pass) {
	  		HotelLoginCucu pjc=new HotelLoginCucu();
	  filltextbox(pjc.getTxtusername(),user);
	  filltextbox(pjc.getTxtpassword(),pass);
	  
	  
	}

@When("user click login button.")
public void user_click_login_button() throws InterruptedException {
	HotelLoginCucu pj1=new HotelLoginCucu();
	btnclick(pj1.getBtnlogin());
			Thread.sleep(3000);  
}

@When("user select and enters location,hotel,room type,number of rooms,{string},{string},adults per room,children per room.")
public void user_select_and_enters_location_hotel_room_type_number_of_rooms_adults_per_room_children_per_room(String checkin, String checkout) {
	SearchHotelCucu pjs=new SearchHotelCucu();
	selectByValue(pjs.getClkLocation(),"Sydney");
	selectByValue(pjs.getClkHotel(),"Hotel Creek");
	selectByValue(pjs.getClkRoom(),"Double");
	selectByValue(pjs.getClkRno(),"2");
	selectByValue(pjs.getAdultRoom(),"1");
	selectByValue(pjs.getChildRoom(),"0");
	
}



@When("user click search button.")
public void user_click_search_button() {
	 SearchHotelCucu search1=new SearchHotelCucu();
	    btnclick(search1.getBtnSearch());
}

@When("user click the radio button")
public void user_click_the_radio_button() {
	SelectHotelCucu sh=new SelectHotelCucu();
	btnclick(sh.getPrsRadio());
	
	
	
}
@When("user click continue button.")
public void user_click_continue_button() {
	SelectHotelCucu sh=new SelectHotelCucu();
	btnclick(sh.getPrscont());
}

@When("user book the hotel by entering  the details {string},{string},{string},{string},{string},creditcardtype,month,year")
public void user_book_the_hotel_by_entering_the_details_creditcardtype_month_year(String firstname, String lastname, String address, String creditno, String cvvno) {
	BookingPageHotelCucu bp=new BookingPageHotelCucu();
	selectByValue(bp.getSelectType(),"VISA");
	selectByValue(bp.getSelectMonth(),"5");
	selectByValue(bp.getSelectYear(),"2022");
	filltextbox(bp.getTxtfirstname(),firstname);
	filltextbox(bp.getTxtlastname(),lastname);
	filltextbox(bp.getTxtaddress(),address);
	filltextbox(bp.getTxtcreditcard(),creditno);
	filltextbox(bp.getTxtcvv(),cvvno);
	
}

@When("user click book now button")
public void user_click_book_now_button() throws InterruptedException {
	BookingPageHotelCucu bp=new BookingPageHotelCucu();
	btnclick(bp.getClkbook());
	Thread.sleep(3000);
}

@Then("user will get order id")
public void user_will_get_order_id() throws InterruptedException {
	BookingPageHotelCucu bp=new BookingPageHotelCucu();
	Thread.sleep(9000);
    System.out.println(getAttribute(bp.getTxtorder()));
}



@Then("user must be in booking hotel page.")
public void user_must_be_in_booking_hotel_page() {
    System.out.println("user is in booking page after clicking continue in select page");
}
@Then("user must be in select page")
public void user_must_be_in_select_page() {
   System.out.println("user in select page");
}


}
