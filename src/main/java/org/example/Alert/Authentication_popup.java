package org.example.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup {
    public static void main(String[] args) {
        WebDriver dr = new ChromeDriver();
        dr.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

    }
}
