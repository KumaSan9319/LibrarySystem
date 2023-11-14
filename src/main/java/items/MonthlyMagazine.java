package items;

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

}
