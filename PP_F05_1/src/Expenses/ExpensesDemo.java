package Expenses;

public class ExpensesDemo {

    public static void main(String[] args) {
        
        Expense e1 = new Expense("Car", 112, "12/04/2024");
        Expense e2 = new Expense("Food", 25, "13/04/2024");
        Expense e3 = new Expense("Utilities", 12, "13/04/2024");
        Expense e4 = new Expense("Electric Bills", (float) 20.55, "14/04/2024");
        Expense e5 = new Expense("Bus Pass", (float) 40.5, "14/04/2024");
        
        Expense[] expenses1 = {e1, e2, e3};
        Expense[] expenses2 = {e4, e5, e2};
        
        User user1 = new User("Pedro Lemos", "pl@email.com", "03/03/1999", expenses1);
        User user2 = new User("Sara Sousa", "ssss@email.com", "02/03/2004", expenses2);
        
        //>>>USER 1<<<
        System.out.println("\n======USER 1======");
        System.out.println("Nome: " + user1.nome);
        System.out.println("Email: " + user1.email);
        System.out.println("Data de Nascimento: " + user1.birthDate);
        user1.printExpenses(expenses1);
        
        //>>>USER 2<<<
        System.out.println("\n======USER 2======");
        System.out.println("Nome: " + user2.nome);
        System.out.println("Email: " + user2.email);
        System.out.println("Data de Nascimento: " + user2.birthDate);
        user2.printExpenses(expenses2);
        
        
        
        //===============================EXERCICIO 1.4==============================
        /*Para que o ficheiro main pudesse executar os comandos ou instanciar alguma
        das classes apartir de um novo pacote ou a visibilidade teria de ser public 
        ou teria de importar as classes no package expenses pois os atuais 
        modificadores permitem vivibilidade apenas no mesmo package */
        //==========================================================================
    }
    
}
