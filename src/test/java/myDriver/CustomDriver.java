package myDriver;

import config.ChromeConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomDriver {
    private WebDriver driver;

    public CustomDriver() throws RuntimeException{
        try{
            driver = new ChromeConfig().driver;
        }
        catch(Exception ex){
            throw ex;
        }
    }

    public void launchApplication(String url) throws RuntimeException{
        try{
            driver.get(url);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    public void click(By locator) throws RuntimeException{
        try{
            driver.findElement(locator).click();
        }
        catch (Exception ex){
            throw ex;
        }
    }

    public void writeText(By locator, String text) throws RuntimeException{
        try{
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    public void quit(){
        driver.quit();
    }
}
