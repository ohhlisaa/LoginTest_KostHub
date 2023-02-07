package KostHub.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/nav/div/div/div[1]/div[2]/div/div/div/button[1]")
    WebElement batalButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/nav/div/div/div[1]/div[2]/div/div/div/button[2]")
    WebElement keluarButton;

    public Logout(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
