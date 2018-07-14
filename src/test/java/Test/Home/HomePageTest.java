package Test.Home;

import common.CommonFunctions;
import myDriver.CustomDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pageElements.FlightsPage;
import pageElements.HomePage;
import util.UtilDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HomePageTest {

    private CustomDriver customDriver;
    private CommonFunctions commonFunctions;

    @BeforeEach
    public void BeforeEach()
    {
        customDriver = new CustomDriver();
        commonFunctions = new CommonFunctions(customDriver, "https://www.phptravels.net");
    }

    @AfterEach
    public void AfterEach()
    {
        customDriver.quit();
    }

    @Test
    public void TestHomePage()
    {
        try{
            boolean sectionIsPresent = customDriver.isElementDisplayed(HomePage.promotion_Section);
            Assertions.assertTrue(sectionIsPresent);
        }
        catch (Exception ex){
            Assertions.fail("Fallo", ex);
        }
    }

    @Test
    public void SearchFlightsRoundTrip(){
        try{
            //Change to Flights search
            customDriver.click(HomePage.flights_search_Panel);
            customDriver.waitForElementIsVisible(HomePage.oneWay_Check, 5);
            boolean oneWayIsPresent = customDriver.isElementDisplayed(HomePage.oneWay_Check);
            Assertions.assertTrue(oneWayIsPresent);
            //Origin
            customDriver.click(HomePage.flights_airport_origin);
            customDriver.writeText(HomePage.flights_airport_origin_TextInput, "LIM");
            customDriver.waitForElementIsVisible(HomePage.flights_airport_origin_results_highlighted, 5);
            customDriver.sendKey(HomePage.flights_airport_origin_TextInput, Keys.RETURN);
            //Destiny
            customDriver.click(HomePage.flights_airport_destiny);
            customDriver.writeText(HomePage.flights_airport_destiny_TextInput, "MIA");
            customDriver.waitForElementIsVisible(HomePage.flights_airport_destiny_results_highlighted, 5);
            customDriver.sendKey(HomePage.flights_airport_destiny_TextInput, Keys.RETURN);
            //Round Trip
            customDriver.click(HomePage.flights_roundTrip_Radio);
            //Departure
            String tomorrow = UtilDate.getDateAddDays("yyyy-MM-dd", 1);
            customDriver.writeText(HomePage.flights_departure_Input, tomorrow);
            //Arrival
            String oneWeek = UtilDate.getDateAddDays("yyyy-MM-dd", 8);
            customDriver.writeText(HomePage.flights_arrival_Input, oneWeek);
            //Click search -> flights results
            customDriver.click(HomePage.flights_search_Button);
            customDriver.waitForElementIsVisible(FlightsPage.flights_datesAvailability_Div, 10);
            Assertions.assertTrue(customDriver.elementContainsText(FlightsPage.flights_datesAvailability_Div, "Dates Availability"));
        }
        catch (Exception ex){
            Assertions.fail("Fallo", ex);
        }
    }
}
