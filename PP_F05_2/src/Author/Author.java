package Author;

public class Author {
    protected String name;
    protected int age;
    protected String address;
    protected long nif;
    protected String nib;
    
    public Author(String tmpName, int tmpAge, String tmpAddress, long tmpNIF, String tmpNIB){
        this.name = tmpName;
        this.age = tmpAge;
        this.address = tmpAddress;
        this.nif = tmpNIF;
        this.nib = tmpNIB;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;        
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public long getNIF(){
        return this.nif;
    }
    
    public void setNIF(long nif){
        this.nif = nif;
    }
    
    public String getNIB(){
        return this.nib;
    }
    
    public void setNIB(String nib){
        this.nib = nib;
    }
}
