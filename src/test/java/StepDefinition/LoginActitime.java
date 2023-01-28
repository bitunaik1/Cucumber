package StepDefinition;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginActitime {
	WebDriver driver;
	@Given("browser is open")
	public void browser_is_open() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //It will wait for page to load
		driver.manage().window().maximize();
	}

	@And("user is in login page")
	public void user_is_in_login_page() {
	    driver.get("https://demo.actitime.com/login.do");
	}
	
	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.writeUsernameAndPassword(username, password);	
	}

	@And("click enter")
	public void click_enter() throws AWTException {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginToActiTime();
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
	if( driver.getPageSource().contains("actiTIME")) {
		System.out.println("Success");
	}
	driver.close();
	}
}