
package pt.ipp.estg.pp.helloworldapp;

/* 
*   @author Pedro Lemos
*   @brief Primeiro programa criado em java.
*/
public class HelloWorld {

    public static void main(String[] args) {
        
        // Primeira linha em Java (print)
        System.out.println("Hello World!");
        //==================================
        
        // Valores Primitivos ==============
        int a = 10;
        char random = 'A';
        
        System.out.println(a);
        System.out.println(random);
        //==================================        
        
        // Arrays ==========================
        int[] lista = {20, 30, 40, 50};
        
        System.out.println(lista[0]);
        System.out.println(lista[1]);
        System.out.println(lista[2]);
        System.out.println(lista[3]);
        //==================================
        
        // EX #3 ===========================
        boolean CanITakeHisMoney;
        int hisbalance = 5;
        long mybalance = 4;
        hisbalance += 8;
        CanITakeHisMoney = hisbalance > mybalance;
        CanITakeHisMoney = CanITakeHisMoney & (hisbalance >= 3);
        System.out.println(CanITakeHisMoney);        
        //==================================
        
        // EX #4 ===========================
        int v = 0;
        v++;
        int amount = v++;
        System.out.println(++v + " " + amount);
        System.out.println(v);
        //==================================
        
        // EX 5 ============================
        long x = 0;
        System.out.println(x);
        x = 3;
        System.out.println(x);
        boolean y = false;
        System.out.println(y);
        //==================================
        
        // EX 6 ============================
        double num1;
        int num2;
        //System.out.println(num1); 
        /* ^^Como não existe valor associado
        * ao objeto instanciado o compilador não
        * consegue dar print ás variaveis
        */
        //==================================
        
        
        
    }
    
}