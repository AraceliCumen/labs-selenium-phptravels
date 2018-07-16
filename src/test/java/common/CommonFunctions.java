package common;

import myDriver.CustomDriver;
import org.openqa.selenium.By;
import pageObjects.Header;

public class CommonFunctions {
    private CustomDriver customDriver;

    public CommonFunctions(CustomDriver driver){
        customDriver = driver;
    }

    public void browse_to_home(){
        customDriver.click(Header.navbar_Home);
    }

    public void browse_to_hotels(){
        customDriver.click(Header.navbar_Hotels);
        customDriver.waitForElementIsVisible(By.xpath("//*[@id='body-section']/div[5]/div/div[2]/form/button[1]"), 10);
    }

}
