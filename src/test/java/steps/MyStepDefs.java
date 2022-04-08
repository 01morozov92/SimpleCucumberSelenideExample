package steps;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Если;
import io.cucumber.java.ru.Тогда;
import lombok.SneakyThrows;
import pages.YandexMainPage;
import pages.YandexWeatherPage;

public class MyStepDefs {

    @Тогда("^пользователь попадает на главную страницу Яндекса и нажимает на раздел Погода$")
    public void goToYandex() {
        YandexMainPage yandexMainPage = new YandexMainPage();
        yandexMainPage.goToTemperatureForecast();
    }

    @Если("происходит переход на страницу Прогноз погоды и находит на ней прогноз на завтра")
    public void findTomorrowTemperatureTest() {
        YandexMainPage yandexMainPage = new YandexMainPage();
        YandexWeatherPage yandexWeatherPage = new YandexWeatherPage();
        yandexMainPage.goToTemperatureForecast();
        yandexWeatherPage.getTomorrowTemperature();
    }

    @SneakyThrows
    @Дано("пользователь получает с главной страницы Яндекса текущую температуру")
    public void findCurrentTemperatureTest() {
        YandexMainPage yandexMainPage = new YandexMainPage();
        yandexMainPage.getCurrentTemperature();
        Thread.sleep(5000);
    }

    @Тогда("пользователь открывает страницу Яндекс")
    public void goToYaPage() {
        YandexMainPage yandexMainPage = new YandexMainPage();
        System.out.println("успех?");
    }
}
