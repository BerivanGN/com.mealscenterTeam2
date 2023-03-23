package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MerchantLogin {

    public MerchantLogin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
