package CD;

import Author.Author;
import Artists.Artist;
import Tracks.Track;

public class CDDemo {

    public static void main(String[] args) {
        Artist a1 = new Artist("Artista 1", "Português", "1995-04-16");
        Artist[] artists = {a1};
        
        Author au1 = new Author("Autor 1", 32, "Rua 1", 111222333, "PT50...");
        Author au2= new Author("Autor 2", 45, "Rua 20", 444555666, "LU30...");
        Author[] autores = {au1, au2};
                
        Track t1 = new Track(1, "Track 1", 90, autores);
        Track t2 = new Track(2, "Track 2", 180, autores);
        
        CD cd = new CD("GroupName", "CDname", 1312, "2024-04-16", "ThePublisher", artists, 12.50);
        cd.tracks[0] = t1;
        cd.tracks[14] = t2;
        
        System.out.println("Nome do CD: " + cd.cdName);
        System.out.println("Ano de lançamento: " + cd.releaseDate);
        System.out.println("Editora: " + cd.publisher);
        
        for(Track t : cd.tracks){
            if(t != null){
                System.out.println("Música número: " + t.getNumber() + " com título: " + t.getName());
                System.out.println("Duração(segundos): " + t.getDuration());
                for(Author a : t.getAuthorArr()){
                    System.out.println("\n==============================================");
                    System.out.println("Nome do Autor: " + a.getName());
                    System.out.println("Idade do Autor: " + a.getAge());
                    System.out.println("Morada do Autor: " + a.getAddress());
                    System.out.println("NIF do Autor: " + a.getNIF());
                    System.out.println("NIB do Autor: " + a.getNIB());
                    System.out.println("==============================================");
                }
            }
        }
        
        
    }
    
}
