package LAB2;

public class Book {
    private String author;
    private String title;
    private String Main_genre;
    private String additional_genre;
    private int year;

    public Book(String author, String title, String Main_genre, String additional_genre, int year) {
        this.author = author;
        this.title = title;
        this.Main_genre = Main_genre;
        this.additional_genre = additional_genre;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMain_genre() {
        return Main_genre;
    }

    public void setMain_genre(String main_genre) {
        Main_genre = main_genre;
    }

    public String getAdditional_genre() {
        return additional_genre;
    }

    public void setAdditional_genre(String additional_genre) {
        this.additional_genre = additional_genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
