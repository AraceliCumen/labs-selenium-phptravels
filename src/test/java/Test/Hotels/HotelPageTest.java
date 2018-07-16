package Test.Hotels;


import common.CommonFunctions;
import myDriver.CustomDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pageFactory.HotelsPageFactory;
import util.UtilDate;

public class HotelPageTest {
    private CustomDriver customDriver;
    private CommonFunctions commonFunctions;

    @BeforeEach
    public void BeforeEach()
    {
        String driverType = System.getProperty("driverType");
        customDriver = new CustomDriver(driverType);
        commonFunctions = new CommonFunctions(customDriver);
        customDriver.launchApplication("https://www.phptravels.net");
    }

    @AfterEach
    public void AfterEach()
    {
        customDriver.quit();
    }

    @Test
    public void SearchHotel(){
        try{
            commonFunctions.browse_to_hotels();
            HotelsPageFactory hotelsPageFactory = new HotelsPageFactory(customDriver);
            String tomorrow = UtilDate.getDateAddDays("yyyy-MM-dd", 1);
            String oneWeek = UtilDate.getDateAddDays("yyyy-MM-dd", 8);
            hotelsPageFactory.searchHotel("HILTON", tomorrow, oneWeek, customDriver);
            Assertions.assertTrue(customDriver.isTextInSource("No Results Found"));
        }
        catch(Exception ex){
            ex.printStackTrace();
            Assertions.fail("Fallo", ex);
        }
    }
}

