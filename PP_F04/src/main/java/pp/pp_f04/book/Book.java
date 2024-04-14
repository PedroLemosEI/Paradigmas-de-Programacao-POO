package pp.pp_f04.book;

public class Book {
    protected String title;
    protected String Editor;
    protected Authors[] authors = new Authors[2];
    protected int Year;
    protected int pages;
    protected int[] Ratings = new int[3];
    
    public static void printRatings(int[] arr){
        int counter = 0;
        System.out.println("\nRatings...");
        for(int i : arr){
            counter++;
            System.out.println("Avaliação #" + counter + ": " + i);
        }
    }
    
    public void printAuthorsInfo(Authors[] arr){
        int counter = 0;
        for(Authors i : arr){
            counter++;
            System.out.println("\nAutor #" + counter + ":");
            System.out.println("Acrônimo:  " + i.acrônimo);
            System.out.println("Nome: " + i.nome);
            System.out.println("Nacionalidade: " + i.nacionalidade + "\n");
        }
    }
    
    
}


