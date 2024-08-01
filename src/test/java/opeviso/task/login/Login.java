package opeviso.task.login;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;
import opeviso.model.OpevisoUsuario;
import opeviso.ui.navigation.OpevisoLoginPage;

public class Login {


    public static Performable asA(OpevisoUsuario    opevisoUsuarios) {

        return Task.where("{0} ingresa credenciales validas " + opevisoUsuarios,
                Enter.theValue(opevisoUsuarios.getUsuario()).into(OpevisoLoginPage.USAURIO),
                Enter.theValue(opevisoUsuarios.getClave()).into(OpevisoLoginPage.CLAVE));
    }


    public static Performable ClickIngresar() {

        return Task.where("hace clic en el boton Ingresar",
                Click.on(OpevisoLoginPage.BTN_INGRESAR));
    }

    public static Performable ClickCerrarSesion() {

        return Task.where("hace clic en el boton Cerrar Sesion",
                Click.on(OpevisoLoginPage.BTN_SALIR),
                Click.on(OpevisoLoginPage.BTN_CERRAR_SESION));
    }




}
