
package pruebas;

import java.io.FileNotFoundException;
import java.io.IOException;

import es.temes.archivos.ArchivoCaptura;

/**
 * TestMayusculasPrimeras
 */
public class pruebasCaptura {
    static String campoCaptura;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        campoCaptura = ArchivoCaptura.capturarContenido("C:\\CORAutomatizacion\\Intercambio\\VBA_JavaCaptura03.txt");
       
       System.out.println(PrimerasMayusculas.mayusculasPrimerasPoner(campoCaptura));
    }
}