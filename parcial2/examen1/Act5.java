package parcial2.examen1;

import java.util.Random;

public class Act5 {
    public static void main (String[]args){
        
        Random n = new Random();

        int[][] a =  new int [8][8];
        System.out.println("Matriz A:");
      
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                a [i][j] = n.nextInt(5);
                System.out.print( "|"+a[i][j]+ "|");
            }
        System.out.println(" ");
        }

        int[][] b =  new int [8][8];
        System.out.println("Matriz B:");
      
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                b [i][j] = n.nextInt(5);
                System.out.print( "|"+b[i][j]+ "|");
            }
        System.out.println(" ");;
        }

        int[][] c =  new int [8][8];;
        System.out.println("Matriz C:");

        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
             c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
        System.out.print( "|"+c[i][j]+ "|");
            }
        System.out.println(" ");
        }

    }
}
