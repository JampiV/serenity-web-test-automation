package com.nttdata.testing.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@DefaultUrl("https://www.demoblaze.com/")
public class ProductPages extends PageObject
{
    public static Target getProductNameTarget(String productName)
    {
        return Target.the("Nombre del producto")
                .located(By.xpath(String.format("//a[@class='hrefch' and text()='%s']", productName)));
    }

    public static final Target BTN_ADD_TO_CAR =
            Target.the("Boton agregar al carrito")
                    .located(By.xpath("//a[@class='btn btn-success btn-lg' and text()='Add to cart']"));

    public String getAlertMessage()
    {
        new WebDriverWait(getDriver(), Duration.ofSeconds(2))
                .until(ExpectedConditions.alertIsPresent());

        Alert alert = getDriver().switchTo().alert();

        String alertMessage = alert.getText();
        alert.accept();

        return alertMessage;
    }
}
