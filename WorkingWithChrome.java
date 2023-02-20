// package seleniumScript;

// import org.openqa.selenium.chrome.ChromeDriver;

// public class WorkingWithChrome {
// ChromeDriver driver;
// String url="https://www.google.com/";
// public void invokeBrowser(){
// System.setProperty("webdriver.chrome.driver","chromedriver.exe");
// driver = new ChromeDriver();
// driver.manage().window().maximize();
// driver.get(url);
// }
// public void getTitle(){
// String titleofthepage=driver.getTitle();
// System.out.println("Title of the page:::::"+titleofthepage);
// }
// public void closeBrowser(){
// //driver.close();
// driver.quit();
// }
// public static void main(String[] args) {
// WorkingWithChrome wc=new WorkingWithChrome();
// wc.invokeBrowser();
// wc.getTitle();
// wc.closeBrowser();
// }
// }
// C:\\Users\\Dell\\Desktop\\selinium\\

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WorkingWithChrome {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("nanmol0406@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("helloworld");
        driver.findElement(By.id("u_0_2")).click();
        // check the id of the element by right click on the web page and
        // inspect the element or press F12 (or shift F12)
    }
}