package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.LogInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class UserLogIn implements Task
{
    public Actor actor;
    private final String username;
    private final String password;

    public UserLogIn(Actor actor, String username, String password)
    {
        this.username = username;
        this.password = password;
        this.actor = actor;
    }

    public UserLogIn(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(
                Click.on(LogInPage.BTN_LOG_IN),
                Enter.theValue(username).into(LogInPage.INP_USERNAME),
                Enter.theValue(password).into(LogInPage.INP_PASSWORD),
                Click.on(LogInPage.BTN_INGRESAR)
        );
    }

    public static Performable withData(String username, String password)
    {
        return new UserLogIn(username, password);
    }

}
