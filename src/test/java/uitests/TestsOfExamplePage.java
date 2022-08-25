package uitests;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;
import ui.pages.example.TestExampleResultPage;
import ui.services.TestExampleService;

public class TestsOfExamplePage extends BaseUiTest {
    TestExampleResultPage testExampleResultPage;


    @Test
    @Owner("Raman Darashenka")
    @Description("checked ability to use allure")
    public void openTestPage() {
        TestExampleService testExampleService = new TestExampleService();
        testExampleService.clickButtonAndOpenResultPage();


//        Assert.assertEquals("Новости", testExampleResultPage.getLabel());
//        Assert.assertEquals("Рома", testExampleResultPage.getLabel());
    }

}
