package CD;

import Artists.Artist;
import Tracks.Track;

public class CD {
    protected String groupName;
    protected String cdName;
    protected int time;
    protected String releaseDate;
    protected String publisher;
    protected Artist[] artists;
    protected Track[] tracks = new Track[15];
    protected double price;
    
    // Palavra reservada "this." ainda não introduzida
    public CD(String tmpGname, String tmpCDname, int tmpTime, String tmpReleaseDate, String tmpPublisher, Artist[] tmpArtists/*, Track[] tmpTracks*/, double tmpPrice){
        this.groupName = tmpGname;
        this.cdName = tmpCDname;
        this.time = tmpTime;
        this.releaseDate = tmpReleaseDate;
        this.publisher = tmpPublisher;
        this.artists = tmpArtists;
        //this.tracks = tmpTracks;
        this.price = tmpPrice;
                
    }
    
    public double getPrice(){
        return this.price;
    }         
    
}
