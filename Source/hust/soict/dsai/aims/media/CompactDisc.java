package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        super(id, title, category, cost, length, director);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists: " + track.getTitle());
        } else {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("Track not found: " + track.getTitle());
        }
    }

    @Override
    public int getLength() {
        return tracks.stream().mapToInt(Track::getLength).sum();
    }

    @Override
    public void play() {
        if (getLength() > 0) {
            System.out.println("Đang phát CD: " + this.getTitle());
            System.out.println("Nghệ sĩ: " + this.getArtist());
            System.out.println("Tổng thời lượng CD: " + this.getLength() + " minutes.");
            for (Track track : tracks) {
                track.play(); // Gọi phương thức play() của từng track
            }
        } else {
            System.out.println("Không thể phát CD vì độ dài không hợp lệ.");
        }
    }
    @Override
public String toString() {
    return "Book [Title: " + this.title + ", Category: " + this.category + 
           ", Cost: " + this.cost + ", Authors: " + String.join(", ", authors) + "]";
}

}
