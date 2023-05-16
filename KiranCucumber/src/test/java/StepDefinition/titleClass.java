package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class titleClass {

	WebDriver browserObject;
	WebElement googleLogo;
	
	@Given("I am on the google page {string}")
	public void i_am_on_the_google_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
op.addArguments("--remote-allow-origins=*");
        browserObject = new ChromeDriver(op);
        browserObject.get(string); 
	}

	@When("I search for Google Logo webelement")
	public void i_search_for_google_logo_webelement() {
	    // Write code here that turns the phrase above into concrete actions
		googleLogo = browserObject.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
        System.out.println("find and store the web element for the Google Logo");
	}
	
	
	@Then("I should get webelement is Displayed")
	public void i_should_get_webelement_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true, googleLogo.isDisplayed());
        System.out.println("Google logo is displayed – Assert passed");
	}
	
	
}
