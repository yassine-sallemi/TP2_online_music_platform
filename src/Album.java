import java.util.ArrayList;

public class Album {
    private ArrayList<Song> songs = new ArrayList<Song>();
    private String title;
    private String artist;
    public Album(String title, Artist artist) {
        this.title = title;
        this.artist = artist.getName();
    }
    public String getTitle() {
        return title;
    }
    public void addSong(Song song) {
        // Check if song is composed by the same artist
        if(!songs.isEmpty())
            if(songs.getLast().getArtists().contains(artist))
                return;

        songs.add(song);
    }
    public void removeSong(Song song) {
        songs.remove(song);
    }
    public void listSongs() {
        System.out.println("Songs in the album '" + title + "':");
        for (Song song : songs) {
            System.out.println("- " + song.getTitle());
        }

    }
}
