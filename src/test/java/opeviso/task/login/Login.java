package opeviso.task.login;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;
import opeviso.model.OpevisoUsuarios;

public class Login {

    public static Performable asA(OpevisoUsuarios opevisoUsuarios) {

        return Task.where("{0} ingresa credenciales validas " + opevisoUsuarios,
                Enter.theValue(opevisoUsuarios.usuario).into(By.name("u")),
                Enter.theValue(opevisoUsuarios.clave).into(By.name("c"))
        );
    }

    public static Performable ClickIngresar() {

        return Task.where("hace clic en el boton Ingresar",
                Click.on(Button.withText("Ingresar"))
        );
    }
}
