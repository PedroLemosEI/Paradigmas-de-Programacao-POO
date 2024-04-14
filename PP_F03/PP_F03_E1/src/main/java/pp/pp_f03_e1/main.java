package pp.pp_f03_e1;

public class main {

    public static void main(String[] args) {
        // matrix [][] - [linhas][colunas]
        // temos uma matriz com 2 linhas e 3 colunas
        int[][] matriz = {{1,2,3},{1,2,3}};
        // a transposta terá 3 linhas e 2 colunas
        //int[][] transposta = new int [3][2];
        
        // numero de linhas ou elementos da matriz
        int linhas = matriz.length;
        // numero de elementos dentro do elemento 0 = numero de colunas
        int colunas = matriz[0].length;
        // Linhas = 2, pois tem 2 elementos ({1,2,3} e {1,2,3})
        System.out.println("Números de linhas da  matriz: " + linhas);
        System.out.println("Números de colunas da matriz: " + colunas);
        // sendo transposta o numero de linhas/colunas da matriz original mudam de lugar
        int[][] transposta = new int[colunas][linhas];
        
        // SE NA TRANSPOSTA:   A[j][i] = B[i][j]
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                transposta[j][i] = matriz[i][j]; 
            }
        }
        
        System.out.println("\nResultado:\n");
        // Print result
        for(int i = 0; i < transposta.length; i++){
            for(int j = 0; j < transposta[0].length; j++){
                System.out.println(transposta[i][j]);
            }
        }
        
        System.out.println("\nOriginal:\n");
        // Print matriz original para comparação
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.println(matriz[i][j]);
            }
        }
        
    }
    
}
