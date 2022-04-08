package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$x;
import static context.RunContext.RUN_CONTEXT;

@Log4j2
public class YandexWeatherPage {

    SelenideElement tomorrowTemperatureLoc = $x("//div[text()='Сегодня']/ancestor::div[1]/following-sibling::div[2]//span[text()='днём']/following-sibling::span[contains(@class,'temp__value')]");

    public void getTomorrowTemperature() {
        String tomorrowTemperature = tomorrowTemperatureLoc.getText();
        log.info("Tomorrow is " + tomorrowTemperature);
    }

    public void getTomorrowTemperature1(String key) {
        String tomorrowTemperature = tomorrowTemperatureLoc.getText();
        log.info("Tomorrow is " + tomorrowTemperature);
    }
}
