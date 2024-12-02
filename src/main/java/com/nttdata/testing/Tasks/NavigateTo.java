package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.HomePage;
import com.nttdata.testing.Pages.LogInPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theHomePage() {
        return Task.where("{0} opens the Home page",
                Open.browserOn().the(HomePage.class));
    }

    public static Performable theLogInPage()
    {
        return Task.where("{0} opens the LogIn page",
                Open.browserOn().the(LogInPage.class));
    }
}
