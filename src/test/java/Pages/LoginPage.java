package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

public LoginPage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}
@FindBy(id="username")
private WebElement userNameTB;

public WebElement getUserNameTB() {
	return userNameTB;
}
public void writeUsernameAndPassword(String username, String password) {
	getUserNameTB().sendKeys(username, Keys.TAB, password);
}
public void loginToActiTime() throws AWTException {
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}
