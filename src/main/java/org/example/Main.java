package org.example;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {

            System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\bin\\geckodriver.exe");

            WebDriver webDriver = new FirefoxDriver();
            webDriver.get("https://qa-scooter.praktikum-services.ru/");




    }
}
