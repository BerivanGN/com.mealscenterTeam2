package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminLogin {
    public AdminLogin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
