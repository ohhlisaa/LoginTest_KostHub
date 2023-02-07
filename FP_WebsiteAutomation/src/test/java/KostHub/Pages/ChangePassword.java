package KostHub.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ChangePassword {
    WebDriver driver;

    WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/nav/div/div/button")
    WebElement profileIcon;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/nav/div/div/div[2]/div/div[3]/a")
    WebElement settingMenu;

    @FindBy(xpath = "//*[@id=\"Password lama\"]")
    WebElement passwordInputText;

    @FindBy(xpath = "//*[@id=\"Password baru\"]")
    WebElement newPasswordInputText;

    @FindBy(xpath = "//*[@id=\"Konfirmasi password baru\"]")
    WebElement konfirmasiNewPasswordInputText;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div[2]/form/div[4]/button")
    WebElement saveButton;

    @FindBy(xpath = "")
    WebElement successMessagePassword;

    public ChangePassword(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait=wait;
        PageFactory.initElements(driver, this);
    }

    public void clickProfileIcon(){
        profileIcon.isDisplayed();
        profileIcon.click();
    }

    public void clickSettingMenu(){
        settingMenu.isDisplayed();
        settingMenu.click();
    }

    public void validateOnChangePasswordPencariPage(){
        // driver.get("https://synrgy-fp-c.zekhoi.dev/login/pencari");
        Assert.assertEquals(driver.getCurrentUrl(), "https://synrgy-fp-c.zekhoi.dev/my");
    }

    public void validateOnChangePasswordPemilikPage(){
        // driver.get("https://synrgy-fp-c.zekhoi.dev/login/pencari");
        Assert.assertEquals(driver.getCurrentUrl(), "https://synrgy-fp-c.zekhoi.dev/my");
    }

    public void inputPassword(String password){
        passwordInputText.sendKeys(password);
    }

    public void inputNewPassword(String newPassword){
        newPasswordInputText.sendKeys(newPassword);
    }

    public void inputKonfirmasiNewPassword(String konfirmasiNewPassword){
        konfirmasiNewPasswordInputText.sendKeys(konfirmasiNewPassword);
    }

    public void clickSaveButton(){
        saveButton.click();
    }

    public void successMessageShow() {
        successMessagePassword.isDisplayed();
    }
}
