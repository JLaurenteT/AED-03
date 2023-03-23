
import java.util.Scanner;


public class Ejercicio1parte2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana");
        String dia = sn.next();
        String horario="";
        DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());
        switch (diaS) {
            case LUNES:
                horario="11:30-1:30am\tADS\n1:30-3:00pm\tEDA\n3:00-4:30pm\tSIA\n7:00-9:00pm\tEDA\n";
                break;
            case MARTES:
                horario="7:00-9:00am\tSIA\n1:30-3:00pm\tRedes II\n";
                break;
            case MIERCOLES:
                horario="9:00-11:00am\tRedes II\n11:30-1:30pm\tEDA\n1:30-3:00pm\tADS\n5:00-7:00pm\tADS\n7:00-9:00pm\tEDA\n";
                break;
            case JUEVES:
                horario="11:00-1:00pm\tRedes II";
                break;
            case VIERNES:
                horario="No tienes clases";
                break;
            case SABADO:
                horario="7:15-8:45\tESTADISTICA\n3:00-4:30\tESTADISTICA\n";
                break;
            case DOMINGO:
                horario="No tienes clases";
                break;
                
        }
        System.out.println(horario);
    }
}
