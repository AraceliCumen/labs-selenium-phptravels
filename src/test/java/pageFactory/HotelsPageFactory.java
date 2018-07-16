package pageFactory;

import myDriver.CustomDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//PageFactory pattern
public class HotelsPageFactory {

    @FindBy(how=How.XPATH, using="//*[@id='s2id_autogen1']/a")
    private WebElement hotel_or_city_Caption;

    @FindBy(how=How.XPATH, using="//*[@id='select2-drop']/div/input")
    private WebElement hotel_or_city_Field;

    private By hotel_or_city_Result=By.xpath("//*[@id='select2-drop']/ul/li/ul/li");

    @FindBy(how=How.XPATH, using="//*[@id='dpd1']/div/input")
    private WebElement checkIn_Field;

    @FindBy(how=How.XPATH, using="//*[@id='dpd2']/div/input")
    private WebElement checkOut_Field;

    @FindBy(how=How.XPATH, using="//*[@id='body-section']/div[2]/div/form/div[5]/button")
    private WebElement search_Button;

    public HotelsPageFactory(CustomDriver driver){
        driver.initializePageFactory(this);
    }

    public void searchHotel(String hotelName, String checkInDate, String checkOutDate, CustomDriver driver) throws Exception{
        try{
            hotel_or_city_Caption.click();
            hotel_or_city_Field.sendKeys(hotelName);
            driver.waitForElementIsVisible(hotel_or_city_Result, 10);
            hotel_or_city_Field.sendKeys(Keys.ENTER);
            checkIn_Field.sendKeys(checkInDate);
            checkOut_Field.sendKeys(checkOutDate);
            search_Button.click();
        }
        catch(Exception ex){
            throw ex;
        }
    }
}
