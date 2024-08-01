package opeviso.model;

import java.io.Serializable;

public class OpevisoUsuario implements Serializable {

    public final String usuario;
    public final String clave;

    public OpevisoUsuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }


}
