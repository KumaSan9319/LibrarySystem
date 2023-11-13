package items;

public class BoardGame extends Game {

    private String designer;

    public BoardGame(String title, String publisher, String publicationDate, String genre,
                     int ageRating, String amountOfPlayers, String ean, String designer) {
        super(title, publisher, publicationDate, genre, ageRating, amountOfPlayers, ean);
        this.designer = designer;
    }

    @Override
    public String getOverviewItemText() {
        return  "EAN: " + ean + "\n" +
                "Title: " + title + "\n" +
                "Designer: " + designer + "\n" +
                "Year of Publication: " + getYearOfPublication() + "\n" +
                "Available: " + isAvailable + "\n";
    }

}
