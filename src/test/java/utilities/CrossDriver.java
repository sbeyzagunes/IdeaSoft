package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossDriver {
    private CrossDriver(){

    }


    static WebDriver driver;
    public static WebDriver getDriver(String browser){

        browser= browser==null ? ConfigReader.getProperty("browser"):browser;

        if(driver==null) {


            switch (browser){
                case "chrome" :

                    driver = new ChromeDriver();
                    break;
                case "firefox":

                    driver=new FirefoxDriver();
                    break;
                case "safari" :

                    driver=new SafariDriver();
                    break;

                default:

                    driver = new ChromeDriver();

            }
        }

        return driver;
    }

    public static void closeDriver(){
        if (driver!=null){
            driver.close();
            driver=null;
        }

    }
}
