package praktikum;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import praktikum.pom.LoginPage;
import praktikum.pom.MainPage;

import java.time.Duration;

public class BaseTest {
    private final String loginEmail = "qa.ya.30@ya.ru";
    private final String loginPassword = "qwerty";
    Faker faker = new Faker();
    private final String email = faker.internet().emailAddress();
    private final String password = faker.internet().password(6, 10);
    private final String invalidPassword = faker.random().toString().substring(0, 5);
    private final String userName = faker.name().firstName();
    private final WebDriver driver = new ChromeDriver();
    MainPage mainPage = new MainPage(driver);
    LoginPage loginPage = new LoginPage(driver);

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getInvalidPassword() {
        return invalidPassword;
    }

    public String getUserName() {
        return userName;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void openUrl() {
        driver.get(mainPage.getUrl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    public void login() {
        loginPage.loginEnterFieldsAndClick(loginEmail, loginPassword);
    }

    public void clickPersonalAccount() {
        mainPage.clickPersonalAccount();
    }

    public void startRegistration() {
        loginPage.clickButtonFromStartRegistration();
    }

    public void clickEnterOnMainPage() {
        mainPage.clickEnterButton();
    }

    public void baseAfter(WebDriver driver) {
        driver.quit();
    }
}