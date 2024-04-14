package pp.pp_f03_e8;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        double valor = 12.1;
        double number = valor;
        
        // CONTADORES
        int doisE = 0;
        int umE = 0;
        int cinqC = 0;
        int vinteC = 0;
        int dezC = 0;
        int cincoC = 0;
        int doisC = 0;
        int umC = 0;
        
        
        // POR ALGUMA RAZÃO >= NÃO FUNCIONA BEM
        while (valor > 0) {

            if (valor > 1.99) {
                valor -= 2;
                doisE++;

            } else if (valor > 0.99) {
                valor -= 1;
                umE++;

            } else if (valor > 0.49) {
                valor -= 0.5;
                cinqC++;

            } else if (valor > 0.19) {
                valor -= 0.2;
                vinteC++;

            } else if (valor > 0.09) {
                valor -= 0.1;
                dezC++;

            } else if (valor > 0.04) {
                valor -= 0.05;
                cincoC++;

            } else if (valor > 0.01) {
                valor -= 0.02;
                doisC++;

            } else if (valor > 0.00) {
                valor -= 0.01;
                umC++;
            }
        }
        

        System.out.printf("Montante inserido " + number + " -> equivale a:\n");

        System.out.println(doisE + " moedas de dois euros");
        System.out.println(umE + " moedas de um euro");
        System.out.println(cinqC + " moedas de cinquenta cêntimos");
        System.out.println(vinteC + " moedas de vinte cêntimos");
        System.out.println(dezC + " moedas de dez cêntimos");
        System.out.println(cincoC + " moedas de cinco cêntimos");
        System.out.println(doisC + " moedas de dois cêntimos");
        System.out.println(umC + " moedas de um cêntimo");
    }

}
