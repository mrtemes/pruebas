package pruebas;

import static java.lang.Character.toUpperCase;

/**
 * PrimerasMayusculas
 */
public class PrimerasMayusculas {

    private PrimerasMayusculas() {

    }

    public static String mayusculasPrimerasPoner (String cadena) {
        char[] caracteres = cadena.toCharArray();
        caracteres[0] = toUpperCase(caracteres[0]);
        
         // el -2 es para evitar una excepción al caernos del arreglo.
         for (int i = 0; i < cadena.length() -2; i++ ) {
            // Es 'palabra'.
            if (caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',') {
                // Se reemplaza el caracter siguente.
                caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
            }
        }
       

        return new String(caracteres);
    }     

}