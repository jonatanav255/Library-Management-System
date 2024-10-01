package Book;

public class Book {

    private String Title;
    private String Author;
    private int Year;
    private boolean isAvailable;

    public Book(String title, String author, int year, boolean isAvailable) {
        this.Title = title;
        this.Author = author;
        this.Year = year;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        this.Year = year;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
