package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    // Constructor
    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
    }

    // Getter cho nghệ sĩ
    public String getArtist() {
        return artist;
    }

    // Phương thức thêm track
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists: " + track.getTitle());
        } else {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        }
    }

    // Phương thức xóa track
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("Track not found: " + track.getTitle());
        }
    }

    // Phương thức tính tổng độ dài
    @Override
    public int getLength() {
        return tracks.stream().mapMulti(Track::getLength).sum();
    }

    // Hiển thị thông tin chi tiết
    public void displayDetails() {
        System.out.println("CD Title: " + getTitle());
        System.out.println("Category: " + getCategory());
        System.out.println("Director: " + getDirector());
        System.out.println("Artist: " + artist);
        System.out.println("CD Length: " + getLength() + " minutes.");
        System.out.println("Cost: $" + getCost());
        System.out.println("Tracks:");
        for (Track track : tracks) {
            System.out.println("- " + track.getTitle() + " (" + track.getLength() + " minutes)");
        }
    }
}
