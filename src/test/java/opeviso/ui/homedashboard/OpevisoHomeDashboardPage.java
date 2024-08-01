package opeviso.ui.homedashboard;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OpevisoHomeDashboardPage extends PageObject {

    public static final Target MANTENIMIENTO = Target.the("Mantenimiento de Usuario").locatedBy("//span[contains(text(),'Mantenimiento')]");
    public static final Target MANTENIMIENTO_USUARIO = Target.the("Mantenimiento de Usuario").locatedBy("//span[contains(text(),'Mantenimiento')]");


}
