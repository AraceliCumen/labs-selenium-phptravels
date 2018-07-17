import myDriver.CustomDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSetup {
    @Test
    public void junitWorking(){
        Assertions.assertTrue(true);
    }

    @Test void ChromeWorking(){
        try{
            CustomDriver customDriver = new CustomDriver("Chrome");
            customDriver.launchApplication("https://google.com.pe");
            customDriver.quit();
            Assertions.assertTrue(true);
        }
        catch(Exception ex){
            ex.printStackTrace();
            Assertions.fail("fallo", ex);
        }
    }

    @Test void ChromeHeadlessWorking(){
        try{
            CustomDriver customDriver = new CustomDriver("Headless");
            customDriver.launchApplication("https://google.com.pe");
            customDriver.quit();
            Assertions.assertTrue(true);
        }
        catch(Exception ex){
            ex.printStackTrace();
            Assertions.fail("fallo", ex);
        }
    }

    @Test void FirefoxWorking(){
        try{
            CustomDriver customDriver = new CustomDriver("Firefox");
            customDriver.launchApplication("https://google.com.pe");
            customDriver.quit();
            Assertions.assertTrue(true);
        }
        catch(Exception ex){
            ex.printStackTrace();
            Assertions.fail("fallo", ex);
        }
    }
}
