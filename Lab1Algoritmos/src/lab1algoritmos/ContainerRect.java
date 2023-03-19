package lab1algoritmos;

import java.text.DecimalFormat;

public class ContainerRect {

    Rectangulo[] rectangulos;
    double[] distancias;
    double[] areas;
    int num;
    static int numRec = 0;

    public ContainerRect(int num) {
        this.num = num;
        rectangulos = new Rectangulo[num];
        distancias = new double[num];
        areas = new double[num];

    }

    public void addRectangulo(Rectangulo r1) {
        if (rectangulos[num - 1] == null) {
            rectangulos[numRec] = r1;
            distancias[numRec] = Coordenada.distancia(r1.getEsquina1(), r1.getEsquina2());
            areas[numRec] = (Math.abs(r1.getEsquina2().getX() - r1.getEsquina1().getX()) * (Math.abs(r1.getEsquina2().getY() - r1.getEsquina1().getY())));

            numRec++;

        } else {
            System.out.println("Contenedor Completo, no se pueden agregar mas rectangulos");
        }

    }

    @Override
    public String toString() {
        String s = "Rectangulo\tCoordenadas\t\t\tDistancia\tArea\n";
        DecimalFormat df = new DecimalFormat("###.##");
        for (int i = 0; i < num; i++) {
            s += (i + 1) + "\t\t" + "(" + rectangulos[i].getEsquina1() + "," + rectangulos[i].getEsquina2() + ")" + "\t\t" + df.format(distancias[i]) + "\t\t" + df.format(areas[i]) + "\n";
        }
        return s;
    }

}
