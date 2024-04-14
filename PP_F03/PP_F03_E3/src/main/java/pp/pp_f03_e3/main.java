package pp.pp_f03_e3;

public class main {
    /*
    Elemento mais repetido
    Maior Elemento
    Menor Elemento
    */
    
    
    
    public static void main(String[] args) {
        
        int[][] matriz = {{4,5,3},{1,7,9},{21,52,4},{2,4,8}};
        
        int bigger = matriz[0][0];
        int minor = matriz[0][0];
        int rep = 0;
        int norm = 0;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j <matriz[0].length; j++){
                
                int reps = repetidos(matriz[i][j], matriz);
                
                if(matriz[i][j] >= bigger){
                    bigger = matriz[i][j];
                }
                if(matriz[i][j] <= minor){
                    minor = matriz[i][j];
                }
                if(reps >= rep){
                    rep = reps;
                    norm = matriz[i][j];
                }
            }
        }
        System.out.println("O maior numero do array é " + bigger);
        System.out.println("O menor número do array é " + minor);
        System.out.println("O número que mais se repete é " + norm + " repete-se " + rep + " vezes.");
    }
    
    private static int repetidos(int numero, int[][] array){
        int counter = 0;
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j] == numero){
                    counter++;
                }
            }
        }
        return counter;
    }
}
