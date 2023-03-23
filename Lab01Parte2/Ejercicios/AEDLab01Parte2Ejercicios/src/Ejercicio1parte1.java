
import javax.swing.JOptionPane;

public class Ejercicio1parte1 {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null,
                "Introduce la lista de alumnos\ncadena vacia para terminar",
                "Introducir texto",
                JOptionPane.INFORMATION_MESSAGE);

        String cadenaResultado = "Alumnos:\n";

        //Mientras no este vacio la cadena escrita continuo
        while (!texto.isEmpty()) {
            //Concatenamos el texto
            cadenaResultado += texto + "\n";

            //Reintroducimos de nuevo una cadena
            texto = JOptionPane.showInputDialog(null,
                    "Introduce un texto\ncadena vacia para terminar",
                    "Introducir texto",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        JOptionPane.showInputDialog(null,
                cadenaResultado,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
