import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import praktikum.BaseTest;
import praktikum.pom.MainPage;
import praktikum.pom.RecoveryPasswordPage;
import praktikum.pom.RegistrationPage;

import static org.junit.Assert.assertEquals;

public class LoginTest extends BaseTest {
    MainPage mainPage = new MainPage(getDriver());
    RegistrationPage registrationPage = new RegistrationPage(getDriver());
    RecoveryPasswordPage recoveryPasswordPage = new RecoveryPasswordPage(getDriver());

    @Before
    public void openPage() {
        openUrl();
    }

    @Test
    @DisplayName("Проверка входа через кнопку войти в аккаунт на главной странице")
    public void loginOnMainPage() {
        mainPage.clickEnterButton();
        login();
        assertEquals("Оформить заказ", mainPage.buttonCreateOrderText());
    }

    @Test
    @DisplayName("Проверка входа через кнопку Личный кабинет")
    public void loginOnClickPersonalAccount() {
        mainPage.clickPersonalAccount();
        login();
        assertEquals("Оформить заказ", mainPage.buttonCreateOrderText());
    }

    @Test
    @DisplayName("Проверка входа через кнопку войти в форме регистрации")
    public void loginOnRegistrationForm() {
        clickPersonalAccount();
        startRegistration();
        mainPage.clickEnterOnRegistrationForm();
        login();
        assertEquals("Оформить заказ", mainPage.buttonCreateOrderText());
    }

    @Test
    @DisplayName("Проверка входа через кнопку войти в форме восстановления пароля")
    public void loginOnRefreshPasswordForm() {
        clickPersonalAccount();
        registrationPage.clickRecoveryPassword();
        recoveryPasswordPage.clickEnterButton();
        login();
        assertEquals("Оформить заказ", mainPage.buttonCreateOrderText());
    }

    @After
    public void quitDriver() {
        baseAfter(getDriver());
    }
}