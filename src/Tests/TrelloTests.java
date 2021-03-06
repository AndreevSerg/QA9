package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TrelloTests {

    WebDriver driver;
    String password1 = "CFDSGvcds!v43_4";

    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://trello.com/");
        Thread.sleep(5000);
    }

    @Test
    public void negativeLogin() throws InterruptedException {

        driver.findElement(By.cssSelector(".text-primary")).click();
        Thread.sleep(3000);
        //fill in email field
        WebElement emailField = driver.findElement(By.id("user"));
        emailField.click();
        emailField.sendKeys("email");
        //fill in password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.click();
        passwordField.sendKeys("password");
        //press log in button
        driver.findElement(By.id("login")).click();
        Thread.sleep(3000);
        System.out.println("Error message: " + driver.findElements(By.cssSelector("p.error-message")).get(0).getText());

    }

    @Test
    public void loginTest() throws InterruptedException {

        driver.findElement(By.cssSelector("[class = 'btn btn-sm btn-link text-primary']")).click();
        Thread.sleep(2000);

        WebElement emailLogin = driver.findElement(By.xpath("//input[@id='user']"));
        emailLogin.click();
        emailLogin.sendKeys("andreev.s@gmail.com");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("#login")).click();
        Thread.sleep(3000);

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.click();
        password.sendKeys(password1);
        password.submit();
     //   driver.findElement(By.cssSelector("#login-submit")).click();
        Thread.sleep(5000);

        System.out.println("Name of the element is: " + driver.findElements(By.cssSelector("[class=\"_3Ow-m_R7rIILjd\"]")).get(0).getText());
        Thread.sleep(3000);
    }

    @Test
    public void positiveLogin() throws InterruptedException {
        driver.findElement(By.cssSelector(".text-primary")).click();
        Thread.sleep(3000);

        WebElement emailField = driver.findElement(By.id("user"));
        emailField.click();
        emailField.sendKeys("andreev.s@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.id("login")).click();
        Thread.sleep(3000);

        WebElement password = driver.findElement(By.cssSelector("#password"));
        password.click();
        password.sendKeys(password1);
        password.submit();
      //  driver.findElement(By.id("login-submit")).click();
        Thread.sleep(5000);

     //   System.out.println("Name of the element is: "
      //          + driver.findElement(By.xpath("//button[@data-test-id='header-boards-menu-button']/.")).getText());
        Thread.sleep(3000);

    }

    @AfterMethod()
        public void tearDown(){
            driver.close();
        }
    }