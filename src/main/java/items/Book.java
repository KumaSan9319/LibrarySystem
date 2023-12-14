package items;

import java.util.Locale;

public class Book extends LibraryItem implements java.util.Comparator, Searchable {

    // Book extends LibraryItem directly because it didn't have as much in common with
    // the other concrete classes
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

    // Method that prints the values of isbn, title, author, year of publication and availability
    @Override
    public String getOverviewItemText() {
        return  "ISBN: " + isbn + "\n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "Year of Publication: " + getYearOfPublication() + "\n" +
                "Available: " + isAvailable + "\n";
    }

    // checking if search input contains any information present in this item
    @Override
    public boolean matchesSearch(String search) {
        String searchTerm = search.toLowerCase();
        return getTitle().toLowerCase(Locale.ROOT).contains(searchTerm) ||
               getGenre().toLowerCase(Locale.ROOT).contains(searchTerm) ||
               this.author.toLowerCase(Locale.ROOT).contains(searchTerm) ||
               this.isbn.toLowerCase(Locale.ROOT).contains(searchTerm);
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
