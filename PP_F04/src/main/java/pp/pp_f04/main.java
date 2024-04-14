package pp.pp_f04;
import pp.pp_f04.exchange.*;

public class main {
    
    // Não é necessário instanciar a classe User
    //...pois ela tem apenas variáveis static que podem ser acedidas com "User.id"
    static User user1;
    static User user2;
    
    public static void main(String[] args) {
        
        //User user2 = null;
        
        // 1. O IDE avisa sobre a tentativa de aceder a uma variavel static ou seja comum a toda a classe.
        
        /*=====================EXERCICIO 1======================================
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        user1.name = new char[]{'P', 'e', 'd', 'r', 'o'};
        user1.email = new char[]{'p', 'l', '@', 'e', 's', 't', 'g', '.', 'i', 'p', 'p', '.', 'p', 't'};
        
        //Segundo User
        user2.id = new char[]{'1', '2', '3'};
        user2.name = new char[]{'M', 'a', 'r', 'i', 'a'};
        user2.email = new char[]{'m', 'c', 'c', '@', 'e', 's', 't', 'g', '.', 'i', 'p', 'p', '.', 'p', 't'};
        ======================================================================*/
        
        //1.2 Foi imprimido o mesmo resultado para os dois objetos, ...
        //...sendo que o modificador static permite que as variáveis sejam acedidas sem instanciar um objeto
        //...e esses valores sao comuns para todos os membros da classe, logo, são imprimidos os mesmos valores
        //...pois as variáveis alteradas são na verdade apenas uma variavel comum.
        
        /*======================================================================
        System.out.println("_____________user1_____________");
        System.out.print("ID: ");
        System.out.println(user1.id);
        System.out.print("Name: ");
        System.out.println(user1.name);
        System.out.print("Email: ");
        System.out.println(user1.email);
        
        System.out.println("_____________user2_____________");
        System.out.print("ID: ");
        System.out.println(user2.id);
        System.out.print("Name: ");
        System.out.println(user2.name);
        System.out.print("Email: ");
        System.out.println(user2.email);
        ======================================================================*/
        
        //1.3 O resultado não é alterado.
        
        
        /*=====================EXERCICIO 2====================================*/
        User.id[0] = 'A';
        User.id[1] = 'B';
        User.id[2] = 'C';
        User.name = new char[]{'P', 'e', 'd', 'r', 'o'};
        User.email = new char[]{'p', 'l', '@', 'e', 's', 't', 'g', '.', 'i', 'p', 'p', '.', 'p', 't'};
        Expenses.carValues = new double[]{123,60,10,20};
        Expenses.foodValues = new double[]{14,30,23,21,12,5,8.5};
        
        System.out.println("_____________user1_____________");
        System.out.print("ID: ");
        System.out.println(User.id);
        System.out.print("Name: ");
        System.out.println(User.name);
        System.out.print("Email: ");
        System.out.println(User.email);
        System.out.print("\nDespesas ");
        User.printDescription(User.expenses.descriptionCar);
        System.out.println(":");
        User.printExpenses(User.expenses.carValues);
        System.out.println("Total: " + User.totalExpenses(User.expenses.carValues));
        System.out.println("Media: " + User.averageExpenses(User.expenses.carValues));
        System.out.print("\nDespesas ");
        User.printDescription(User.expenses.descriptionFood);
        System.out.println(":");
        User.printExpenses(User.expenses.foodValues);
        System.out.println("Total: " + User.totalExpenses(User.expenses.foodValues));
        System.out.println("Media: " + User.averageExpenses(User.expenses.foodValues));
        
        /*2.4 - Caso mudemos a visibilidade das variáveis
        as mesmas deixam de ser acessivéis para outras classes logo
        impossiveis de imprimir sem um método apropriado*/ 
        
        //======================================================================
        
        //=====================EXERCICIO 3======================================
        //.exchange package...
        //3.2 - elementos com visibilidade "protected só são visivéis no mesmo package"
        System.out.println("\nCar expenses conversion...");
        CurrencyRates.convertCurrency(User.expenses.carValues, 'e', 'd');
        System.out.println("\nFood expenses conversion...");
        CurrencyRates.convertCurrency(User.expenses.foodValues, 'e', 'd');
        //======================================================================
        
        /*=====================EXERCICIO 4======================================
        .book package...
        
        ======================================================================*/
        
    }

}


