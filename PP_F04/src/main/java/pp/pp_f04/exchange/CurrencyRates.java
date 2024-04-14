
package pp.pp_f04.exchange;

public class CurrencyRates {
    
    //1st option = 2D array
    
    //          |   dollar    | euro    |   iene    |   GBP   |
    //_________________________________________________________
    //dollar    |   1.00000   | 0.76900 |  96.1141  | 0.67131 |
    //euro      |   1.30030   | 1.00000 |  124.989  | 0.87290 |
    public static final double[][] conversions = {{1.00000, 0.76900, 96.1141, 0.67131}, {1.30030, 1.00000, 124.989, 0.87290}};
    
    //2nd option
    /*
    public static final double dollarTOdollar = 1.00000;
    public static final double dollarTOeuro = 0.76900;
    public static final double dollarTOiene = 96.1141;
    public static final double dollarTOgbp = 0.67131;
    
    public static final double euroTOdollar = 1.30030;
    public static final double euroTOeuro = 1.00000;
    public static final double euroTOiene = 124.989;
    public static final double euroTOgbp = 0.87290;
    */
    // valores de iene incorretos
    
    
    public static void convertCurrency(double[] values, char type, char newType){
        
        double conversion;
        
        for(double element: values){
            conversion = convert(element, type, newType);
            System.out.println(conversion);
        }
        
    }
    
    private static double convert(double value, char type, char newType){
        
        double conv;
        
        
        switch(type){
                case 'd': case 'D':
                    switch(newType){
                        case 'd': case 'D':    
                            conv =  value * conversions[0][0];
                            return conv;
                        
                        case 'e': case 'E':
                            conv = value * conversions[0][1];
                            return conv;
                            
                        case 'i': case 'I':
                            conv = value * conversions[0][2];
                            return conv;
                            
                        case 'p': case 'P':
                            conv = value * conversions[0][3];
                            return conv;
                            
                        default:
                            System.out.println("Choose wanted conversion currency correctly!");
                            break;
                            
                    }
                    break;
                
                case 'e': case 'E':
                    switch(newType){
                        case 'd': case 'D':
                            conv = value * conversions[1][0];
                            return conv;
                        
                        case 'e': case 'E':
                            conv = value * conversions[1][1];
                            return conv;
                            
                        case 'i': case 'I':
                            conv = value * conversions[1][2];
                            return conv;
                            
                        case 'p': case 'P':
                            conv = value * conversions[1][3];
                            return conv;
                            
                        default:
                            System.out.println("Choose wanted conversion currency correctly!");
                            break;
                            
                    }
                    break;
                        
                default:
                    System.out.println("Choose current currency correctly. d/D = dollar || e/E = euro.");
                    break;
                    
        }
        return 0;
    }
}
