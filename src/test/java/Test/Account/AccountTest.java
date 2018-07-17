package Test.Account;

import common.CommonFunctions;
import myDriver.CustomDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountTest {

    private CustomDriver customDriver;
    private CommonFunctions commonFunctions;

    @BeforeEach
    public void BeforeEach() {
        String driverType = System.getProperty("driverType");
        customDriver = new CustomDriver(driverType);
        commonFunctions = new CommonFunctions(customDriver);
        customDriver.launchApplication("https://www.phptravels.net");
    }

    @AfterEach
    public void AfterEach() {
        customDriver.quit();
    }

    @Test
    public void TestAccountSignUp() {
        try {
            //Tu código aquí
            //La página es https://www.phptravels.net/register
            Assertions.fail("La prueba aún no ha sido implementada");
        } catch (Exception ex) {
            ex.printStackTrace();
            Assertions.fail("Fallo", ex);
        }
    }

    @Test
    public void TestLogin() {
        try {
            //Tu código aquí
            //La página es https://www.phptravels.net/login
            Assertions.fail("La prueba aún no ha sido implementada");
        } catch (Exception ex) {
            ex.printStackTrace();
            Assertions.fail("Fallo", ex);
        }
    }
}
