package pp.pp_f04.book;

public class BookDemo {

    public static void main(String[] args) {
        
        //Autores...
        //#1
        Authors autor1 = new Authors();
        autor1.acrônimo = "JS";
        autor1.nacionalidade = "PT";
        autor1.nome = "José Saramago";
        //#2
        Authors autor2 = new Authors();
        autor2.acrônimo = "FP";
        autor2.nacionalidade = "PT";
        autor2.nome = "Fernando Pessoa";
        
        Authors[] autores = {autor1, autor2};
        
        //Array de avaliações
        int[] avaliações1 = {8,7,9};
        int[] avaliações2 = {5,6,6};
        
        //Livros...
        Book livro1 = new Book();
        livro1.title = "I DONT KNOW!";
        livro1.Editor = "Porto Editora";
        livro1.authors = autores;
        livro1.Year = 1995;
        livro1.pages = 321;
        livro1.Ratings = avaliações1;
        
        Book livro2 = new Book();
        livro2.title = "I DONT KNOW! The Sequel";
        livro2.Editor = "Porto Editora";
        livro2.authors = autores;
        livro2.Year = 1996;
        livro2.pages = 430;
        livro2.Ratings = avaliações2;
        
        
        //PRINTS
        printBookInfo(livro1);
        printBookInfo(livro2);
        
        
        
    }
    
    private static void printBookInfo(Book book){
        System.out.println("====================================");
        System.out.println(book.title);
        System.out.println(book.Editor);
        book.printAuthorsInfo(book.authors);
        System.out.println("Ano: " + book.Year);
        System.out.println("Páginas: " + book.pages);
        book.printRatings(book.Ratings);
    }
    
}
