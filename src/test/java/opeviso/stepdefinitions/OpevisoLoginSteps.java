package opeviso.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import opeviso.model.OpevisoUsuario;
import opeviso.ui.navigation.NavigateTo;
import opeviso.task.login.Login;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;


public class OpevisoLoginSteps {

    @Given("el usuario {actor} esta en la pagina de inicio de sesion")
    public void el_usuario_esta_en_la_pagina_de_inicio_de_sesion(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSearchHomePage());
    }

    @When("{actor} ingresa credenciales validas")
    public void ingresa_credenciales_validas(Actor actor, DataTable table) {

        List<Map<String, String>> credenciales = table.asMaps(String.class, String.class);
        String usuario = credenciales.get(0).get("Usuario");
        String clave = credenciales.get(0).get("Clave");

        OpevisoUsuario opevisoUsuario = new OpevisoUsuario(usuario, clave);

        actor.attemptsTo(
            Login.asA(opevisoUsuario)
        );
    }
    @When("{actor} hace clic en el boton Ingresar")
    public void hace_clic_en_el_boton(Actor actor) {
        actor.attemptsTo(
                Login.ClickIngresar()
        );
    }

    @Then("{actor} deberia ver un mensaje de bienvenida {string}")
    public void deberia_ver_un_mensaje_de_bienvenida(Actor actor, String MsjBienvenida) {
        System.out.println("Mensaje de Validacion es : " + MsjBienvenida);
        actor.attemptsTo(Ensure.that(Text.of(new By.ByCssSelector("h1.page-header"))).isEqualTo(MsjBienvenida));
    }
    @And("{actor}  cerrar sesion")
    public void cerrarSesion(Actor actor) {
        actor.attemptsTo(
                Login.ClickCerrarSesion()
        );
    }


    @Then("{string} deberia ver un mensaje de despedida {string}")
    public void deberia_ver_un_mensaje_de_despedida(String string, String string2) {
        System.out.println("OpevisoLoginSteps.deberia_ver_un_mensaje_de_despedida");
    }



}
