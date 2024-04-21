package Tracks;

import Author.Author;

public class Track {
    protected int number;
    protected String name;
    protected int duration; //Seconds
    protected Author[] author = new Author[5];
    
    public Track(int tmpNumber, String tmpName, int tmpDuration, Author[] tmpAuthor){
        this.number = tmpNumber;
        this.name = tmpName;
        this.duration = tmpDuration;
        this.author = tmpAuthor;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getDuration(){
        return this.duration;
    }
    
    public void setDuration(int duration){
        this.duration = duration; 
    }
    
    public Author[] getAuthorArr(){
        return this.author;
    }
}
