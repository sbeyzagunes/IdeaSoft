package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ideaSoftPage {

    public ideaSoftPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//*[text()='SEPETE EKLE']")
    public WebElement ürün;

    @FindBy(xpath = "//*[text()='Ürün']")
    public WebElement bekle;

    @FindBy(xpath = "//select[@id='qty-input']")
    public WebElement ürünAdeti;

    @FindBy(xpath = "//*[text()='SEPETE EKLE']")
    public WebElement sepeteEkle;

    @FindBy(xpath = "//*[text()='Sepet']")
    public WebElement sepet;

    @FindBy(xpath = "//*[text()='5']")
    public WebElement ürünAdet;





}
