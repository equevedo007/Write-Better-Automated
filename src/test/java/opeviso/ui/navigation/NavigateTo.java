package opeviso.ui.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theSearchHomePage() {
        return Task.where("{0} Open the Opeviso Login",
                Open.browserOn().the(OpevisoLoginPage.class));
    }
}
