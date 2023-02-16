package praktikum.pom;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalAccountPage {
    private final By logo = By.xpath(".//div[@class = 'AppHeader_header__logo__2D0X2']/a");
    private final By logoutButton = By.xpath(".//button[text()='Выход']");
    private final By conctructorButton = By.xpath(".//p[text()='Конструктор']");
    WebDriver driver;

    public PersonalAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Клик по кнопке \"Выход\"")
    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }

    @Step("Клик по логотипу")
    public void clickLogo() {
        driver.findElement(logo).click();
    }

    @Step("Клик по кнопке \"Конструктор\"")
    public void clickConctructorButton() {
        driver.findElement(conctructorButton).click();
    }

    @Step("Получение кнопки \"Выход\"")
    public String logoutButtonText() {
        return driver.findElement(logoutButton).getText();
    }
}