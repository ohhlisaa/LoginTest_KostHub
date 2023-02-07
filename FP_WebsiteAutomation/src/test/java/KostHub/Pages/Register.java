package KostHub.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"Email\"]")
    WebElement emailInputText;

    @FindBy(xpath = "//*[@id=\"Nomor telepon\"]")
    WebElement nomorTeleponInputText;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    WebElement passwordInputText;

    @FindBy(xpath = "//*[@id=\"Konfirmasi password\"]")
    WebElement konfirmasiPasswordInputText;

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement registerCheckbox;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/main/section/div/div/div/div/div[1]/div/form/button[1]")
    WebElement registerButton;

    public Register(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToRegisterPage(){
        driver.get("https://synrgy-fp-c.zekhoi.dev/register/penyedia");
    }

    public void inputEmail(String email){
        emailInputText.sendKeys(email);
    }

    public void inputNomorTelepon(String nomorTelepon){
        nomorTeleponInputText.sendKeys(nomorTelepon);
    }

    public void inputPassword(String password){
        passwordInputText.sendKeys(password);
    }

    public void inputKonfirmasiPassword(String konfirmasiPassword){
        konfirmasiPasswordInputText.sendKeys(konfirmasiPassword);
    }

    public void clickRegisterCheckbox(){
        registerCheckbox.click();
    }

    public void clickRegisterButton(){
        registerButton.click();
    }
}
