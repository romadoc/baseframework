package ui.pages.example;

import org.openqa.selenium.By;
import ui.elements.Label;

public class TestExampleResultPage {
    private Label label = new Label(By.xpath("//h1"));

    public String getLabel() {
        return label.getLabelTextText();
    }
}
