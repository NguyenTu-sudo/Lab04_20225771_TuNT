package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<>();

    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String author) {
        if (!authors.contains(author)) {
            authors.add(author);
        } else {
            System.out.println("Author already exists in the list.");
        }
    }

    public void removeAuthor(String author) {
        if (authors.contains(author)) {
            authors.remove(author);
        } else {
            System.out.println("Author not found in the list.");
        }
    }

//Hiển thị thông tin chi tiết của sách
public void displayDetails() {
    System.out.println("Book ID: " + getId());
    System.out.println("Title: " + getTitle());
    System.out.println("Category: " + getCategory());
    System.out.println("Cost: $" + getCost());
    System.out.println("Authors: " + (authors.isEmpty() ? "No authors listed." : String.join(", ", authors)));
    System.out.println("Content Length: " + getTitle().split("\\s+").length + " tokens.");
}
@Override
public String toString() {
    return "Book [Title: " + this.title + ", Category: " + this.category + 
           ", Cost: " + this.cost + ", Authors: " + String.join(", ", authors) + "]";
}

}