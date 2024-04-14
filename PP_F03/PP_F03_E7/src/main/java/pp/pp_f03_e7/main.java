
package pp.pp_f03_e7;

import static java.lang.System.exit;

public class main {

    public static void main(String[] args) {
        int dividendo = 0, divisor = 0, quociente = 0;
        
        try{
            //O primeiro argumento passado correnponde ao dividendo
            //dividendo = Integer.valueOf(args[0]);
            //O segundo argumento passado correnponde ao divisor
	    //divisor = Integer.parseInt(args[1]);
            
            // Valores de teste no IDE
            dividendo = 14;
            divisor = 7;
            
            if (divisor == 0) {
		System.out.println("Não se pode dividir por zero");
		exit(0);
            }
            
            // uma variável auxiliar para ajudar no cálculo (sendo que o dividendo vais ser subtraido)
            // COPIA O VALOR ORIGINAL DO DIVIDENDO PARA DAR PRINT DO MESMO ABAIXO
            int n = dividendo;
            
            // CICLO QUE SUBTRAI O DIVISOR AO DIVIDENDO E ACRESHENTA AO CONTADOR "quociente"
            // QUOCIENTE DA DIVISAO É IGUAL AO NUMERO DE VEZES QUE O DIVISOR PODE SER SUBTRAIDO 
            while (dividendo >= divisor) {
		dividendo -= divisor;
		quociente++;
            }
            
            // Resultado da operação. DIVIDENDO equivale ao RESTO após ser subtraido
            System.out.printf("A divisão inteira de %d por %d é %d, com o resto %d\n", n, divisor, quociente, dividendo);
            
        }
        catch(Exception ex){
            System.out.println("Os valores terão que ser inteiros");
        }
    }
}
