package ui.pages.example;


import org.openqa.selenium.By;
import ui.elements.Button;
import ui.elements.Input;

public class TestExamplePage {
   //Button button = new Button(By.xpath("//nav[@class = 'navbar__nav navbar__nav_desktop']/a[1]"));
  private Input inputName = new Input(By.xpath("//div[@class='form-group']//input[@name='first_name']"));
  private Input inputLast = new Input(By.xpath("//div[@class='form-group']//input[@name='last_name']"));
   private Input inputCity = new Input(By.xpath("//div[@class='form-group']//input[@class='form-control city']"));
   private Input inputCountry = new Input(By.id("country"));
   private Button button = new Button(By.id("submit_button"));

   public Input getInputName() {
      return inputName;
   }

   public Input getInputLast() {
      return inputLast;
   }

   public Input getInputCity() {
      return inputCity;
   }

   public Input getInputCountry() {
      return inputCountry;
   }

   public Button getButton() {
      return button;
   }
}
