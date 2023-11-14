package items;

public abstract class Game extends LibraryItem {

    // Extended blueprint for more specialized, specifically games, classes
    protected String amountOfPlayers;
    protected String ean;

    public Game(String title, String publisher, String publicationDate, String genre,
                int ageRating, String amountOfPlayers, String ean) {
        super(title, publisher, publicationDate, genre, ageRating);
        this.amountOfPlayers = amountOfPlayers;
        this.ean = ean;
    }

}
