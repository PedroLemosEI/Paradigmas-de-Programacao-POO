
package helloworld;

//Pacotes Importados
import java.awt.*;
import java.util.*;

public class HiWorld {

    public static void main(String[] args) {
        
    //ISTO FOI O PRIMEIRO EXERCÍCIO QUE TESTA BIBLIOTECAS, METODOS E EXEÇOES
        
        
        try{
            Date data = new Date();
            System.out.println(data.toString());
        }catch(Exception e){
            System.out.println("Algo está errado!");
        }
    
        Locale loc = Locale.getDefault();
        System.out.println (loc.getDisplayLanguage()); // imprime "Português"
        System.out.println (loc.getLanguage()); // imprime "pt"
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Screen width = " + d.width);
        System.out.println("Screen height = " + d.height);
        
        
    
    
    
    
    }
}
