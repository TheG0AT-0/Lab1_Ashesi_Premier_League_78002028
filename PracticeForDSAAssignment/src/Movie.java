public class Movie {
    private String title;
    private int releaseYear;
    private double rating;

    // constructor to set all attributes when a Movie object is created
    public Movie(String title, int releaseYear, double rating) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    // getters to read each attribute from outside the class
    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    // controls how a Movie looks when printed
    public String toString() {
        return "Title: " + title + " | Year: " + releaseYear + " | Rating: " + rating;
    }
}