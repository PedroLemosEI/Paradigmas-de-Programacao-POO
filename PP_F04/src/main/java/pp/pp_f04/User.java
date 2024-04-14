package pp.pp_f04;

public class User {
    private static final int ID_SIZE = 3;
    protected static char[] id = new char[ID_SIZE];
    protected static char[] name;
    protected static char[] email;
    protected static Expenses expenses;
    
    public static void printExpenses(double arr[]){
        int counter = 1;
        for(int i=0; i < arr.length; i++){
            System.out.println("Day "+ counter + ": " + arr[i]);
            counter++;
        }
       
    }
    
    public static double totalExpenses(double arr[]){
        double sum = 0;
        
        for(int i=0; i <arr.length; i++){
            sum += arr[i];
        }
        
        return sum;
    }
    
    public static double averageExpenses(double arr[]){
        double sum = 0;
        
        for(int i=0; i <arr.length; i++){
            sum += arr[i];
        }
        
        double media = sum / arr.length; 
        
        return media;
    }
    
    public static void printDescription(char desc[]){
        for(char i : desc){
            System.out.print(i);
        }
    }
}
