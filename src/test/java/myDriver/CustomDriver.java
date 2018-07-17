package myDriver;

import config.ChromeConfig;
import config.FirefoxConfig;
import config.HeadlessConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomDriver {
    private WebDriver driver;

    public CustomDriver(String driverType) throws RuntimeException{
        try{
            switch (driverType){
                case "Chrome":
                    driver = new ChromeConfig().driver;
                    break;
                case "Headless":
                    driver = new HeadlessConfig().driver;
                    break;
                case "Firefox":
                    driver = new FirefoxConfig().driver;
                    break;
            }
        }
        catch(Exception ex){
            throw ex;
        }
    }

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

    public void sendKey(By locator, Keys key) throws RuntimeException{
        try{
            driver.findElement(locator).sendKeys(key);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    public void quit(){
        driver.quit();
    }

    public boolean isElementDisplayed(By locator) throws RuntimeException{
        try{
            return driver.findElement(locator).isDisplayed();
        }
        catch(Exception ex){
            throw ex;
        }
    }

    public void waitForElementIsVisible(By locator, int timeOutInSeconds) throws RuntimeException{
        try{
            WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
        }
        catch (Exception ex){
            throw ex;
        }
    }

    public boolean elementContainsText(By locator, String text) throws RuntimeException{
        try{
            WebElement element = driver.findElement(locator);
            return element.getText().equalsIgnoreCase(text);
        }
        catch(Exception ex){
            throw ex;
        }
    }

    public boolean isTextInSource(String text) throws RuntimeException {
        try{
            return driver.getPageSource().contains(text);
        }
        catch (Exception ex){
            throw ex;
        }
    }

    public void initializePageFactory(Object page){
        PageFactory.initElements(driver, page);
    }
}
