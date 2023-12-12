package items;

import java.util.Locale;

public class WeeklyMagazine extends Magazine {

    private int weekNumber;

    public WeeklyMagazine(String title, String publisher, String publicationDate, String genre,
                          int ageRating, String copyEditor, String issn, int weekNumber) {
        super(title, publisher, publicationDate, genre, ageRating, copyEditor, issn);
        this.weekNumber = weekNumber;
    }

    // Method that prints the values of issn, title, week number and availability
    @Override
    public String getOverviewItemText() {
        return  "ISSN: " + issn + "\n" +
                "Title: " + title + "\n" +
                "Week Number: " + weekNumber + "\n" +
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
