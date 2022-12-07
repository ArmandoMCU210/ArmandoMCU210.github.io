package parcial2.examen1;

import java.util.Scanner;

public class Act2 {
    public static void main (String[]args){

        try (Scanner num = new Scanner(System.in)) {
            System.out.print("Ingresa la base del triangulo: ");
            int B = num.nextInt();

            try (Scanner num1 = new Scanner(System.in)) {
                System.out.print("Ingresa la altura del triangulo: ");
                int A = num1.nextInt();

                int F = 0;

                F = B * A / 2;

                System.out.println("El area del triangulo es: " + F);
            }
        }
    }
}
