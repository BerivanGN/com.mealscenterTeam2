package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MerchantDashboard {
    public MerchantDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
