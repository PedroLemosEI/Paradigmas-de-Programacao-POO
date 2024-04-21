package Expenses;

/** <h1> Classe utilizada para armazenar a informação relativa a um {@link User} */
public class User {
    private static int nextId = 1;
    
    /** Tamanho por omissão, dimensão, definido para a criação do array {@link Expense}*/
    protected final int EXPENSES_SIZE = 31;
    
    /** Número de identificação do {@link User}*/
    protected int id;
    
    /** Nome do {@link User}*/
    protected String nome;
    
    /**Email do {@link User}*/
    protected String email;
    
    /** Data de nascimento do {@link User}*/
    protected String birthDate;
    
    /** Array com o conjunto de {@link Expense} do {@link User}*/
    protected Expense[] expenses;
    
    /**
     * Construtor do {@link User} que inicializa o array de {@link Expense} com o tamanho por omissão {@value EXPENSES_SIZE}
     * 
     * @param tempNome nome do {@link User}
     * @param tempEmail email do {@link User}
     * @param tempBirthDate data de nascimento do {@link User}
     * @param arr array de despesas associadas a {@link User}
     */
    public User(String tempNome, String tempEmail, String tempBirthDate, Expense[] arr){
        expenses = new Expense[EXPENSES_SIZE];
        id = nextId++;
        nome = tempNome;
        email = tempEmail;
        birthDate = tempBirthDate;
        expenses = arr;
    }
    
    public void printExpenses(Expense[] arr){
        for(Expense elem : arr){
            System.out.println(">>Expense ID:" + elem.id);
            System.out.println(">>Expense Type:" + elem.type);
            System.out.println(">>Expense Amount:" + elem.amount);
            System.out.println(">>Expense date:" + elem.date);
        }
    }
}
