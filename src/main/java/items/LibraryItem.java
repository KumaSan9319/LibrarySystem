package items;

public abstract class LibraryItem {

    // Main blueprint class with instance fields and methods that all other classes will share
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

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public String getGenre() {
        return genre;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to extract year of publication from full publication date
    // so those don't need to be declared as separate fields
    public int getYearOfPublication() {
        String yearOfPublication = this.publicationDate.substring(this.publicationDate.length() - 4);
        return Integer.parseInt(yearOfPublication);
    }

    // Method to check what type of class the current object is. Mostly used for sorting purposes
    public String getType() {
        return this.getClass().getSimpleName();
    }

    // Abstract for an effective toString() method for all child classes
    public abstract String getOverviewItemText();

    // Abstract method for checking if search input matches targeted instance fields
    public abstract boolean matchesSearch(String search);

    // Checking availability for borrowing and returning items to the library
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

}
