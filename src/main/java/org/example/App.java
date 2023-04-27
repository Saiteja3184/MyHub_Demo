package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.Scanner;



/**
 * Hello world!
 *
 */
public class App {

    @Test
    public void myHub() {

        System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        EdgeDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://office.technicalhub.io/login");
        WebElement username = driver.findElement(By.name("employee_id"));
        username.sendKeys("3967");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Thub@123");

        driver.findElement(By.id("login-button")).click();
        System.out.println("Successfully Logged In");

        /*driver.findElement(By.partialLinkText("Track")).click();

        driver.findElement(By.linkText("My Attendance")).click();*/
    }
}