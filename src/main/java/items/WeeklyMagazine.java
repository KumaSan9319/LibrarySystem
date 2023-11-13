package items;

public class WeeklyMagazine extends Magazine {

    private int weekNumber;

    public WeeklyMagazine(String title, String publisher, String publicationDate, String genre,
                          int ageRating, String copyEditor, String issn, int weekNumber) {
        super(title, publisher, publicationDate, genre, ageRating, copyEditor, issn);
        this.weekNumber = weekNumber;
    }

    @Override
    public String getOverviewItemText() {
        return  "ISSN: " + issn + "\n" +
                "Title: " + title + "\n" +
                "Week Number: " + weekNumber + "\n" +
                "Available: " + isAvailable + "\n";
    }

}
