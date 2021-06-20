package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SouvenirTests {
    WebDriver driver;

    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.souvenir.co.il/");
        Thread.sleep(3000);
    }

    @Test
    public void souvenirAppOpeningTest() throws InterruptedException {
     //   Thread.sleep(1000);
     //  driver.quit();

    }

    @Test
    public void registrationTest() throws InterruptedException {
        //-------find element by id ------
        driver.findElement(By.id("link_customer_signup")).click();
        Thread.sleep(2000);

        //--------define and initialize nameField element and fill in it ----
        WebElement nameField = driver.findElement(By.id("customer_full_name"));
        nameField.click();
        Thread.sleep(4000);
        nameField.sendKeys("Name");
        Thread.sleep(4000);

        WebElement mailField = driver.findElement(By.id("customer_email"));
        mailField.click();
        Thread.sleep(4000);
        mailField.sendKeys(("test@mail.com"));
        Thread.sleep(4000);

        WebElement phoneField = driver.findElement(By.id("customer_mobile_phone"));
        phoneField.click();
        Thread.sleep(4000);
        phoneField.sendKeys("0539862315");
        Thread.sleep(4000);

    }

    @Test
    public void locatorsTagNameTest() throws InterruptedException {
        //press on registration button
        driver.findElement(By.id("link_customer_signup")).click();
        Thread.sleep(2000);
        //receive elements list by tagName 'input'
        List<WebElement> inputElements = driver.findElements(By.tagName("input"));
        //write quantity of elements by tag 'input'
        System.out.println("Quantity of elements with tag 'input': "
                + driver.findElements(By.tagName("input")).size());
        //write aria-label attribute value for the first element with tag "aria-label"
        System.out.println("First element with tag:"
                + driver.findElement(By.tagName("input")).getAttribute("aria-label"));
        //list aria-label attribute values for all elements with tagName 'input'
        for(WebElement element: inputElements){
        System.out.println("aria-label value: " + element.getAttribute("aria-label"));
}
    }

    @Test
    public void locatorsClassNameTest() throws InterruptedException {
        //receive list of elements with className 'parent_category_title'
        List<WebElement> parentTitleList = driver.findElements(By.className("parent_category_title"));
            for(WebElement element:parentTitleList) {
                System.out.println("Text of element: " + element.getText());
            }
    }

    @Test
    public void locatorLinkedTextTest(){
        System.out.println("Rקgistration link text: "
                + driver.findElement(By.linkText("הרשמה")).getAttribute("href"));
        System.out.println("Gift card element: "
                + driver.findElement(By.linkText("Gift card")).getAttribute("href"));
    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
