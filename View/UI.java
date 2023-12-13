package View;

import java.util.Scanner;

public class UI {
    public static int readInt(String msg) {
        int numEleccion = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println(msg + ": ");
        try {
            numEleccion = teclado.nextInt();
        } catch (Exception e){
            teclado.nextLine();
            System.out.println("Debes introducir un número entre los comprendidos anteriormente");
        }
        return numEleccion;
    }

    public static String readString(String msg) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(msg + ": ");
        return teclado.nextLine();
    }

    public static void pressEnter(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pulse intro para continuar.");
        teclado.nextLine();
    }
}

