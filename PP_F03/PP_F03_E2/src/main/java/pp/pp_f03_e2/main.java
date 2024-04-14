
package pp.pp_f03_e2;

public class main {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,28};
        
        int div = 1;
        
        for(int  x = 0; x < numbers.length; x++){
              
            if (primos(numbers[x]) && numbers[x] != 1){
                System.out.println(numbers[x] + " é primo");
            }
            if (verdadeiros(numbers[x])){
                System.out.println(numbers[x] + " é perfeito");
            }
        }
    }
    
    // São primos todos os numeros diferentes de 1 que são apenas divisiveis por 1 e por eles próprios
    private static boolean primos(int numero){
        for(int y = 2; y < numero;  y++){
            // Verifica se o resto da divisão é 0 com outro número diferente do numero dado
            if(numero % y == 0 ){
                return false;
            }
        }
        return true;
    }
    
    
    // Numeros são perfeitos se e só se são iguais á soma dos seus divisores próprios 
    private static boolean verdadeiros(int numero){
        int soma = 0;
        
        for(int z = 1; z < numero; z++){
            // Verifica os divisores próprios de um numero e soma os mesmos
            if(numero % z == 0){
                soma = soma + z;
            }
        }
        // Se a soma dos divisores for igual ao numero é perfeito
        if(soma == numero){
            return true;
        }
        else{
            return false;
        }
    }
    
}
