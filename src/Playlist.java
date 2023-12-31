import java.util.ArrayList;
import java.util.Collections;

public class Playlist {
    private User user;
    private ArrayList<Song> playlist = new ArrayList<>();;

    public Playlist(User user) {
        this.user = user;
        if(!(user instanceof PremiumUser)){
            System.out.println(user.getName() + " is not a Premium User, can't create a custom playlist.");
        }
    }

    public void addSong(Song song) {
        if(!(user instanceof PremiumUser)){
            System.out.println("Invalid action.");
            return;
        }
        playlist.add(song);
    }

    public void removeSong(Song song) {
        if(!(user instanceof PremiumUser)){
            System.out.println("Invalid action.");
            return;
        }
        playlist.remove(song);
    }

    public void shuffleSongs() {
        if(!(user instanceof PremiumUser)){
            System.out.println("Invalid action.");
            return;
        }
        Collections.shuffle(playlist);
    }

    public void displayPlaylist() {
        if(!(user instanceof PremiumUser)){
            System.out.println("Invalid action.");
            return;
        }
        if(playlist.isEmpty()){
            System.out.println("This playlist of " + user.getName() + " is still empty!");
            return;
        }
        System.out.println("Playlist of " + user.getName());
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ". " + playlist.get(i).getTitle() + " by:");
            for(String artistName : playlist.get(i).getArtists())
                System.out.println("\t- " + artistName);
        }
    }
}
