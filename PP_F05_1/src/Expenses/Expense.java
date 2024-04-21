package Expenses;

/** <h1> Classe utilizada para armazenar a informação relativa a uma {@link Expense} */
public class Expense {
    private static int nextId = 1;
    
    /** Número de indentificação da {@link Expense} */
    protected int id;
    
    /** Tipo da {@link Expense} */
    protected String type;
    
    /** Valor da {@link Expense} */
    protected float amount;
    
    /** Data de realização da {@link Expense} */
    protected String date;
    
    
    /** Método construtor para a criação de uma intância de {@link Expense} */
    public Expense(String tmpType ,float tmpAmount ,String tmpDate){
        id = nextId++;
        type = tmpType;
        amount = tmpAmount;
        date = tmpDate;
        
    }
}
