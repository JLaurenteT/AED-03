
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pacientes = "\nLista de pacientes:\n";
        String nombre="", apellido="", padecimiento="";
        int edad, contador = 0;
        System.out.println("Ingrese la cantidad de pacientes que registrara");
        contador = sc.nextInt();
        for (int i = 0; i < contador; i++) {
            nombre=apellido=padecimiento="";
            System.out.println("Ingrese el nombre");
            nombre = sc.next();
            System.out.println("Ingrese el apellido");
            apellido = sc.next();
            System.out.println("Ingrese la edad");
            edad = sc.nextInt();
            System.out.println("Ingrese el padecimiento");
            sc.nextLine();
            padecimiento = sc.nextLine();
            pacientes+="Nombre:\t\t"+nombre+"\n"+"Apellido:\t"+apellido+"\n"+"Edad:\t\t"+edad+"\n"+"Padecimiento:\t"+padecimiento+"\n\n";
            
        }
        System.out.println(pacientes);
    }
}
