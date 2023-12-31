import java.util.ArrayList;

public class PremiumUser extends User {
    public PremiumUser(String name) {
        this.name = name;
    }
    private ArrayList<Song> favouritePlaylist = new ArrayList<>();
    public void listen(Song song) {
        System.out.println(name + "is listening to: " + song.getTitle() + " by:");
        for(String artistName : song.getArtists())
            System.out.println("\t- " + artistName);
    }

    public void addToFavouritePlaylist(Song song) {
        favouritePlaylist.add(song);
        System.out.println("Added " + song.getTitle() + " to the favourite playlist.");
    }

    public void showFavouritePlaylist() {
        if(favouritePlaylist.isEmpty()){
            System.out.println("Favourite playlist of " + name + " is still empty!");
            return;
        }
        System.out.println("Favourite playlist for " + name + ":");
        for (Song song : favouritePlaylist) {
            System.out.println("- " + song.getTitle() + " by:");
            for(String artistName : song.getArtists())
                System.out.println("\t- " + artistName);
        }
    }
}
