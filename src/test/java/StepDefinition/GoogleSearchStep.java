//package StepDefinition;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class GoogleSearchStep {
//	WebDriver driver=null;
//	@Given("browser is open")
//	public void browser_is_open() {
//		System.out.println("Inside step- browser is open");
//		
//		String projectPath=System.getProperty("user.dir");// location of the project
//		System.out.println("Project path is :"+projectPath);
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //It will wait for page to load
//		driver.manage().window().maximize();
//	}
//
//	@And("User is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("Inside step- User is on google search page");
//		driver.get("https://www.google.com/");
//	}
//                                         
//	@When("User enters a text in search box")
//	public void user_enters_a_text_in_search_box() {
//		System.out.println("Inside step- User enters a text in search box");
//		WebElement textBox = driver.findElement(By.name("q"));
//		textBox.sendKeys("TCS");
//	}
//
//	@And("hit enter")
//	public void hit_enter() throws AWTException {
//		System.out.println("Inside step- hit enter");
//		Robot r =new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
//	}
//
//	@Then("User is navigated to user result")
//	public void user_is_navigated_to_user_result() {
//		System.out.println("Inside step- User is navigated to user result");
//		driver.getPageSource().contains("Tata");
//		driver.quit();
////		WebElement tcs = driver.findElement(By.xpath("//div[@class='SPZz6b']/descendant::span[text()='Tata Consultancy Services']"));
////		if(tcs.isDisplayed()) {
////			System.out.println("Google search was successful");
////		}
////		else
////		{
////			System.out.println("Google search was not successful");
////		}
//	}
//}
