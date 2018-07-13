package pageElements;

import org.openqa.selenium.By;

public class Header {
    public static By logo_Home=By.xpath("//body/nav[@class='navbar navbar-default']//div[@class='navbar-header']/a[@href='https://www.phptravels.net/']/img[@alt='']");
    public static By navbar_Home=By.xpath("//div[@id='collapse']/ul[@class='nav navbar-nav']//a[@href='https://www.phptravels.net/']");
    public static By navbar_Hotels=By.xpath("//div[@id='collapse']/ul[@class='nav navbar-nav']//a[@title='Hotels']");
    public static By navbar_Flights=By.xpath("//div[@id='collapse']/ul[@class='nav navbar-nav']//a[@title='Flights']");
    public static By navbar_Tours=By.xpath("//div[@id='collapse']/ul[@class='nav navbar-nav']//a[@title='Tours']");
}
