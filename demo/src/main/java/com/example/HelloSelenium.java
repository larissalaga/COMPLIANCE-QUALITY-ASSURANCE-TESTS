import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

package com.example;

public class HelloSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium.dev/");
        Thread.sleep(10000);
        driver.quit();
    }
}
