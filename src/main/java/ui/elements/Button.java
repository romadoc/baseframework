package ui.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Button extends BaseElement {
    public Button(By by) {
        super(by);
    }

    public Button(SelenideElement wrapperElement) {
        super(wrapperElement);
    }

    public void click() {
       this.getWrappedElement().click();
    }
}
