package pageObjects;

import org.openqa.selenium.By;

//PageObject pattern
public class HomePage {
    public static By search_Panel=By.xpath("//*[@id='body-section']/section/div[2]/div/div[2]");
    public static By promotion_Section=By.xpath("//*[@id='body-section']/section");
    public static By hotels_search_Panel=By.xpath("//*[@id='body-section']/section/div[2]/div/div[2]/ul/li[1]/a");



    //Flights
    public static By flights_search_Panel=By.xpath("//*[@id='body-section']/section/div[2]/div/div[2]/ul/li[2]/a");
    public static By oneWay_Check=By.xpath("//*[@id='s2id_location_from']/a");

    public static By flights_airport_origin=By.xpath("//*[@id='s2id_location_from']/a");
    public static By flights_airport_origin_TextInput=By.xpath("//*[@id='select2-drop']/div/input");
    public static By flights_airport_origin_results_highlighted=By.xpath("//*[@id='select2-drop']/ul/li[contains(@class, 'select2-highlighted')]");

    public static By flights_airport_destiny=By.xpath("//*[@id='s2id_location_to']/a");
    public static By flights_airport_destiny_TextInput=By.xpath("//*[@id='select2-drop']/div/input");
    public static By flights_airport_destiny_results_highlighted=By.xpath("//*[@id='select2-drop']/ul/li[contains(@class, 'select2-highlighted')]");

    public static By flights_oneWay_Radio=By.xpath("//*[@id='oneway']");
    public static By flights_roundTrip_Radio=By.xpath("//*[@id='flights']/form/div[9]/div[2]/div/label");

    public static By flights_departure_Input=By.xpath("//input[@name='departure']");
    public static By flights_arrival_Input=By.xpath("//input[@name='arrival']");

    public static By flights_search_Button=By.xpath("//*[@id='flights']/form/div/button[@type='submit']");
}
