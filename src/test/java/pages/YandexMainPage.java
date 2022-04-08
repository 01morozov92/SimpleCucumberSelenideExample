package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.switchTo;

@Log4j2
public class YandexMainPage  {

    private final SelenideElement globalInputFieldLoc = $x("//input[@aria-label='Запрос']");
    private final SelenideElement currentTemperatureLoc = $x("//div[@class='weather__temp']");
    private final SelenideElement findButtonLoc = $x("//span[text() ='Найти']/parent::button");
    private final SelenideElement resultListLoc = $x("//ul[@aria-label='Результаты поиска']");
    private final SelenideElement weatherLoc = $x("//div[@class='weather__header']//a[text()='Погода']");

    public void searchThemeWithYandex(String expression) {
        globalInputFieldLoc.shouldBe(Condition.enabled, Duration.ofMillis(500000)).val(expression);
        findButtonLoc.shouldBe(Condition.enabled).click();
        resultListLoc.shouldBe(Condition.enabled);
    }

    public void getCurrentTemperature() {
        String todayTemperature = currentTemperatureLoc.shouldBe(Condition.visible).getText();
        log.info("Today is " + todayTemperature);
    }

    public void goToTemperatureForecast() {
        weatherLoc.shouldBe(Condition.enabled).click();
            switchTo().window(1);
    }
}
