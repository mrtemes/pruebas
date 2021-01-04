package pruebas;

public class WindowsUsuario {

    private WindowsUsuario() {

    }

    public static String windowsUsuarioCaptura() {
        String usuario = "";
        usuario = System.getProperty("user.name");
        return usuario;
    }

}
