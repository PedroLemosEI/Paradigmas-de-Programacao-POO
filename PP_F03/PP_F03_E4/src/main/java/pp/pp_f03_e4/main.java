package pp.pp_f03_e4;

public class main{

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("O valor em radianos é " + findRads(x));
    }

        
    private static double findRads(int num){
        double pi= Math.PI;
        double rad = num * pi / 180;
            
        return rad;
    }        
}
   
