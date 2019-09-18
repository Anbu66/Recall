package pro1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selenium\\pro1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		WebElement phone = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		phone.sendKeys("htc mobiles");
		
		WebElement des = driver.findElement(By.xpath("//input[@type='submit']"));
		des.click();
		
		/*WebElement date = driver.findElement(By.xpath("(//input[@class='db'])[3]"));
		date.sendKeys("18-Sep-2019");
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='search_btn']"));
		submit.click();*/
		
		List<WebElement> show = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		for (WebElement list : show) {
			System.out.println(list.getText());
		}
		
		int s = show.size();
		System.out.println("size="+s);
	}
	

}
