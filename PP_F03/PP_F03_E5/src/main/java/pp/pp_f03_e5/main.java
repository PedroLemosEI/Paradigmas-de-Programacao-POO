package pp.pp_f03_e5;

public class main {

    public static void main(String[] args) {
        
        // java can also convert strings to double >> EXAMPLE:
        //double dollars = Double.parseDouble(args[0]);
        //int cents = Integer.parseInt(args[0]);
        
        double val = Double.parseDouble(args[0]);      
        double dollars = convertCurrency(val, 'e');        
        double euros = convertCurrency(val, 'd');  
        
        System.out.println(val + " em euros é igual a " + dollars + " em dollars");
        System.out.println(val + " em dollars é igual a " + euros + " em euros");
    }
    
    // 12/04/2022 >> Dollar = 0.92 Euro  && Euro = 1.09 Dollar
    private static double convertCurrency(double value, char type){

        double converted;
        if(type == 'e' || type == 'E'){
            converted = value * 1.09;
            return converted;
        } 
        else if(type == 'd' || type == 'D'){
            converted = value * 0.92;
            return converted;
        }
        else{
            System.out.println("Tipo Inválido!");
            return 0;
        }
        
    }
}
