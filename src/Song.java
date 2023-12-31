import java.util.ArrayList;

public class Song {
    private String title;
    private int lengthInSeconds;
    private ArrayList<String> artists = new ArrayList<String>();
    public Song(String title, int lengthInSeconds, Artist[] artists) {
        this.title = title;
        this.lengthInSeconds = lengthInSeconds;
        for (Artist artist : artists){
            this.artists.add(artist.getName());
        }
    }

    public void playSong() {
        System.out.println(title + " (" + lengthInSeconds / 60 + ":" +  String.format("%02d", lengthInSeconds % 60)  + ")");
        for(String artistName : artists)
            System.out.println("\t- " + artistName);
    }

    public String getTitle() {
        return title;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public ArrayList<String> getArtists() {
        return artists;
    }
}
