
package pp.pp_f03_e6;

public class main {

    public static void main(String[] args) {
        //double cents = Double.parseDouble(args[0]);
        double cents = 5324;
        double converted = convertCents(cents);
        

        System.out.println(cents + " centimos e igual a " + converted + " euros");
        
    }
    
    private static double convertCents(double cents){
        double euros = cents / 100;
        return euros;
    
    }
    
}
