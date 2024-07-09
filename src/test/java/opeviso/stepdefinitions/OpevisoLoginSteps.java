package opeviso.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;
import opeviso.model.OpevisoUsuarios;
import opeviso.task.login.Login;
import org.openqa.selenium.By;


public class OpevisoLoginSteps {

    @Given("el usuario {actor} esta en la pagina de inicio de sesion")
    public void el_usuario_esta_en_la_pagina_de_inicio_de_sesion(Actor actor) {
        actor.attemptsTo(Open.url("http://139.144.33.83/corporosoft/#/login"));
    }
    @When("{actor} ingresa credenciales validas")
    public void ingresa_credenciales_validas(Actor actor) {

        actor.attemptsTo(

                Login.asA(OpevisoUsuarios.ROOT)
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

    @Then("{string} cerrar sesion")
    public void cerrar_sesion(String string) {
        System.out.println("OpevisoLoginSteps.cerrar_sesion");
    }
    @Then("{string} deberia ver un mensaje de despedida {string}")
    public void deberia_ver_un_mensaje_de_despedida(String string, String string2) {
        System.out.println("OpevisoLoginSteps.deberia_ver_un_mensaje_de_despedida");
    }



}
