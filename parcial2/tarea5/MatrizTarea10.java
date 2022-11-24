package parcial2.tarea5;

import java.util.Scanner;

public class MatrizTarea10 {
    public static void main (String[]args){
        try (Scanner num = new Scanner(System.in)) {
            System.out.print("Ingrese un valor: ");
            int n=num.nextInt();
      
            int a [][]={
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
            };
            System.out.println("Matriz Escalar:");
            
            for (int i = 0; i < a.length; ++i){
                a[i][i] = n;
            }

            for (int i = 0; i < 4; ++i){
                for (int j = 0; j < 4; ++j){
                    System.out.print("|"+a[i][j]+ "|");
                }
                System.out.println();
            }
        }
    }
}
