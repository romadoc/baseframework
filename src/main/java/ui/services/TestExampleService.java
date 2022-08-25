package ui.services;

import com.codeborne.selenide.Selenide;
import ui.pages.example.TestExamplePage;
import utils.Constants;

public class TestExampleService {
    private TestExamplePage testExamplePage = new TestExamplePage();

    public TestExamplePage clickButtonAndOpenResultPage() {
        Selenide.open(Constants.BASE_URL);
        testExamplePage.getInputName().clearAndType("Roma");
        testExamplePage.getInputLast().clearAndType("Viva");
        testExamplePage.getInputCity().clearAndType("New-York");
        testExamplePage.getInputCountry().clearAndType("USA");
//            SelenideElement input = $(By.id("country"));
//            input.sendKeys("USA", Keys.TAB);
        testExamplePage.getButton().click();
//        SelenideElement button = $(By.id("submit_button"));
//
//        actions().moveToElement(button).click(button).perform();

        return this.testExamplePage;
    }
}

