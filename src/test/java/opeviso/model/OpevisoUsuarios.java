package opeviso.model;

public enum OpevisoUsuarios {

    ROOT ("root","root");

    public final String usuario;
    public final String clave;

    OpevisoUsuarios(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
}
