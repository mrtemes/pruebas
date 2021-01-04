package pruebas;

/**
 * TestMayusculasPrimeras
 */
public class TetsWindowsUsuario {

    public static void main(String[] args) {
        String cadena = WindowsUsuario.windowsUsuarioCaptura();
        System.out.println(PrimerasMayusculas.mayusculasPrimerasPoner(cadena));
    }
}