package org.pojo;

import org.base.FunctionalLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends FunctionalLibrary {
	WebDriver driver;

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement dDnLocation;

	@FindBy(id = "hotels")
	private WebElement dDnHotel;

	@FindBy(id = "room_type")
	private WebElement dDnRoomType;

	@FindBy(id = "room_nos")
	private WebElement dDnNoOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckInData;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckOutData;

	@FindBy(id = "adult_room")
	private WebElement dDnAdultsperRoom;

	@FindBy(id = "child_room")
	private WebElement dDnChildrenPerRoom;

	@FindBy(id = "Submit")
	private WebElement dDnSearch;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotel() {
		return dDnHotel;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}

	public WebElement getTxtCheckInData() {
		return txtCheckInData;
	}

	public WebElement getTxtCheckOutData() {
		return txtCheckOutData;
	}

	public WebElement getdDnAdultsperRoom() {
		return dDnAdultsperRoom;
	}

	public WebElement getdDnChildrenPerRoom() {
		return dDnChildrenPerRoom;
	}

	public WebElement getdDnSearch() {
		return dDnSearch;
	}

	public void scerchHotel(String location, String hotel, String roomType, String noOfRooms, String checkInDate, String checkOutDate, String adultsperRoom, String childPerRoom) {
		
		selectByText(getdDnLocation(), location);
		selectByText(getdDnHotel(), hotel);
		selectByText(getdDnRoomType(), roomType);
		selectByText(getdDnNoOfRooms(), noOfRooms);
		type(getTxtCheckInData(), checkInDate);
		type(getTxtCheckOutData(), checkOutDate);
		selectByText(getdDnAdultsperRoom(), adultsperRoom);
		selectByText(getdDnChildrenPerRoom(), childPerRoom);
		click(getdDnSearch());
		

	}

}
