package StepsDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.*;


public class LoginDemoSteps {
	
	WebDriver driver=null;
	
	
	@Given("browser is open")
	public void browser_is_open() {
   
		System.out.println("Starting Browser open");
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDriver\\chromedriver.exe");
		
	 
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		
	}

	
	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://www.edubridgeindia.com/login");
	}
	
	
	
	@When("user enters username and password")
	public void user_enters_username_and_password() {
		
		
		
		driver.findElement(By.id("login_mobile")).sendKeys("9823054810");
		driver.findElement(By.id("login_password")).sendKeys("321diksha");
	    
	}
	
	
	@And("user clicks on login page")
	public void user_clicks_on_login_page() {
		
		driver.findElement(By.id("btnLoginSubmit")).click();
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		driver.findElement(By.xpath("//*[@id=\"coursesGridData\"]/div/div/div[3]/div/div/div[2]/div[2]/a")).click();
	    
	}




}
