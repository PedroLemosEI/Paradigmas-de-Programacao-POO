package Artists;

public class Artist {
    protected String nome;
    protected String nacionalidade;
    protected String dataNascimento;
    
    public Artist(String tmpNome, String tmpNacionalidade, String tmpDataNascimento){
        nome = tmpNome;
        nacionalidade = tmpNacionalidade;
        dataNascimento= tmpDataNascimento;
    }
}
