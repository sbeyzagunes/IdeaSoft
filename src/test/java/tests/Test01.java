package tests;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ideaSoftPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

import static utilities.Driver.driver;

public class Test01 {

    ideaSoftPage ideaSoftPage= new ideaSoftPage();
    @Test
    public void cases(){

        //https://testcase.myideasoft.com/ sitesi ziyaret edilir
       Driver.getDriver().get(ConfigReader.getProperty("ideaUrl"));
        //Arama kısmına "ürün" yazılarak arama yapılır.
        ideaSoftPage.aramaKutusu.sendKeys("ürün"+ Keys.ENTER);
        //Arama sonucunda listelenen ürünün detayına girilir ve ilgili üründen 5 adet sepete eklenir.
        ReusableMethods.bekle(2);
        Actions actions= new Actions(driver);
        actions.moveToElement(ideaSoftPage.ürün).dragAndDropBy(ideaSoftPage.ürün, 250,0).build().perform();
        ReusableMethods.bekle(2);
        actions.moveToElement(ideaSoftPage.bekle).perform();
        ideaSoftPage.bekle.click();
        Select select= new Select(ideaSoftPage.ürünAdeti);
        select.selectByIndex(4);
        ReusableMethods.bekle(2);
        ideaSoftPage.sepeteEkle.click();
        ReusableMethods.bekle(1);
        //"SEPETİNİZE EKLENMİŞTİR" yazısının görünmesi kontrol edilir.
        Assert.assertFalse(ideaSoftPage.sepeteEkle.isSelected());
        ///sepet sayfasına gidilir ve sepet içeriğinde ilgili üründen 5 adet olduğu kontrol edilir.
        ReusableMethods.bekle(2);
        ideaSoftPage.sepet.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(ideaSoftPage.ürünAdet.isDisplayed());










    }
}



