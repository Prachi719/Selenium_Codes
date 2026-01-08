package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TiT_Login {
    public static void main(String[] args) {

        WebDriver dr = new ChromeDriver();
        dr.get("https://onlinefeestechnocrats.in/");
        dr.manage().window().maximize();
        dr.findElement(By.cssSelector("a[href='LoginStudent.aspx?type=F']")).click();
        dr.findElement(By.name("Login1$UserName")).sendKeys("0192AL221075");
        dr.findElement(By.name("Login1$Password")).sendKeys("11082005");
        dr.findElement(By.name("Login1$LoginButton")).click();

    }

}
