// hust.soict.dsai.aims.disc.java
package hust.soict.dsai.aims.disc;

public class DVD {
    private String id;
    private String title;
    private String category;
    private double cost;
    private String director;
    private int length;
    private static int nbDigitalVideoDiscs = 0;

    public DVD(String id, String title, String category, double cost, String director, int length) {
    	nbDigitalVideoDiscs++; 
        this.id = "hust.soict.dsai.aims.disc" + nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.length = length;
    }

    public DVD(String oldTitle, String string, String string2, int i, float f) {
        this.title = oldTitle;
        this.id = "Unknown";
        this.category = "Unknown"; 
        this.cost = 0.0; 
        this.director = "Unknown";
        this.length = 0;
    }
    //lab04
    public class DigitalVideoDisc extends Disc {
        // Constructor
        public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
            super(id, title, category, cost, length, director);
        }
        public void displayDetails() {
            System.out.println("DVD Title: " + getTitle());
            System.out.println("Category: " + getCategory());
            System.out.println("Director: " + getDirector());
            System.out.println("DVD Length: " + getLength() + " minutes.");
            System.out.println("Cost: $" + getCost());
        }
    }
    @Override
public String toString() {
    return "DVD [Title: " + this.title + ", Category: " + this.category + 
           ", Director: " + this.director + ", Length: " + this.length + " minutes, Cost: " + this.cost + "]";
}

//
    //Lab3
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
    
    public String toString() {
        return String.format("hust.soict.dsai.aims.disc - %s - %s - %s - %d: %.2f $", 
            title, category, director, length, cost);
    }

	public void play() {
        if (this.length > 0) {
            System.out.println("Playing hust.soict.dsai.aims.disc: " + this.title);
            System.out.println("hust.soict.dsai.aims.disc length: " + this.length);
        } else {
            System.out.println("hust.soict.dsai.aims.disc cannot be played");
        }
    }

    public boolean canPlay() {
        return this.length > 0;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title2) {
        this.title = title2;
    }

    public String getCategory() {
        return category;
    }

    public double getCost() {
        return cost;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }
}
