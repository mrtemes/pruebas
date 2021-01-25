import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

/**
 * TestMayusculasPrimeras
 */
public class PortaPapeles {
    
    public void copiar (String copiar) {
        StringSelection ss = new StringSelection(copiar);
        // Importar librerías necesarias.
        // Preparar el portapapeles.
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        // Ajustar el contenido al portapapeles.
        cb.setContents(ss, null);
    }

    public String pegar () {
        String resultado = "";
        // Preparar el portapapeles.
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        // Importar librerías necesarias.
        // Almacenar en "contenido" todo el contenido del portapapeles.
        Transferable contendio = cb.getContents(null);
        if (contenido.isDataFlavorSupported(DataFlavor.stringFlavor)) {
            // Hacer un CAST y guardamos en resultado.
            resultado = (String) contenido.getTransferData(DataFlavor.stringFlavor);
        }

        return resultado;
    }
}