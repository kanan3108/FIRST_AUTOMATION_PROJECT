package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class firstprogram {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("real madrid");

        // Wait for suggestions to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']//li")));
        List<WebElement> e;
        e = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
        //System.out.println("List of suggestions: "+e.size());

        int i=0;
        int flag=0;
       for(WebElement find:e)
           {
           String s= find.getText();
           i++;
           if (s.contains("barcelona"))
               //if (true)
               {
            System.out.println("Suggestion is at : "+i);
            flag=1;
                break;}}
            if(flag==0)
            System.out.println("No such suggestion");
            Thread.sleep(3000);
        driver.close();
        System.out.print("Code ran successfully");

    }
}

