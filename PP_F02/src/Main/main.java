package Main;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        //================================EX1===================================
        char[] sentence = {'e', 'u', ' ',
                            's', 'o', 'u', ' ',
                            'a', 'l', 'u', 'n', 'o', ' ',
                            'd', 'a', ' ',
                            'E', 'S', 'T', 'G', 'F', '.'};
        
        for(int i = 0; i<sentence.length; i++){
            System.out.println(sentence[i]);
        }
        //======================================================================
        
        //================================EX2===================================
        int[][] array = {{11, 7, 333}, {-20, -23, 63}, {-22, 501, 10000}};
        int sum = 0;
        int media = 0;
        int tam = 0;
        
        // for each loop >> for each unidimensional array (arr[]) in array...
        for(int arr[] : array){
            // for each element(i) in arr(unidimensional array)
            for(int i : arr){
                sum += i;
                tam += 1;
            }
        }
        
        media = sum / tam;
        
        System.out.println(sum);
        System.out.println(media);
        //======================================================================
        
        //================================EX3===================================
        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        int soma = 0;
        int mult = 1;
        int neg = 0;
        int max = 0;
        
        for(int i = 0; i < lista.length; i++){
            if(lista[i]> max){
                max = lista[i];
            }
            
            if (lista[i] > 0){
                soma += lista[i];
                mult *= lista[i];
            }
            
            else if(lista[i] < 0){
                neg += 1;
            }          
        }
        
        System.out.println("A soma é " + soma);
        System.out.println("A multiplicação é " + mult);
        System.out.println("O array tem " + neg + " números negativos");
        System.out.println("Máximo: " + max);
        //======================================================================
        
        //================================EX4===================================
        char[] nome = {'A', 'n' , 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
        
        nome[3] = ',';
        int cons = 0;
        int vog = 0; 
        
        for(int j = 0; j < 6; j++){
            System.out.print(nome[4+j]);            
        }
        System.out.print(nome[3]);
        
        for(int h = 0; h < 3; h++){
            
            System.out.print(nome[h]);
            
        }
        System.out.println(" ");
        
        for(int i = 0; i < nome.length; i++){
            // Print em vez de Println
            System.out.print(nome[i]);  
            
            // Vogais e Consoantes
            switch (nome[i]) {
                case 'a':
                    vog += 1;
                    break;
                case 'A':
                    vog += 1;
                    break;
                case 'e':
                    vog += 1;
                    break;
                case 'E':
                    vog += 1;
                    break;    
                case 'i':
                    vog += 1;
                    break;
                case 'I':
                    vog += 1;
                    break;    
                case 'o':
                    vog += 1;
                    break;
                case 'O':
                    vog += 1;
                    break;    
                case 'u':
                    vog += 1;
                    break;
                case 'U':
                    vog += 1;
                    break;    
                default:
                    cons += 1;
                    break;
            }
            
        }   
        System.out.println(vog);
        System.out.println(cons);
        //======================================================================
        
        //================================EX5===================================
        /*
        Scanner scan= new Scanner(System.in);
        String str = scan.nextLine();
        */
        
        
        for(int x = 0; x < args.length; x++){
            System.out.println(args[x]);    
        }
        
        
        //System.out.println(args[0] + "," + args[1]);
        //======================================================================
        
        //================================EX6===================================
        int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] listaB = {6, 99, -1, 12, 1, -2};
        int counter = 0;
        
        int length = listaA.length + listaB.length;
        int[] res = new int[length];
                
        
        for(int i = 0; i < listaA.length; i++){
            res[i] = listaA[i];
        }
        for(int j= listaA.length; j < length; j++){
            res[j] = listaB[counter];
            counter++;        
        }
            
        
        
        
        for(int h = 0; h < res.length; h++){
            System.out.print("   " + res[h]);
        }
        System.out.println(" ");
        
        //===========================================================================================================================
        //Copia os elementos da listaA para um novo array "temp" com o tamanho "listaA.length + listaB.length"
        int[] temp = Arrays.copyOf(listaA, listaA.length + listaB.length);
        //Copia os  elementos da listaB desde o index 0 até "listaB.length" para "temp" a partir do index "listaA.length"
        System.arraycopy(listaB, 0, temp, listaA.length, listaB.length);
        
        for(int x = 0; x < temp.length; x++){
            System.out.print("   " + temp[x]);
        }
        //===========================================================================================================================
    }
    
}
