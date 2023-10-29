package org.example;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxRule extends ExternalResource {
    private static WebDriver webDriver;

   public WebDriver getWebDriver() { return webDriver; }

    @Override
    protected void before() {
        System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\bin\\firefoxdriver-win64\\geckodriver.exe");
        webDriver = new FirefoxDriver();
    }

    @Override
    protected void after() {
        webDriver.quit();
    }
}


