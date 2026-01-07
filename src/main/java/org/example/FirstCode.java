package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstCode {
    public static void main(String[] args) {
        WebDriver dr = new ChromeDriver();
        dr.get("https://www.google.com");
    }
}
