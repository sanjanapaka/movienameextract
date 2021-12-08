package mypackage;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javastart1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		String[] names= {"Lady Bird(2017)","Mission: Impossible - Fallout(2018)","BlacKkKlansman(2018)","Get Out(2017)"};
		
		for(String k:names) {
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(k);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
			String rating= driver.findElement(By.xpath("//*[@id=\"kp-wp-tab-overview\"]/div[1]/div/div/div[2]/div/div[1]/div[1]/a[1]")).getText();
			String text = driver.findElement(By.xpath("//*[@id='kp-wp-tab-overview']/div[1]/div/div/div[2]/div/div[3]/div/div/div/span")).getText();
			String[] splitarray = rating.split("\n");
			rating = splitarray[0];
			System.out.println(text);
			System.out.println(rating);
		}
	
		
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(name);
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
		//String rating= driver.findElement(By.xpath("//*[@id=\"kp-wp-tab-overview\"]/div[1]/div/div/div[2]/div/div[1]/div[1]/a[1]")).getText();
		//String text = driver.findElement(By.xpath("//*[@id='kp-wp-tab-overview']/div[1]/div/div/div[2]/div/div[3]/div/div/div/span")).getText();
		//String[] splitarray = rating.split("\n");
		//rating = splitarray[0];
		//System.out.println(text);
		//System.out.println(rating);
	}
}
