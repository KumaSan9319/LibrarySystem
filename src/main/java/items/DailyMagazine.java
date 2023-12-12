package items;

import java.util.Locale;

public class DailyMagazine extends Magazine {

    private int issueNumber;

    public DailyMagazine(String title, String publisher, String publicationDate, String genre,
                         int ageRating, String copyEditor, String issn, int issueNumber) {
        super(title, publisher, publicationDate, genre, ageRating, copyEditor, issn);
        this.issueNumber = issueNumber;
    }

    // Method that prints the values of issn, title, issue number and availability
    @Override
    public String getOverviewItemText() {
        return  "ISSN: " + issn + "\n" +
                "Title: " + title + "\n" +
                "Issue Number: " + issueNumber + "\n" +
                "Available: " + isAvailable + "\n";
    }

    // checking if search input contains any information present in this item
    @Override
    public boolean matchesSearch(String search) {
        String searchTerm = search.toLowerCase();
        return getTitle().toLowerCase(Locale.ROOT).contains(searchTerm) ||
                getGenre().toLowerCase(Locale.ROOT).contains(searchTerm) ||
                this.issn.toLowerCase(Locale.ROOT).contains(searchTerm);
    }

}
