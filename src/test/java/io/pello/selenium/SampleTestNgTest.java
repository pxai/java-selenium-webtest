package io.pello.selenium;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.pello.selenium.pages.HomePage;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;

  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);
  }

  @Test
  public void shouldHaveLoginForm () {
    driver.get(baseUrl);
    Assert.assertTrue("loginData".equals(homepage.form.getAttribute("name")));
  }
}
