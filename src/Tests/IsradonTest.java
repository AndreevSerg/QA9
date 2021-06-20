package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*public class IsradonTest {
    WebDriver driver;

    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.isradon.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test
    public void getTitle() throws InterruptedException {
        driver.findElements(By.className("col1")).size();
        driver.findElements(By.className("col1")).get(1).click();
        Thread.sleep(2000);
        System.out.println("Title: " + driver.getTitle());

        driver.findElements(By.className("col1 withsubs")).size();
        driver.findElements(By.className("col1 withsubs")).get(1).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.getTitle());

        driver.findElements(By.className("col1 withsubs")).size();
        driver.findElements(By.className("col1 withsubs")).get(2).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.getTitle());

        driver.findElements(By.className("col1")).size();
        driver.findElements(By.className("col1")).get(2).click();
        Thread.sleep(2000);
        System.out.println("Title: " + driver.getTitle());

        driver.findElements(By.className("col1 withsubs")).size();
        driver.findElements(By.className("col1 withsubs")).get(3).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.getTitle());

        driver.findElements(By.className("col1 withsubs")).size();
        driver.findElements(By.className("col1 withsubs")).get(4).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.getTitle());

        driver.findElements(By.className("col1 withsubs")).size();
        driver.findElements(By.className("col1 withsubs")).get(5).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.getTitle());


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
*/
public class IsradonTest {
    WebDriver driver;

    @BeforeMethod
    public void initTests() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.isradon.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

@Test
public void locatorsTest() throws InterruptedException {
        driver.findElement(By.className("col1")).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.findElement(By.tagName("h1")).getText());

        driver.findElement(By.className("withsubs")).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.findElement(By.tagName("h1")).getText());

        driver.findElement(By.linkText("Детский мир")).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.findElement(By.tagName("h1")).getText());

        driver.findElement(By.linkText("CARMANI")).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.findElement(By.tagName("h1")).getText());

        driver.findElement(By.linkText("Досуг")).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.findElement(By.tagName("h1")).getText());

        driver.findElement(By.linkText("Канцтовары")).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.findElement(By.tagName("h1")).getText());

        driver.findElement(By.linkText("Универмаг \"Исрадон\"")).click();
        Thread.sleep(3000);
        System.out.println("Title: " + driver.findElement(By.tagName("h1")).getText());
        }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}