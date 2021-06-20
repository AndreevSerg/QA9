package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	System.out.println("Hello world");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //-------delay------
        Thread.sleep(2000);
        System.out.println("Title: "+driver.getTitle());
//------go to by url-link
        driver.get("https://www.souvenir.co.il/");
        Thread.sleep(2000);
        //-----change window size---
        Dimension targetSize = new Dimension(400,600);
        driver.manage().window().setSize(targetSize);
        System.out.println("Title: "+driver.getTitle());

        driver.navigate().back();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println("Title: "+driver.getTitle());

        driver.get("https://www.ukr.net/");
        Thread.sleep(2000);
        System.out.println("Title: "+driver.getTitle());

        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("Title: "+driver.getTitle());

        driver.navigate().forward();
        Thread.sleep(2000);
        System.out.println("Title: "+driver.getTitle());

  //      driver.navigate().back();

        driver.get("https://www.souvenir.co.il/");
        //-------find element by id ------
       driver.findElement(By.id("link_customer_signup")).click();
        Thread.sleep(2000);

        //--------define and initialize nameField element and fill in it ----
        WebElement nameField = driver.findElement(By.id("customer_full_name"));
        nameField.click();
        nameField.sendKeys("Name");
        Thread.sleep(4000);

        driver.quit();
    }
}
