package ui.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Label extends BaseElement {
    public Label(By by) {
        super(by);
    }

    public Label(SelenideElement wrappedElement) {
        super(wrappedElement);
    }

    public boolean isDisplayed() {
        return this.getWrappedElement().is(Condition.visible);
    }

    public String getLabelTextText() {
        return this.getWrappedElement().getText();
    }
}
