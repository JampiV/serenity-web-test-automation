package com.nttdata.testing.stepDefinition;

import com.nttdata.testing.Tasks.AddToCar;
import com.nttdata.testing.Tasks.NavigateTo;
import com.nttdata.testing.Tasks.UserLogIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgregarProductoAlCarroStepDefinition
{
    @Given("el {actor} ha iniciado sesion usando su user {string} y clave {string}")
    public void elUsuarioHaIniciadoSesionUsandoSuUserYClave(Actor actor, String user, String pass)
    {
        actor.attemptsTo(NavigateTo.theLogInPage());
        theActorInTheSpotlight().attemptsTo(UserLogIn.withData(user, pass));
        System.out.println("\u001B[32m" + "Inicio de sesión exitoso" + "\u001B[37m");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException ex)
        {
            throw new RuntimeException(ex);
        }

    }

    @Then("el producto se agrega al carrito de manera exitosa")
    public void elProductoSeAgregaAlCarritoDeManeraExitosa()
    {
        System.out.println("\u001B[32m" + "Producto agregado al carrito exitosamente" + "\u001B[37m");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex)
        {
            throw new RuntimeException(ex);
        }
    }

    @When("selecciona el producto de nombre {string} para agregar al carrito")
    public void seleccionaElProductoDeNombreParaAgregarAlCarrito(String nameProduct)
    {
        theActorInTheSpotlight().attemptsTo(AddToCar.withData(nameProduct));
    }
}
