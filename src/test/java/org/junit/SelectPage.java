package org.junit;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends BaseClass {
	public SelectPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy (id="room_type")
	private WebElement roomtype;
	
	@FindBy (id="room_nos")
	private WebElement numofrooms;
	
	@FindBy (id="datepick_in")
	private WebElement indate;
	
	@FindBy (id="datepick_out")
	private WebElement outdate;
	
	@FindBy (id="adult_room")
	private WebElement adultroom;
	
	@FindBy (id="child_room")
	private WebElement childroom;
	
	@FindBy (id="Submit")
	private WebElement btnsubmit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumofrooms() {
		return numofrooms;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}
	
	
	
	
	
	
	}
	


