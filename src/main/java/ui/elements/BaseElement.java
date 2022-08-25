/**
 * @author Raman Darashenka  r.darashenka@andersenlab.com skype roman15940
 *
 * @description this class creates base wrapper ui-element
 *
 */

package ui.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BaseElement {
    private final SelenideElement wrappedElement;

    public BaseElement(By by) {
        this.wrappedElement = $(by);
    }
    public BaseElement(SelenideElement wrappedElement) {
        this.wrappedElement = wrappedElement;
    }

    public SelenideElement getWrappedElement() {
        return wrappedElement;
    }

    public boolean isVisible() {
        return getWrappedElement().isDisplayed();
    }

}
