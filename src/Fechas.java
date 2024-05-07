import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {

        //Pedir fecha al usuario
        System.out.println("Ingrese la primera fecha de nacimiento(DD/MM/AAAA): ");
        Scanner Fecha = new Scanner(System.in);
        String fecha1 = Fecha.nextLine();

        System.out.println("Ingrese la segunda fecha de nacimiento(DD/MM/AAAA): ");
        Scanner Fecha2 = new Scanner(System.in);
        String fecha2 = Fecha2.nextLine();

        //Guardar cada parte del string

        String dia1;
        String mes1;
        String año1;
        dia1 = fecha1.substring(0,2);
        mes1 = fecha1.substring(3,5);
        año1 = fecha1.substring(6,10);

        String dia2;
        String mes2;
        String año2;
        dia2 = fecha2.substring(0,2);
        mes2 = fecha2.substring(3,5);
        año2 = fecha2.substring(6,10);

        //Transformar las fracciones de string en int

        int d1;
        int m1;
        int a1;

        int d2;
        int m2;
        int a2;

        d1 = Integer.parseInt(dia1);
        m1 = Integer.parseInt(mes1);
        a1 = Integer.parseInt(año1);

        d2 = Integer.parseInt(dia2);
        m2 = Integer.parseInt(mes2);
        a2 = Integer.parseInt(año2);

        if(a1<a2){
            System.out.println("La primera persona es mayor");
        }
        if(a1>a2){
            System.out.println("La segunda persona es mayor");
        }

        if((a1==a2)&&(m1==m2)&&(d1==d2)){
            System.out.println("Tienen la misma edad");
        }
        if((a1==a2)&&(m1<m2)){
            System.out.println("La primera persona es mayor");
        }
        if((a1==a2)&&(m1>m2)){
            System.out.println("La segunda persona es mayor");
        }
        if((a1==a2)&&(m1==m2)&&(d1<d2)){
            System.out.println("La primera persona es mayor");
        }
        if((a1==a2)&&(m1==m2)&&(d1>d2)){
            System.out.println("La segunda persona es mayor");
        }


        /*
        int nacimiento1 = (d1+m1+a1); //sumar las partes de las fechas
        int nacimiento2 = (d2+m2+a2);

        //comparar las fechas y mostrar el resultado

        if(nacimiento1 < nacimiento2){
            System.out.println("La persona 1 es mayor");
        }

        if(nacimiento2 < nacimiento1){
            System.out.println("La persona 2 es mayor");
        }

        if(nacimiento1 == nacimiento2){
            System.out.println("Tienen la misma edad");
        }
        */

    }
}
