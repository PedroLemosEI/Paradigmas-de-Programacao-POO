package pp.pp_f04;

public class Expenses {
    private static final int NUMBER_OF_DAYS = 31; //Março
    
    //Despesas Automóvel
    protected static int number1;
    /*
    *Vetor com o valor das despesas do automóvel durante o dia do mês
    *(O indice do vetor corresponde ao dia do mês)
    */
    protected static double[] carValues = new double[NUMBER_OF_DAYS]; //...em euros €€€
    protected static char[] descriptionCar = new char[]{'C','A','R'}; 
    
    //Para despesas alimentares
    protected static int number2;
    protected static double[] foodValues = new double[NUMBER_OF_DAYS]; //...em euros €€€
    protected static char[] descriptionFood = new char[]{'F','O','O','D'};
    
    
}
