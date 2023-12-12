package items;

import java.util.Locale;

public class MonthlyMagazine extends Magazine {

    private int monthNumber;
    private String appearance;

    public MonthlyMagazine(String title, String publisher, String publicationDate, String genre,
                           int ageRating, String copyEditor, String issn, int monthNumber,
                           String appearance) {
        super(title, publisher, publicationDate, genre, ageRating, copyEditor, issn);
        this.monthNumber = monthNumber;
        this.appearance = appearance;
    }

    // Method that prints the values of issn, title, month number and availability
    @Override
    public String getOverviewItemText() {
        return  "ISSN: " + issn + "\n" +
                "Title: " + title + "\n" +
                "Month Number: " + monthNumber + "\n" +
                "Available: " + isAvailable + "\n";
    }

    // checking if search input contains any information present in this item
    @Override
    public boolean matchesSearch(String search) {
        String searchTerm = search.toLowerCase();
        return getTitle().toLowerCase(Locale.ROOT).contains(searchTerm) ||
                getGenre().toLowerCase(Locale.ROOT).contains(searchTerm) ||
                this.appearance.toLowerCase(Locale.ROOT).contains(searchTerm) ||
                this.issn.toLowerCase(Locale.ROOT).contains(searchTerm);
    }

}
