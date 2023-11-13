package items;

public class Book extends LibraryItem {

    private String author;
    private String copyEditor;
    private String isbn;

    public Book(String title, String publisher, String publicationDate, String genre,
                int ageRating, String author, String copyEditor, String isbn) {
        super(title, publisher, publicationDate, genre, ageRating);
        this.author = author;
        this.copyEditor = copyEditor;
        this.isbn = isbn;
    }

    @Override
    public String getOverviewItemText() {
        return  "ISBN: " + isbn + "\n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Year of Publication: " + getYearOfPublication() + "\n" +
                "Available: " + isAvailable + "\n";
    }

}
