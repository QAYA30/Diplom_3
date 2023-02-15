package praktikum.pom;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private static final String url = "https://stellarburgers.nomoreparties.site/";
    private final By personalAccount = By.xpath(".//p[text()='Личный Кабинет']");
    private final By createOrder = By.xpath(".//button[text()='Оформить заказ']");
    private final By enterOnRegistrationForm = By.xpath(".//a[text()='Войти']");
    private final By enterButton = By.xpath(".//button[text()='Войти в аккаунт']");
    private final By chooseBurger = By.xpath(".//h1[text()='Соберите бургер']");
    private final By breadButton = By.xpath(".//div/span[text()='Булки']");
    private final By sauceButton = By.xpath(".//div/span[text()='Соусы']");
    private final By filingsButton = By.xpath(".//div/span[text()='Начинки']");
    private final By cratorBread = By.xpath(".//p[text()='Краторная булка N-200i']");
    private final By galaxySauce = By.xpath(".//p[text()='Соус традиционный галактический']");
    private final By luminFiling = By.xpath(".//p[text()='Филе Люминесцентного тетраодонтимформа']");
    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Открытие главной страницы приложения")
    public String getUrl() {
        return url;
    }

    @Step("Клик по кнопке \"Личный кабинет\"")
    public void clickPersonalAccount() {
        driver.findElement(personalAccount).click();
    }

    @Step("Клик по кнопке \"Войти\"")
    public void clickEnterOnRegistrationForm() {
        driver.findElement(enterOnRegistrationForm).click();
    }

    @Step("Клик по кнопке \"Войти в аккаунт\"")
    public void clickEnterButton() {
        driver.findElement(enterButton).click();
    }

    @Step("Получение текста \"Соберите бургер\"")
    public String textOfChooseBurger() {
        return driver.findElement(chooseBurger).getText();
    }

    @Step("Проверка появления кнопки \"Оформить заказ\"")
    public String buttonCreateOrderText() {
        return driver.findElement(createOrder).getText();
    }

    @Step("Клик по кнопке \"Булки\"")
    public void clickBreadButton() {
        driver.findElement(breadButton).click();
    }

    @Step("Клик по кнопке \"Соусы\"")
    public void clickSauceButton() {
        driver.findElement(sauceButton).click();
    }

    @Step("Клик по кнопке \"Начинки\"")
    public void clickFilingsButton() {
        driver.findElement(filingsButton).click();
    }

    @Step("Получение текста \"Краторная булка N-200i\"")
    public String getTextCratorBread() {
        return driver.findElement(cratorBread).getText();
    }

    @Step("Получение текста \"Соус традиционный галактический\"")
    public String getTextGalaxySauce() {
        return driver.findElement(galaxySauce).getText();
    }

    @Step("Получение текста \"Филе Люминесцентного тетраодонтимформа\"")
    public String getTextLuminFiling() {
        return driver.findElement(luminFiling).getText();
    }
}