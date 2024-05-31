package com.example.LoginFBAutomation;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import java.io.File;

public class LoginNegativeemail {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  JavascriptExecutor js;
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testLoginNegativeemail() throws Exception {
    driver.get("https://web.facebook.com/");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("kusuma.arum12@gmail.com");
    driver.findElement(By.id("pass")).click();
    driver.findElement(By.id("pass")).clear();
    driver.findElement(By.id("pass")).sendKeys("negrigingseng");
    driver.findElement(By.id("u_0_4_Rq")).click();
    driver.findElement(By.id("u_0_5_Ba")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Menu Facebook'])[1]/preceding::*[name()='svg'][1]")).click();
    driver.findElement(By.cssSelector("div.x6s0dn4.x1q0q8m5.x1qhh985.xu3j5b3.xcfux6l.x14yjl9h.xudhj91.x18nykt9.xww2gxu.x26u7qi.xm0m39n.x13fuv20.x972fbf.x9f619.x78zum5.xdt5ytf.x1iyjqo2.xs83m0k.xl56j7k.xat24cr.x11i5rnm.x1mh8g0r.xdj266r.x2lwn1j.xeuugli.x6ikm8r.x10wlt62.x18d9i69.x4uap5.xkhd6sd.xexx8yu.x1n2onr6.x1ja2u2z > svg.x19dipnz.x1lliihq.x1tzjh5l.x1k90msu.x2h7rmj.x1qfuztq > g > path")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
