package common;

import myDriver.CustomDriver;
import pageElements.Header;

public class CommonFunctions {
    private CustomDriver customDriver;

    public CommonFunctions(CustomDriver driver, String rootUrl){
        customDriver = driver;
        customDriver.launchApplication(rootUrl);
    }

    public void browse_to_home(){
        customDriver.click(Header.navbar_Home);
    }

    public void browse_to_hotels(){
        customDriver.click(Header.navbar_Hotels);
    }

}
