package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SingTest {
    @Test
    public void testFazerLoginNoTaskit () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\renato\\driver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.get("http://www.juliodelima.com.br/taskit");

        navegador.findElement(By.linkText("Sign in")).click();

        navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys("testelorena");
        navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys("1234567");

        navegador.findElement(By.linkText("SIGN IN")).click();

        String saudacao = navegador .findElement(By.className("me")).getText();

        assertEquals("Hi, Lorena", saudacao);
    }
}
