package items;

public class VideoGame extends Game {

    private String studio;

    public VideoGame(String title, String publisher, String publicationDate, String genre,
                     int ageRating, String amountOfPlayers, String ean, String studio) {
        super(title, publisher, publicationDate, genre, ageRating, amountOfPlayers, ean);
        this.studio = studio;
    }

    // Method that prints the values of ean, title, studio, year of publication and availability
    @Override
    public String getOverviewItemText() {
        return  "EAN: " + ean + "\n" +
                "Title: " + title + "\n" +
                "Studio: " + studio + "\n" +
                "Year of Publication: " + getYearOfPublication() + "\n" +
                "Available: " + isAvailable + "\n";
    }

}
