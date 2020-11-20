package org.pojo;

import org.base.FunctionalLibrary;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerDetails extends FunctionalLibrary {

	public CustomerDetails() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement dDnFirstName;

	@FindBy(id = "last_name")
	private WebElement dDnLastname;

	@FindBy(id = "address")
	private WebElement dDnAddress;

	@FindBy(id = "cc_num")
	private WebElement dDnCardNo;

	@FindBy(id = "cc_type")
	private WebElement cardType;

	@FindBy(id = "cc_exp_month")
	private WebElement expMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expYear;

	@FindBy(id = "cc_cvv")
	private WebElement cvvNo;

	@FindBy(id = "book_now")
	private WebElement bookbtn;

	@FindBy(id = "order_no")
	private WebElement orderNo;

	public WebElement getdDnFirstName() {
		return dDnFirstName;
	}

	public WebElement getdDnLastname() {
		return dDnLastname;
	}

	public WebElement getdDnAddress() {
		return dDnAddress;
	}

	public WebElement getdDnCardNo() {
		return dDnCardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBookbtn() {
		return bookbtn;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}

	public void cusDeatials(String firstName, String lastName, String billingAddress, String creditcatdNo,
			String cardType, String cvv, String month, String year) {
		type(getdDnFirstName(), firstName);
		type(getdDnLastname(), lastName);
		type(getdDnAddress(), billingAddress);
		type(getdDnCardNo(), creditcatdNo);
		selectByText(getCardType(), cardType);
		type(getCvvNo(), cvv);
		selectByText(getExpMonth(), month);
		selectByText(getExpYear(), year);
		click(getBookbtn());
		getTxt(getOrderNo());

	}

}
