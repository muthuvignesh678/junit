package org.junit;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver,this);
		}
	@FindBy(id="username")
	private  WebElement txtUsername;
		
	@FindBy(name="password")
	private WebElement txtPassword;
		
	@FindBy(xpath="//input[@type='Submit']")
	private WebElement btnLogin;
	
	
	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	

	

}
