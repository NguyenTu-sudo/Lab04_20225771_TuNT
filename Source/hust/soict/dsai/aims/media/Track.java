package hust.soict.dsai.aims.media;

public class Track {
    private String title;
    private int length;

    // Constructor
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    // Override equals để hỗ trợ so sánh track
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Track) {
            Track other = (Track) obj;
            return this.title.equals(other.title) && this.length == other.length;
        }
        return false;
    }
    @Override
    public boolean equals(Object obj) {
        // Nếu so sánh với chính nó
        if (this == obj) {
            return true;
        }

        // Nếu đối tượng truyền vào là null hoặc không phải là kiểu Track
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Ép kiểu đối tượng truyền vào thành Track
        Track otherTrack = (Track) obj;

        // Kiểm tra tiêu đề và độ dài của Track
        return this.title != null && this.title.equals(otherTrack.title) &&
               this.length == otherTrack.length;
    }

}
