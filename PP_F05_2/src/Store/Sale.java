package Store;

import CD.CD;

public class Sale {
    private static int nextid = 0;
    protected int id;
    protected User customer;
    protected String date;
    protected CD[] cds;
    private double price;
    
    public Sale(String date, User customer, CD[] cds, double price){
        this.id = ++nextid;
        this.customer = customer;
        this.date = date;
        this.cds = cds;
        this.price = price;
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getDate(){
        return this.date;
    }
    
    public CD[] getCDs(){
        return this.cds;
    }
    
    public double getPrice(){
        int sum = 0;
        
        for(CD cd: this.cds){
            sum += cd.getPrice();
        }
        
        return sum;
    }
    
}
