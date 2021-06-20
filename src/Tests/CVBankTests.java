package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CVBankTests {

    WebDriver driver;
    String pass = "CFDSGvcds!v43_4";

    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("http://cv-app-test.herokuapp.com/");
        Thread.sleep(2000);
    }
/*
    @Test
    public void pressRegistrationButton() throws InterruptedException {
       System.out.println("By class name 'btn btn-danger' element quantity: "
                + driver.findElements(By.className("btn-danger")).size());
        driver.findElements(By.className("btn-danger")).get(1).click();
        Thread.sleep(3000);

        WebElement nameField = driver.findElement(By.id("firstName"));
        nameField.click();
        Thread.sleep(2000);
        nameField.sendKeys("Ivan");
        Thread.sleep(2000);

        WebElement lastNameField = driver.findElement(By.id("lastName"));
        lastNameField.click();
        Thread.sleep(2000);
        lastNameField.sendKeys("Ivanov");
        Thread.sleep(2000);

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.click();
        Thread.sleep(2000);
        emailField.sendKeys("Ivanov_Ivan@mail.ru");
        Thread.sleep(2000);

        WebElement phoneField = driver.findElement(By.id("phone"));
        phoneField.click();
        Thread.sleep(2000);
        phoneField.sendKeys("+972538531495");
        Thread.sleep(2000);

        WebElement passField = driver.findElement(By.id("password"));
        passField.click();
        Thread.sleep(2000);
        passField.sendKeys(pass);
        Thread.sleep(2000);

        WebElement confirmPassField = driver.findElement(By.id("password-confirm"));
        confirmPassField.click();
        Thread.sleep(2000);
        confirmPassField.sendKeys(pass);
        Thread.sleep(2000);

    }
*/
    @Test
    public void pressRegistrationWithLocators() throws InterruptedException {
        System.out.println("By class name 'btn btn-danger' element quantity: "
                + driver.findElements(By.className("btn-danger")).size());
        driver.findElements(By.className("btn-danger")).get(1).click();
        Thread.sleep(2000);

        WebElement nameField = driver.findElement(By.cssSelector("#firstName"));
        nameField.click();
        Thread.sleep(2000);
        nameField.sendKeys("Ivan");
        Thread.sleep(2000);

        WebElement lastNameField = driver.findElement(By.cssSelector("#lastName"));
        lastNameField.click();
        Thread.sleep(2000);
        lastNameField.sendKeys("Ivanov");
        Thread.sleep(2000);

        WebElement emailField = driver.findElement(By.cssSelector("#email"));
        emailField.click();
        Thread.sleep(2000);
        emailField.sendKeys("Ivanov_Ivan@mail.ru");
        Thread.sleep(2000);

        WebElement phoneField = driver.findElement(By.xpath("//input[@id='phone']"));
        phoneField.click();
        Thread.sleep(2000);
        phoneField.sendKeys("+972538531495");
        Thread.sleep(2000);

        WebElement passField = driver.findElement(By.xpath("//input[@id='password']"));
        passField.click();
        Thread.sleep(2000);
        passField.sendKeys(pass);
        Thread.sleep(2000);

        WebElement confirmPassField = driver.findElement(By.cssSelector("#password-confirm"));
        confirmPassField.click();
        Thread.sleep(2000);
        confirmPassField.sendKeys(pass);
        Thread.sleep(2000);

    }

    @Test
    public void createButton() throws InterruptedException {
        driver.findElement(By.cssSelector("button.btn-lg")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[2]/h3[1]/i[1]")).click();
        Thread.sleep(2000);

        WebElement cvTitle = driver.findElement(By.cssSelector("input[name='title']"));
        cvTitle.click();
        cvTitle.sendKeys("Resume");
        Thread.sleep(2000);

        WebElement namefield = driver.findElement(By.cssSelector("input[name='first_name']"));
        namefield.click();
        namefield.sendKeys("Ivan");
        Thread.sleep(2000);

        WebElement lastNamefield = driver.findElement(By.cssSelector("input[name='last_name']"));
        lastNamefield.click();
        lastNamefield.sendKeys("Ivanov");
        Thread.sleep(2000);

        WebElement summary = driver.findElement(By.cssSelector("#summary"));
        summary.click();
        summary.sendKeys("I'm looking for a good job");
        Thread.sleep(2000);

        WebElement about = driver.findElement(By.cssSelector("#about"));
        about.click();
        about.sendKeys("I'm learning in tel-Ran");
        Thread.sleep(4000);

    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
