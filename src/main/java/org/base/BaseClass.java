package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static void browserLaunch() {
	WebDriverManager.chromedriver();
	WebDriver driver=new ChromeDriver();

}
}
