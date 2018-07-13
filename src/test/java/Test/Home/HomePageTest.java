package Test.Home;

import common.CommonFunctions;
import myDriver.CustomDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomePageTest {

    private CustomDriver customDriver;

    @BeforeEach
    public void BeforeEach()
    {
        customDriver = new CustomDriver();
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
            CommonFunctions commonFunctions = new CommonFunctions(customDriver, "https://www.phptravels.net");
        }
        catch (Exception ex){
            Assertions.fail("Fallo", ex);
        }
    }
}
