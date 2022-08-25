package ui.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class CheckBox extends BaseElement {
    public CheckBox(By by) {
        super(by);
    }

    public CheckBox(SelenideElement wrappedElement) {
        super(wrappedElement);
    }

    public void check() {
        this.getWrappedElement().click();
    }
}
