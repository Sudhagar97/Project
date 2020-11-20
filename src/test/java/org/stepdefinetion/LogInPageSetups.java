package org.stepdefinetion;

import org.base.FunctionalLibrary;
import org.pojo.SearchHotelPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInPageSetups extends FunctionalLibrary {
	
	SearchHotelPage searchHotel;

@Given("User on the Loginpage")
public void user_on_the_Loginpage() {
    
}

@When("User should enter {string} and {string}")
public void user_should_enter_and(String string, String string2) {
	
    
}

@When("User should using hotel {string},{string},{string},{string},{string},{string},{string},{string}")
public void user_should_using_hotel(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
    searchHotel=new SearchHotelPage();
    searchHotel.scerchHotel(string, string2, string3, string4, string5, string6, string7, string8);
}

@Then("select the hotel")
public void select_the_hotel() {
    
}

@When("Booking hotel hotel using {string},{string},{string},{string},{string},{string}")
public void booking_hotel_hotel_using(String string, String string2, String string3, String string4, String string5, String string6) {
    
}

@When("Get booking number")
public void get_booking_number() {
    
}


}
