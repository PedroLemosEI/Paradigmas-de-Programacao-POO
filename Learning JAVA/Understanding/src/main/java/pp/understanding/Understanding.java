
package pp.understanding;


public class Understanding {   
    public static void main(String[] args) {
        String[][] cars = {{"Peugeot","Renault"},{"106","Clio"}}; 
        
        for (String[] x : cars) {
            for (String y : x) {
                System.out.printf(y +"\n");
            }
        }
        
    
    }
    
}
