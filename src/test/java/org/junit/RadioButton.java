package org.junit;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButton extends BaseClass {
	public  RadioButton(){
		PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(id="continue")
	private WebElement btncontinue;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
	

}

