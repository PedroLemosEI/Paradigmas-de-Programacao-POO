package Store;

public class User {
    protected String name;
    protected int age;
    protected String email;
    
    public User(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
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
        this.age =  age;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(){
        this.email = email;
    }
}
