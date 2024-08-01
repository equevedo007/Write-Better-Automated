package opeviso.ui.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://139.144.33.83/corporosoft/#/login")
public class OpevisoLoginPage extends PageObject {

    public final static Target USAURIO = Target.the("Usuario").located(By.name("u"));
    public final static Target CLAVE = Target.the("Clave").located(By.name("c"));
    public final static Target BTN_INGRESAR = Target.the("Ingresar").located(By.xpath("//button[@type='submit']"));
    public final static Target BTN_SALIR = Target.the("Cerrar Sesion").located(By.xpath("//a[@class='dropdown-toggle dropdown-toggle']/img"));
    public final static Target MENSAJE = Target.the("Mensaje de Bienvenida").located(By.cssSelector("h1.page-header\n"));
    public final static Target BTN_CERRAR_SESION = Target.the("Cerrar Sesion").located(By.cssSelector(".dropdown-item"));

    }
