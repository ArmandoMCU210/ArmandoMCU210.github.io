package parcial2.tarea5;

public class MatrizTarea3 {
    public static void main(String[] args){

        int[][] a = {
            {1, 1}, 
            {1, 1}, 
        };
        System.out.println("Matriz A:");
      
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.print( "|"+a[i][j]+ "|");
            }
                        System.out.println(" ");;
        }

        int[][] b = {
            {1, 1}, 
            {1, 1}, 
        };
        System.out.println("Matriz B:");
      
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.print( "|"+b[i][j]+ "|");
            }
                        System.out.println(" ");;
        }

        int[][] c = {
            {0, 0}, 
            {0, 0}, 
        };
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
                        System.out.println(" ");;
        }

    }
}
