package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserLogin {

    public UserLogin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
