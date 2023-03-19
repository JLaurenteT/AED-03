
package lab1algoritmos;
import java.util.Scanner;

public class Lab1Algoritmos {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangulo a;
        Rectangulo b;
        double coo1,coo2,coo3,coo4;
        
        System.out.println("Ingrese la  esquina del 1er rectangulo");
        coo1=sc.nextDouble();
        coo2=sc.nextDouble();
        System.out.println("Ingrese la esquina opuesta del 1er rectangulo");
        coo3=sc.nextDouble();
        coo4=sc.nextDouble();
        a=new Rectangulo(new Coordenada(coo1, coo2),new Coordenada(coo3,coo4));
        System.out.println("Ingrese la  esquina del 2do rectangulo");
        coo1=sc.nextDouble();
        coo2=sc.nextDouble();
        
        System.out.println("Ingrese la esquina opuesta del 2do rectangulo");
        coo3=sc.nextDouble();
        coo4=sc.nextDouble();
        b=new Rectangulo(new Coordenada(coo1, coo2),new Coordenada(coo3,coo4));
        
        System.out.println(Verificador.esSobrePos(a, b));
        System.out.println(Verificador.esJunto(a, b));
        System.out.println(Verificador.esDisjunto(a, b));
        
        //CONTENEDOR DE RECTANGULOS
        
        ContainerRect container = new ContainerRect(3);
        
        Rectangulo r1= new Rectangulo(new Coordenada(1.2, 3.6), new Coordenada());
        Rectangulo r2= new Rectangulo(new Coordenada(6.8,2.9),new Coordenada(-2.5, 8.3)) ;
        Rectangulo r3= new Rectangulo(new Coordenada(), new Coordenada(-8.6, 1.2));
        Rectangulo r4= new Rectangulo(new Coordenada(), new Coordenada(-5, -3));
        
        container.addRectangulo(r1);
        container.addRectangulo(r2);
        container.addRectangulo(r3);
        container.addRectangulo(r4);
        System.out.println(container.toString());
    }

}
