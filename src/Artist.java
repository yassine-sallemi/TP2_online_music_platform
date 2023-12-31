import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Album> albums = new ArrayList<>();

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void deleteAlbum(Album album) {
        albums.remove(album);
    }

    public void listAlbums() {
        System.out.println("Albums by " + name + ":");
        for (Album album : albums) {
            System.out.println("- " + album.getTitle());
        }
    }
}
