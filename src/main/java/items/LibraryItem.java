package items;

public abstract class LibraryItem {

    protected String title;
    protected String publisher;
    protected String publicationDate;
    protected String genre;
    protected int ageRating;
    protected boolean isAvailable = true;

    public LibraryItem(String title, String publisher, String publicationDate,
                       String genre, int ageRating) {
        this.title = title;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.genre = genre;
        this.ageRating = ageRating;
    }

    public void borrowItem() {
        if (this.isAvailable) {
            this.isAvailable = false;
        } else {
            System.out.println("Item unavailable");
        }
    }

    public void returnItem() {
        if (!this.isAvailable) {
            this.isAvailable = true;
        }
    }

    public int getYearOfPublication() {
        String yearOfPublication = this.publicationDate.substring(this.publicationDate.length() - 4);
        return Integer.parseInt(yearOfPublication);
    }

    public abstract String getOverviewItemText();

}
