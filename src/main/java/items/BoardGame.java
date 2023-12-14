package items;

import java.util.Locale;

public class BoardGame extends Game implements java.util.Comparator, Searchable {

    private String designer;

    public BoardGame(String title, String publisher, String publicationDate, String genre,
                     int ageRating, String amountOfPlayers, String ean, String designer) {
        super(title, publisher, publicationDate, genre, ageRating, amountOfPlayers, ean);
        this.designer = designer;
    }

    // Method that prints the values of ean, title, designer, year of publication and availability
    @Override
    public String getOverviewItemText() {
        return  "EAN: " + ean + "\n" +
                "Title: " + title + "\n" +
                "Designer: " + designer + "\n" +
                "Year of Publication: " + getYearOfPublication() + "\n" +
                "Available: " + isAvailable + "\n";
    }

    // checking if search input contains any information present in this item
    @Override
    public boolean matchesSearch(String search) {
        String searchTerm = search.toLowerCase();
        return getTitle().toLowerCase(Locale.ROOT).contains(searchTerm) ||
                getGenre().toLowerCase(Locale.ROOT).contains(searchTerm) ||
                this.designer.toLowerCase(Locale.ROOT).contains(searchTerm) ||
                this.ean.toLowerCase(Locale.ROOT).contains(searchTerm);
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
