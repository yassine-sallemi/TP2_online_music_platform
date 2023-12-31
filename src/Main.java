public class Main {
    public static void main(String[] args) {

        // Every song can be composed by many artists
        // A premium user can have either: favourite playlist, custom playlists, or both
        // A free user can only listen to songs

        Artist artist1 = new Artist("Artist 1");
        Artist artist2 = new Artist("Artist 2");
        Song song1 = new Song("Song 1", 180, new Artist[]{artist1});
        Song song2 = new Song("Song 2", 210, new Artist[]{artist2});
        Song song3 = new Song("Song 3", 195, new Artist[]{artist1,artist2});

        Album album1 = new Album("Album 1", artist1);

        album1.addSong(song1);
        album1.addSong(song2);

        Album album2 = new Album("Album 2", artist2);
        album2.addSong(song3);

        artist1.addAlbum(album1);
        artist1.addAlbum(album2);

        album2.listSongs();

        User freeUser = new FreeUser("Fa9ri");
        freeUser.addToFavouritePlaylist(song1);
        freeUser.addToFavouritePlaylist(song3);
        freeUser.showFavouritePlaylist();
        freeUser.listen(song2);

        Playlist playlist1 = new Playlist(freeUser);
        playlist1.displayPlaylist();
        playlist1.addSong(song1);

        User premiumUser = new PremiumUser("El patron");
        premiumUser.addToFavouritePlaylist(song1);
        premiumUser.addToFavouritePlaylist(song3);
        premiumUser.showFavouritePlaylist();

        Playlist playlist2 = new Playlist(premiumUser);
        playlist2.displayPlaylist();
        playlist2.addSong(song1);
        playlist2.removeSong(song2);
        playlist2.addSong(song2);
        playlist2.addSong(song3);
        playlist2.shuffleSongs();
        playlist2.displayPlaylist();
    }
}