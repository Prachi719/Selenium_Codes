package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstCode {
    public static void main(String[] args) {
        WebDriver dr = new ChromeDriver();
        dr.get("https://www.instagram.com");
        dr.navigate().to("https://google.com");
        dr.navigate().back();
        dr.navigate().refresh();
    }
}
