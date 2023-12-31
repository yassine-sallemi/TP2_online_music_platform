public class FreeUser extends User {
    public FreeUser(String name) {
        this.name = name;
    }

    public void listen(Song song) {
        System.out.print(name + " is listening to ");
        song.playSong();
    }
    public void addToFavouritePlaylist(Song song) {
        System.out.println(name + " is not a Premium User, can't add the song to favourite playlist.");
    }

    public void showFavouritePlaylist() {
        System.out.println(name + " is not a Premium User, no favourite playlist to show.");

    }
}
