package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {

            //Create a driver instance using WebDriver interface.
            //Navigate to the url https://qabloglist.ccbp.tech/- use driver.navigate().to("URL") method
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.navigate().to("https://qaroutingtest.ccbp.tech");

            //Verify the current URL matches the expected URL.
            //Expected URL: https://qabloglist.ccbp.tech/
            //If both expected and current URLs are the same, then print "Navigated to Homepage"
            //Else, print "Navigation to Homepage Failed"
            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "https://qaroutingtest.ccbp.tech";

            if (expectedUrl.equals(actualUrl)) {
                System.out.println("Navigated to Homepage");
            } else {
                System.out.println("Navigation to Homepage Failed");
            }


            //Click on the "About" link

            driver.findElement(By.linkText("About")).click();

            //Verify if the current URL matches the expected URL.
            //Expected URL: https://qaroutingtest.ccbp.tech/about
            //If both expected and current URLs are the same, then print "Navigated to About page"
            //Else, print "Navigation to About page Failed"

            String  actualAboutUrl = driver.getCurrentUrl();
            System.out.println(actualAboutUrl);

            String expectedAboutUrl = "https://qaroutingtest.ccbp.tech/about";

            if(expectedAboutUrl.equals(actualAboutUrl)){
                System.out.println("Navigated to About page");
            }else{
                System.out.println("Navigation to About page Failed");
            }


            //Click on the "Contact" link

            driver.findElement(By.linkText("Contact")).click();

            //Verify if the current URL matches the expected URL.
            //Expected URL: https://qaroutingtest.ccbp.tech/contact
            //If both expected and current URLs are the same, then print "Navigated to Contact page"
            //Else, print "Navigation to Contact page Failed"
            String  actualContactUrl = driver.getCurrentUrl();
            System.out.println(actualContactUrl);

            String expectedContactUrl = "https://qaroutingtest.ccbp.tech/contact";

            if(expectedContactUrl.equals(actualContactUrl)){
                System.out.println("Navigated to Contact page");
            }else{
                System.out.println("Navigation to Contact page Failed");
            }


            //Navigate to the previous page.

            driver.navigate().back();

            //Verify if the current URL matches the expected URL.
            //Expected URL: https://qaroutingtest.ccbp.tech/about
            //If both expected and current URLs are the same, then print "Navigated to About page"
            //Else, print "Navigation to About page Failed"

            String  actualAboutUrl1 = driver.getCurrentUrl();


            String expectedAboutUrl1 = "https://qaroutingtest.ccbp.tech/about";

            if(expectedAboutUrl1.equals(actualAboutUrl1)){
                System.out.println("Navigated to About page");
            }else{
                System.out.println("Navigation to About page Failed");
            }

            //Navigate to the next page.

            driver.navigate().forward();

            //Verify if the current URL matches the expected URL.
            //
            //Expected URL: https://qaroutingtest.ccbp.tech/contact
            //If both expected and current URLs are the same, then print "Navigated to Contact page"
            //Else, print "Navigation to Contact page Failed"
            String  actualContactUrl1 = driver.getCurrentUrl();


            String expectedContactUrl1 = "https://qaroutingtest.ccbp.tech/contact";

            if(expectedContactUrl1.equals(actualContactUrl1)){
                System.out.println("Navigated to Contact page");
            }else{
                System.out.println("Navigation to Contact page Failed");
            }

            //Close the browser window.
            driver.close();
        } catch (Exception e) {
            System.out.println("Error Message of " + e);
        }
    }

}