package lab1algoritmos;

import java.util.Arrays;

public class Verificador {

    public static boolean esSobrePos(Rectangulo r1, Rectangulo r2) {

        double bajo[] = new double[2];
        double alto[] = new double[2];
        double corto[] = new double[2];
        double largo[] = new double[2];

        if (Math.abs(r1.getEsquina1().getX() - r1.getEsquina2().getX()) > Math.abs(r2.getEsquina1().getX() - r2.getEsquina2().getX())) {
            largo[0] = (r1.getEsquina1().getX());
            largo[1] = (r1.getEsquina2().getX());
            corto[0] = (r2.getEsquina1().getX());
            corto[1] = (r2.getEsquina2().getX());
        } else {
            largo[0] = (r2.getEsquina1().getX());
            largo[1] = (r2.getEsquina2().getX());
            corto[0] = (r1.getEsquina1().getX());
            corto[1] = (r1.getEsquina2().getX());
        }
        if (Math.abs(r1.getEsquina1().getY() - r1.getEsquina2().getY()) > Math.abs(r2.getEsquina1().getY() - r2.getEsquina2().getY())) {
            alto[0] = (r1.getEsquina1().getY());
            alto[1] = (r1.getEsquina2().getY());
            bajo[0] = (r2.getEsquina1().getY());
            bajo[1] = (r2.getEsquina2().getY());
        } else {
            alto[0] = (r2.getEsquina1().getY());
            alto[1] = (r2.getEsquina2().getY());
            bajo[0] = (r1.getEsquina1().getY());
            bajo[1] = (r1.getEsquina2().getY());
        }
        Arrays.sort(alto);
        Arrays.sort(bajo);
        Arrays.sort(corto);
        Arrays.sort(largo);
        
        if ((largo[0] <= corto[0] && corto[0] <= largo[1]) || (largo[0] <= corto[1] && corto[1] <= largo[1])) {

            if ((alto[0] <= bajo[0] && bajo[0] <= alto[1]) || (alto[0] <= bajo[1] && bajo[1] <= alto[1])) {

                return true;
            }
        }
        return false;
    }

    public static boolean esJunto(Rectangulo r1, Rectangulo r2) {
        if (r1.getEsquina1().getX() == r2.getEsquina1().getX() || r1.getEsquina2().getX() == r2.getEsquina1().getX() || r1.getEsquina1().getX() == r2.getEsquina2().getX() || r1.getEsquina2().getX() == r2.getEsquina2().getX()) {
            return true;
        }
        return false;
    }

    public static boolean esDisjunto(Rectangulo r1, Rectangulo r2) {
        if (!esSobrePos(r1, r2)) {
            return true;
        }
        return false;
    }
}
