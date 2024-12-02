package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.HomePage;
import com.nttdata.testing.Pages.ProductPages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddToCar implements Task
{
    private final ProductPages productPages = new ProductPages();
    private String productName;

    public AddToCar(String productName)
    {
        this.productName = productName;
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {

        actor.attemptsTo(
                Click.on(ProductPages.getProductNameTarget(productName)),
                Click.on(ProductPages.BTN_ADD_TO_CAR)
        );

        System.out.println("\u001B[32m" + "Alert message: "+ productPages.getAlertMessage() + "\u001B[37m");
    }

    public static Performable withData(String productName)
    {
        return new AddToCar(productName);
    }
}
