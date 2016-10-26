package nyc.jle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // create an instance of a class which is to open a new firefox window browser

        //ChromeDriver driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();
        //enter url that we want to test in the new firefox broswer
        driver.get("http://gmail.com");
        //What is that we want to test
//        WebElement webElement = driver.findElement(By.xpath("//input[@name=Email"));
        WebElement webElement2 = driver.findElement(By.id("Email"));
        webElement2.sendKeys("abc123@gmail.com");
        WebElement button = driver.findElement(By.id("next"));
        button.click();

        int nanos =3;
        try {
            driver.manage().wait(500,nanos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
