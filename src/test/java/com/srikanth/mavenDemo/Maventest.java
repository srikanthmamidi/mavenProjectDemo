package com.srikanth.mavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maventest {
@Test
	public void openBro() throws InterruptedException {
		System.out.println("browser opened");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("browser maximized opebed google.com");
		driver.get("https://www.google.com");
		System.out.println("url entered");
		Thread.sleep(3000);

	}
}
