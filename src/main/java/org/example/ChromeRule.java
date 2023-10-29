package org.example;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeRule extends ExternalResource  {
    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    @Override
    protected void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver-win64\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @Override
    protected void after() {
        webDriver.quit();
    }
}



