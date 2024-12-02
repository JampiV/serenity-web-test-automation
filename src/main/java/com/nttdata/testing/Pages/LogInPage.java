package com.nttdata.testing.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.demoblaze.com/")
public class LogInPage extends PageObject
{
    public static final Target BTN_LOG_IN = Target.the("Boton para hacer el log in")
            .located(By.id("login2"));

    public static final Target SIGNIN_MODAL = Target.the("Modal de inicio de sesion")
            .located(By.id("logInModalLabel"));

    public static final Target INP_USERNAME = Target.the("Username")
            .located(By.id("loginusername"));

    public static final Target INP_PASSWORD = Target.the("password")
            .located(By.id("loginpassword"));

    public static final Target BTN_INGRESAR = Target.the("Boton Iniciar Sesion")
            .located(By.xpath("//button[text()='Log in']"));

}
