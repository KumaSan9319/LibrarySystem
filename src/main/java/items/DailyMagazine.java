package items;

public class DailyMagazine extends Magazine {

    private int issueNumber;

    public DailyMagazine(String title, String publisher, String publicationDate, String genre,
                         int ageRating, String copyEditor, String issn, int issueNumber) {
        super(title, publisher, publicationDate, genre, ageRating, copyEditor, issn);
        this.issueNumber = issueNumber;
    }

    @Override
    public String getOverviewItemText() {
        return  "ISSN: " + issn + "\n" +
                "Title: " + title + "\n" +
                "Issue Number: " + issueNumber + "\n" +
                "Available: " + isAvailable + "\n";
    }
}
