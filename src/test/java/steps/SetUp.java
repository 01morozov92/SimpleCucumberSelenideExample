package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class SetUp {

    @Before
    public void setUp() {
        Configuration.baseUrl = "https://yandex.ru/";
        Configuration.timeout = 15000;
        open("");
    }

    @After
    public void tierDown(){
        closeWebDriver();
    }
}
