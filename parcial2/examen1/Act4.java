package parcial2.examen1;

public class Act4 {
    public static void main(String[]args){

        int[][] a = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 9, 6}
        };

        for (int i = 0; i < a.length; ++i){
            a[i][i] = 0;
        }

        System.out.println("Matriz 3x3 con la diagonal en ceros: ");
    
        for (int i = 0; i < 3; ++i){
            for (int j = 0; j < 3; ++j){
                System.out.print("|"+a[i][j]+ "|");
            }
            System.out.println();
        }
    }
}

