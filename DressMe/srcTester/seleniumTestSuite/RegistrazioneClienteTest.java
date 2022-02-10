package seleniumTestSuite;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class RegistrazioneClienteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
		 js = (JavascriptExecutor) driver;
			vars = new HashMap<String, Object>();
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\franc\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void registrazioneCliente111() {
    driver.get("http://localhost:8080/DressMe/");
    driver.manage().window().setSize(new Dimension(1552, 832));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.linkText("Non sei ancora registrato?Registrati")).click();
    driver.findElement(By.id("Signin-submit")).click();
  }
  @Test
  public void registrazioneCliente112() {
    driver.get("http://localhost:8080/DressMe/");
    driver.manage().window().setSize(new Dimension(798, 816));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.cssSelector("b")).click();
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).sendKeys("Ciro");
    driver.findElement(By.id("cognome")).click();
    driver.findElement(By.id("cognome")).sendKeys("Mertens");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("ciromertens.com");
    driver.findElement(By.id("Signin-submit")).click();
  }
  @Test
  public void registrazioneCliente113() {
    driver.get("http://localhost:8080/DressMe/");
    driver.manage().window().setSize(new Dimension(798, 816));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.cssSelector("b")).click();
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).sendKeys("Ciro");
    driver.findElement(By.id("cognome")).click();
    driver.findElement(By.id("cognome")).sendKeys("Mertens");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("ciromertens@gmail.com");
    driver.findElement(By.id("indirizzo")).click();
    driver.findElement(By.id("indirizzo")).sendKeys("Via San Ciro 30");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("aaaa");
    driver.findElement(By.id("Signin-submit")).click();
    {
      List<WebElement> elements = driver.findElements(By.id("signin-message"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void registrazioneCliente114() {
    driver.get("http://localhost:8080/DressMe/");
    driver.manage().window().setSize(new Dimension(798, 816));
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.cssSelector("b")).click();
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).sendKeys("Ciro");
    driver.findElement(By.id("cognome")).click();
    driver.findElement(By.id("cognome")).sendKeys("Mertens");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
    driver.findElement(By.id("indirizzo")).click();
    driver.findElement(By.id("indirizzo")).sendKeys("Via San Ciro 30");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("ABCD1234");
    driver.findElement(By.id("Signin-submit")).click();
    {
      List<WebElement> elements = driver.findElements(By.id("signin-message"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void registrazioneCliente115() {
    driver.get("http://localhost:8080/DressMe/");
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.linkText("Non sei ancora registrato?Registrati")).click();
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).sendKeys("Ciro");
    driver.findElement(By.id("cognome")).click();
    driver.findElement(By.id("cognome")).sendKeys("Mertens");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("ciromertens@gmail.com");
    driver.findElement(By.id("indirizzo")).click();
    driver.findElement(By.id("indirizzo")).sendKeys("Via San Ciro 30");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("ABCD1234");
    driver.findElement(By.id("Signin-submit")).click();
    assertThat(driver.getTitle(), is("Account | DressMe Cloth collection"));
  }
}
