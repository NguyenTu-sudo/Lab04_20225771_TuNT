package hust.soict.dsai.aims.media;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    // Constructor
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
 @Override
    public boolean equals(Object obj) {
        // Nếu so sánh với chính nó
        if (this == obj) {
            return true;
        }

        // Nếu đối tượng truyền vào là null hoặc không phải là kiểu Media
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Ép kiểu đối tượng truyền vào thành Media
        Media otherMedia = (Media) obj;

        // Kiểm tra tiêu đề của Media
        return this.title != null && this.title.equals(otherMedia.title);
    }

	// Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
