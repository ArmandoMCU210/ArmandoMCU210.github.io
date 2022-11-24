package parcial2.tarea5;

public class MatrizTarea4 {
    public static void main(String[]args){

        int[][] a = {
            {-1, 7, 0, 17}, 
            {12, -3, 8, 6}, 
            {2, 9, 3, -4},
            {15, 6, 1, 0}
        };
    
        System.out.println("Matriz 4x4:");
     
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.print("|"+a[i][j]+ "|");
            }
             System.out.println();
        }
       
        System.out.println("La diagonal principal es:");

        for (int l = 0; l < 4; ++l) {
             System.out.print(a[l][l]+" ");
        }
    }
}
