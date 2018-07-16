import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTesting {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-shopall")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Speakers')]")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		driver.findElement(By.xpath("//div[@class='a-section acs_tile acs_tile--3 acs_tile__content']//img[@class='acs_tile__image']")).click();
		driver.findElement(By.xpath("//a[@title='Portronics POR-871 SoundDrum Bluetooth 4.2 Stereo Speaker (Black)']//img[@class='aok-align-center']")).click();
		
//		String handle=driver.getWindowHandle();
//		driver.switchTo().window(handle)
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		driver.findElement(By.className("a-button-stack")).click();
	}

}
