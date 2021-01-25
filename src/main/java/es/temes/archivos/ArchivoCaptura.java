package es.temes.archivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ArchivoCaptura {

	public ArchivoCaptura() {
	}


	public static String capturarContenido(String archivo) throws FileNotFoundException, IOException {
		String linea;
		String cadena = "";
		
		FileReader fr = new FileReader(archivo);

		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), "utf-8"));
		
		linea = br.readLine();
		while ((linea = br.readLine()) != null) {
			cadena = cadena + linea;

		}
		fr.close();
		return cadena;
		
	}

	


}