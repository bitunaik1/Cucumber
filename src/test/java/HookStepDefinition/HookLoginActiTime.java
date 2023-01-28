package HookStepDefinition;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HookLoginActiTime {
	WebDriver driver=null;
	@Before(order = 1)
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //It will wait for page to load
		driver.manage().window().maximize();
	}
	@Before(order = 2)
	public void secondBefore() {
		System.out.println("Second before");
	}
	@After(order = 1)
	public void secondAfter() {
		System.out.println("second after");
	}
	@BeforeStep
	public void beforeSteps() {
		System.out.println("------before steps------");
	}
	public void afterStep() {
		System.out.println("------after step-------");
	}
	@After(order =2)
	public void tearDown() {
		driver.close();
	}

	@Given("user is in login page")
	public void user_is_in_login_page() {
		driver.get("https://demo.actitime.com/login.do");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.writeUsernameAndPassword("admin", "manager");	
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
	}
}
